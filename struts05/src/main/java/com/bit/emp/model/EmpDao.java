package com.bit.emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.dept.model.entity.DeptVo;
import com.bit.emp.model.entity.EmpVo;

public class EmpDao {

	public EmpDao() {}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/xe";
		String user="scott";
		String password="tiger";
		Connection conn=null;
		Class.forName("org.mariadb.jdbc.Driver");
		conn=DriverManager.getConnection(url,user,password);
		return conn;
	}
	
	public List<EmpVo> selectAll() throws ClassNotFoundException, SQLException{
		List<EmpVo> list=new ArrayList<EmpVo>();
		String sql="select * from emp order by sabun";
		try (
				Connection conn=getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				){
			while(rs.next())
				list.add(new EmpVo(
						rs.getInt("sabun")
						,rs.getString("name")
						,rs.getString("sub")
						,rs.getDate("nalja")
						,rs.getInt("pay")
						));
		}
		return list;
	}
	
	public EmpVo selectOne(int sabun) throws SQLException, ClassNotFoundException {
		String sql="select * from emp where sabun=?";
		try (
				Connection conn=getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
			){
			pstmt.setInt(1, sabun);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
				return new EmpVo(
						rs.getInt("sabun")
						,rs.getString("name")
						,rs.getString("sub")
						,rs.getDate("nalja")
						,rs.getInt("pay")
						);
		}
		return null;
	}
}