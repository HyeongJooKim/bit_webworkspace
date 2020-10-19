package com.bit.emp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Emp02Delete {

	public void delete(int sabun){
		String sql="{call emp02delete(?,"+sabun+")}";
		Connection conn=null;
		CallableStatement cstmt=null;
		int result=0;
		try {
			conn=Oracle.getConnection();
			cstmt=conn.prepareCall(sql);//�̰� ���� �� �Ʒ��� ���� ����. ���� �;� ��.
			cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.INTEGER);
			cstmt.execute();
			result=cstmt.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(cstmt!=null)cstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
//	public static void main(String[] args) {
//		Emp02Delete me=new Emp02Delete();
//		me.delete(6666);
//	}
}