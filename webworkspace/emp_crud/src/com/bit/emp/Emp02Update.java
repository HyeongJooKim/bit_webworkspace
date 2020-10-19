package com.bit.emp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Emp02Update {

	public int update(String name, int pay, int sabun){
		String sql="{call emp02update(?,'"+name+"',"+pay+","+sabun+")}";
		CallableStatement cstmt=null;
		try {
			cstmt=Oracle.getConnection().prepareCall(sql);
			cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.INTEGER);
			cstmt.execute();
			return cstmt.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(cstmt!=null)cstmt.close();
				if(Oracle.getConnection()!=null)Oracle.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
		//정상 종료되면 try 안에 있는 return을 수행하고, 실패하면 여기로.
	}
//	public static void main(String[] args) {
//		Emp02Update me=new Emp02Update();
//		me.update("칠칠칠",7000,7777);
//	}
}
