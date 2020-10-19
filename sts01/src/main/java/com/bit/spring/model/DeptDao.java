package com.bit.spring.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.spring.model.entity.DeptVo;

public interface DeptDao {

	List<DeptVo> selectAll() throws SQLException;

}