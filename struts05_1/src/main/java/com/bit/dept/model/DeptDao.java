package com.bit.dept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.bit.dept.model.entity.DeptVo;

public class DeptDao {
	Logger log=Logger.getGlobal();
	private String url="jdbc:mysql://localhost:3306/xe";
	private String user="scott";
	private String password="tiger";
	Connection conn;
	
	public DeptDao() throws SQLException {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
			log.info(conn.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public List<DeptVo> selectAll(){
		List<DeptVo> list=new ArrayList<DeptVo>();
		String sql="select * from dept";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				list.add(new DeptVo(
						rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc")));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public void insertOne(DeptVo bean) throws SQLException {
		final String SQL="insert into dept (dname,loc) values (?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1, bean.getDname());
			pstmt.setString(2, bean.getLoc());
			pstmt.executeUpdate();
		}finally {
			if(conn!=null)conn.close();
		}
	}

	public DeptVo selectOne(int deptno) throws SQLException {
		String sql="select * from dept where deptno=?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
				return new DeptVo(
//						rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"));
						rs.getInt(1),rs.getString(2),rs.getString(3));
		} finally{
			if(conn!=null)conn.close();
		}
		return null;
	}

	public void updateOne(DeptVo bean) throws SQLException {
		final String SQL="update dept set dname=?,loc=? where deptno=?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1, bean.getDname());
			pstmt.setString(2, bean.getLoc());
			pstmt.setInt(3, bean.getDeptno());
			pstmt.executeUpdate();
		}finally {
			if(conn!=null)conn.close();
		}
	}

	public void deleteOne(int deptno) throws SQLException {
		final String SQL="delete from dept where deptno=?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(SQL);
			pstmt.setInt(1, deptno);
			pstmt.executeUpdate();
		}finally {
			if(conn!=null)conn.close();
		}
	}
}