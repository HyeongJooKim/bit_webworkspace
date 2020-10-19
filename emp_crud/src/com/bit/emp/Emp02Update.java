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
		//���� ����Ǹ� try �ȿ� �ִ� return�� �����ϰ�, �����ϸ� �����.
	}
//	public static void main(String[] args) {
//		Emp02Update me=new Emp02Update();
//		me.update("ĥĥĥ",7000,7777);
//	}
}
