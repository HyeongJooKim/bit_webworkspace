package com.bit.jdbc;

import java.sql.*;
import java.util.Properties;

public class Ex02 {

	public static void main(String[] args) {

		String sql="select * from dept";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		java.util.Properties prop=null;
		prop=new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");	
		Connection conn=null;
		Statement stmt=null;
		java.sql.ResultSet rs=null; //결과를 set으로 받을 수 있음
		
		oracle.jdbc.driver.OracleDriver driver=null;
		driver=new oracle.jdbc.driver.OracleDriver();
		
		try {
			conn=java.sql.DriverManager.getConnection(url, prop);
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.print(rs.getObject(1)+"\t");
				//컬럼번호. 1부터 시작 자료형 알면 rs.getInt(); getString()도 가능
				System.out.print(rs.getObject(2)+"\t");
				System.out.println(rs.getObject(3)+"\t");
			}			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
