package com.bit.spring.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.bit.spring.model.entity.DeptVo;

public class DeptDaoImpl implements DeptDao {
	
	DataSource dataSource;
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}



	@Override
	public List<DeptVo> selectAll() throws SQLException{
		List<DeptVo> list=new ArrayList<DeptVo>();
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement("select * from dept");
				ResultSet rs=pstmt.executeQuery();
				){
			while(rs.next())
				list.add(new DeptVo(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc")));
		}
		return list;
	}
}
