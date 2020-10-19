package com.bit.emp.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.bit.emp.model.entity.EmpVo;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class EmpDao {
	//iBatis does Connection
	//add static to make it singleton

	static SqlMapClient smc;
	//use static instead of Constructor
	static {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			smc=SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (IOException e) {
			System.out.println("Cannot read files");
		}
	}

	public List<EmpVo> selectAll() throws SQLException {
		return smc.queryForList("selectAll");
	}
	
	public void insertOne(EmpVo bean) throws SQLException {
		smc.insert("insertOne",bean);
	}

	public EmpVo selectOne(int sabun) throws SQLException {
		return (EmpVo) smc.queryForObject("selectOne",sabun);
	}

	public int updateOne(EmpVo bean) throws SQLException {
		return smc.update("updateOne",bean);
	}
	
	public int deleteOne(int sabun) throws SQLException {
		return smc.delete("deleteOne",sabun);
	}
}