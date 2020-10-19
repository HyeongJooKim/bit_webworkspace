package com.bit.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Oracle DB에 접속하기 위한 Class 생성해서 앞으로 이 Class를 써보자.

public class Oracle {
	/*
	 * 디자인패턴(코딩 스타일) 중
	 * - 싱글톤 패턴의 코딩 방식
	 */
	private static Connection conn;
	//변수 조작 금지
	private Oracle(){
	//객체 생성 금지
	}
	
	public static Connection getConnection(){
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		//close는? 여러개를 열면 오류 날 것. 방지하기 위해 하나만 만들도록 조건 
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
