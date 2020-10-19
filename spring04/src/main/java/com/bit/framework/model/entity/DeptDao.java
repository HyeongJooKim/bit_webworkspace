package com.bit.framework.model.entity;

import java.sql.SQLException;
import java.util.List;

public interface DeptDao {
	List<DeptVo> selectAll() throws SQLException;
	void insertOne(DeptVo bean) throws SQLException;
	DeptVo selectOne(int key) throws SQLException;
	int updateOne(DeptVo bean) throws SQLException;
	int deleteOne(int key) throws SQLException;
}