package com.bit.jdbc;

import java.sql.SQLException;
import java.util.Properties;

public class Ex01 {

	public static void main(String[] args) {
		//dept table에 입력하기
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";// 1521:oracle의 listener port. 이 규칙은 oracle이 정한 것. 
//		String url="jdbc:oracle:thin:scott/tiger@127.0.0.1:1521:xe";// 이렇게 user/password 여기에 넣어줘도 됨 
//		oracle 형식: jdbc:oracle:<drivertype>:<user>/<password>@<database>:<listender port>: 
//		MySQL형식: protocol//[hosts][/database][?properties]
		
		String sql="insert into dept values (50, '관리부','서울')"; //cmd에 있던 ; 안해줌
//		String sql="update dept set dname='영업부' where deptno=50"; 
//		String sql="delete from dept where deptno=50"; 
		oracle.jdbc.driver.OracleDriver driver=null;
		driver=new oracle.jdbc.driver.OracleDriver();
		java.sql.Connection conn=null;
		java.util.Properties prop=null;
		java.sql.Statement stmt=null;
		
		prop=new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");		
		
		try {
			conn=java.sql.DriverManager.getConnection(url, prop);//Oracle DB 에 접속하기
			System.out.println("접속성공:"+(conn!=null));
			
			stmt=conn.createStatement();
			int result=stmt.executeUpdate(sql);//결과값이 int임.
			System.out.println("수행성공"+result);
			//cmd 꺼야 되네. 나중엔 또 켜놔도 되네.. 이상항..
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}