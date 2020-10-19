package com.bit.emp.model;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.bit.dept.model.entity.DeptVo;
import com.bit.emp.model.entity.EmpVo;

public class EmpDaoTest {

	@Test
	public void testGetConnection() throws ClassNotFoundException, SQLException {
		EmpDao dao=new EmpDao();
		//System.out.println(dao!=null); 대신
//		Assert.assertNotNull(dao);
//		Connection conn=dao.getConnection();
//		Assert.assertNotNull(conn);
		Assert.assertNotNull(dao.getConnection());
	}

	@Test
	public void testSelectAll() throws ClassNotFoundException, SQLException {
		EmpDao dao=new EmpDao();
//		Assert.assertNotNull(dao);
		Assert.assertSame(4,dao.selectAll().size());
	}

	@Test
	public void testSelectOne() throws ClassNotFoundException, SQLException {
		EmpDao dao=new EmpDao();
		EmpVo target=new EmpVo(1,"user1","test1",null,1000);
		Assert.assertEquals(target,dao.selectOne(target.getSabun()));
	}
}
