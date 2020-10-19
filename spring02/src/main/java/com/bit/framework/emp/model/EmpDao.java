package com.bit.framework.emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.framework.emp.model.entity.EmpVo;

public class EmpDao {
	private String driver;
	private String url;
	private String user;
	private String password;

	public EmpDao(String driver, String url, String user, String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public List<EmpVo> selectAll() throws SQLException{
		String sql="select * from emp";
		List<EmpVo> list=new ArrayList<>();
		try(
				Connection conn=DriverManager.getConnection(url,user,password);
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

	public void insertOne(String name, String sub, int pay) throws SQLException {
		String sql="insert into emp (name,sub,nalja,pay) values (?,?,now(),?)";
		try(
				Connection conn=DriverManager.getConnection(url,user,password);
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setString(1,name);
			pstmt.setString(2,sub);
			pstmt.setInt(3,pay);
			pstmt.executeUpdate();
		}
	}

	public EmpVo selectOne(int parseInt) throws SQLException {
		String sql="select * from emp where sabun=?";
		try(
				Connection conn=DriverManager.getConnection(url,user,password);
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setInt(1,parseInt);
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

	public int updateOne(int sabun, String name, String sub, int pay) throws SQLException {
		String sql="update emp set name=?,sub=?,pay=? where sabun=?";
		try(
				Connection conn=DriverManager.getConnection(url,user,password);
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setString(1,name);
			pstmt.setString(2,sub);
			pstmt.setInt(3,pay);
			pstmt.setInt(4,sabun);
			return pstmt.executeUpdate();
		}
	}
}