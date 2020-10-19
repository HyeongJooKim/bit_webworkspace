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
//			DeptVO [deptno=1, dname=영업, loc=서울]
//			DeptVO [deptno=2, dname=회계, loc=부산]
//			DeptVO [deptno=3, dname=총무, loc=대전]
//			DeptVO [deptno=4, dname=생산, loc=구미]
			
		} catch (SQLException e) {
			System.out.println("exception");
		}
	}
}