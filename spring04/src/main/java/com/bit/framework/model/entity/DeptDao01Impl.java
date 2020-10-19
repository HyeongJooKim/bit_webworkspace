package com.bit.framework.model.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class DeptDao01Impl implements DeptDao {
	
	JdbcTemplate jdbcTemplate;
	private RowMapper<DeptVo> rowMapper=new RowMapper<DeptVo>(){
		public DeptVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new DeptVo(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"));
		}
	};
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<DeptVo> selectAll() throws SQLException {
		String sql="select * from dept";
		return jdbcTemplate.query(sql, rowMapper);
	}
	public void insertOne(DeptVo bean) throws SQLException {
		String sql="insert into dept (dname,loc) values (?,?)";
		jdbcTemplate.update(sql,new Object[] {bean.getDname(), bean.getLoc()});
	}
	public DeptVo selectOne(int key) throws SQLException {
		String sql="select * from dept where deptno=?";
		return jdbcTemplate.queryForObject(sql,rowMapper,key);
	}
	public int updateOne(DeptVo bean) throws SQLException {
		String sql="update dept set dname=?, loc=? where deptno=?";
		return jdbcTemplate.update(sql,new Object[] {bean.getDname(), bean.getLoc(), bean.getDeptno()});
	}
	public int deleteOne(int key) throws SQLException {
		String sql="delete from dept where deptno=?";
		return jdbcTemplate.update(sql,key);
	}
}