package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Dept04Dao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public Dept04Dao() {
		//connection pools api
		//https://tomcat.apache.org/tomcat-7.0-doc/jdbc-pool.html
		try {
//connection pool 더 짧게 쓰면 이렇게
			InitialContext init=new InitialContext();
			javax.sql.DataSource dataSource=(DataSource)init.lookup("java:/comp/env/jdbc/oracle");

//connection pool쓰는 방법
//			InitialContext init=new InitialContext();
//			Context context=(Context)init.lookup("java:/comp/env");
//			//"java:/comp/env" 또는 "java:comp/env"이렇게 정해져 있는 것. 환경에 따라 둘 중 하나 되더라
//			javax.sql.DataSource dataSource=(DataSource) context.lookup("jdbc/oracle");
			
			conn=dataSource.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//기존방법		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
	
	public List<Dept04Dto> selectAll(){
		List<Dept04Dto> list=new ArrayList<Dept04Dto>();
		try {
			conn.setAutoCommit(false);
			//auto commit을 false로 하면 쿼리수행마다 commit 되지는 않게 됨
			//쿼리 문장 두개였다면 쓸모 있음.
			//오토커밋 상황이었으면 쿼리문 하나 수행되고 두번째가 오류나면 첫번 것은 커밋되어 버림. 
			//오토커밋 안해야, 둘 다를 롤백할 수 있음
			//꼭 필요할 때만 사용하면 됨.
			//test로 값 추가하면 인덱스 추가되는 문제 있었을 때 이렇게 했었으면 번호 안늘었음
			pstmt=conn.prepareStatement("select * from dept04");
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(new Dept04Dto(
					rs.getInt("deptno"),
					rs.getString("dname"),
					rs.getString("loc")
				));
			}
			conn.commit();//이렇게 명시적으로 commit 시키고
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				//이렇게 명시적으로 rollback 시켜야 함.
				//단 동일한 객체여야 함. 
				//conn.close();전에 conn.commit();, conn.rollback(); 있어야 함.
				//즉, conn 열고, 닫는 사이에 커밋, 롤백 있어야 함
				//왜냐, conn.close하면 autocommit 되게 되어 있으므로
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
			try {
				conn.setAutoCommit(true);
				//반드시 다시 true로 바꿔줘서 다른 명령수행에 영향 없게 디폴트 값으로 되돌려 놓는다.
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//UI test용 dummy
//		List<Dept04Dto> list=new ArrayList<Dept04Dto>();
//		for(int i=0; i<10; i++){
//			list.add(new Dept04Dto(
//				1000*(i+1),
//				"test"+i,
//				"test loc"+i));
//		}
		return list;
	}
}
