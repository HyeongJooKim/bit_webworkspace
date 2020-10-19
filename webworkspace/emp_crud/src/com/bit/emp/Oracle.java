package com.bit.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Oracle DB�� �����ϱ� ���� Class �����ؼ� ������ �� Class�� �Ẹ��.

public class Oracle {
	/*
	 * ����������(�ڵ� ��Ÿ��) ��
	 * - �̱��� ������ �ڵ� ���
	 */
	private static Connection conn;
	//���� ���� ����
	private Oracle(){
	//��ü ���� ����
	}
	
	public static Connection getConnection(){
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		//close��? �������� ���� ���� �� ��. �����ϱ� ���� �ϳ��� ���鵵�� ���� 
		try {
			if(conn==null || conn.isClosed() ){
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

//	public static void main(String[] args) {
//		Oracle me=new Oracle();
//		System.out.println(Oracle.getConnection()!=null);
//	}
}
