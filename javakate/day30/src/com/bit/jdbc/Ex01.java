package com.bit.jdbc;

import java.sql.SQLException;
import java.util.Properties;

public class Ex01 {

	public static void main(String[] args) {
		//dept table�� �Է��ϱ�
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";// 1521:oracle�� listener port. �� ��Ģ�� oracle�� ���� ��. 
//		String url="jdbc:oracle:thin:scott/tiger@127.0.0.1:1521:xe";// �̷��� user/password ���⿡ �־��൵ �� 
//		oracle ����: jdbc:oracle:<drivertype>:<user>/<password>@<database>:<listender port>: 
//		MySQL����: protocol//[hosts][/database][?properties]
		
		String sql="insert into dept values (50, '������','����')"; //cmd�� �ִ� ; ������
//		String sql="update dept set dname='������' where deptno=50"; 
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
			conn=java.sql.DriverManager.getConnection(url, prop);//Oracle DB �� �����ϱ�
			System.out.println("���Ӽ���:"+(conn!=null));
			
			stmt=conn.createStatement();
			int result=stmt.executeUpdate(sql);//������� int��.
			System.out.println("���༺��"+result);
			//cmd ���� �ǳ�. ���߿� �� �ѳ��� �ǳ�.. �̻���..
			
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