package com.bit.emp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

//PL procedure 호출하기

public class Emp02Insert {
		
	public void insert(int sabun, String name, int pay){
		//execute emp02insert(6666,'홍길동',5000) 대신 아래처럼 
		//sql = {call 프로시저명}
		String sql="{call emp02insert("+sabun+",'"+name+"',"+pay+")}";
		Connection conn=null;
		CallableStatement cstmt=null;
		try{
			conn=Oracle.getConnection();
			cstmt=conn.prepareCall(sql);
			cstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(cstmt!=null)cstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
//	public static void main(String[] args) {
//		Emp02Insert me=new Emp02Insert();
//		me.insert(7777, "tester1", 6000);
//		System.out.println("완료");
//	}
}
