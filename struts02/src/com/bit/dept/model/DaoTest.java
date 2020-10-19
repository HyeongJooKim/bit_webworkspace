package com.bit.dept.model;

import java.sql.SQLException;

import com.bit.dept.model.entity.DeptVo;

public class DaoTest {

	public static void main(String[] args) {
		DeptDao dao=null;
		try {
			dao=new DeptDao();
			System.out.println("connection:"+dao.conn);
			System.out.println("success");
//Run as Java Application --> console
//			connection:org.mariadb.jdbc.MariaDbConnection@51521cc1
//			success			
			for(DeptVo bean:dao.selectAll()){
				System.out.println(bean);
			}
//			DeptVO [deptno=1, dname=����, loc=����]
//			DeptVO [deptno=2, dname=ȸ��, loc=�λ�]
//			DeptVO [deptno=3, dname=�ѹ�, loc=����]
//			DeptVO [deptno=4, dname=����, loc=����]
			
		} catch (SQLException e) {
			System.out.println("exception");
		}
	}
}