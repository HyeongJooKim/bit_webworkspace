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
//connection pool �� ª�� ���� �̷���
			InitialContext init=new InitialContext();
			javax.sql.DataSource dataSource=(DataSource)init.lookup("java:/comp/env/jdbc/oracle");

//connection pool���� ���
//			InitialContext init=new InitialContext();
//			Context context=(Context)init.lookup("java:/comp/env");
//			//"java:/comp/env" �Ǵ� "java:comp/env"�̷��� ������ �ִ� ��. ȯ�濡 ���� �� �� �ϳ� �Ǵ���
//			javax.sql.DataSource dataSource=(DataSource) context.lookup("jdbc/oracle");
			
			conn=dataSource.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//�������		
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
			//auto commit�� false�� �ϸ� �������ึ�� commit ������ �ʰ� ��
			//���� ���� �ΰ����ٸ� ���� ����.
			//����Ŀ�� ��Ȳ�̾����� ������ �ϳ� ����ǰ� �ι�°�� �������� ù�� ���� Ŀ�ԵǾ� ����. 
			//����Ŀ�� ���ؾ�, �� �ٸ� �ѹ��� �� ����
			//�� �ʿ��� ���� ����ϸ� ��.
			//test�� �� �߰��ϸ� �ε��� �߰��Ǵ� ���� �־��� �� �̷��� �߾����� ��ȣ �ȴþ���
			pstmt=conn.prepareStatement("select * from dept04");
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(new Dept04Dto(
					rs.getInt("deptno"),
					rs.getString("dname"),
					rs.getString("loc")
				));
			}
			conn.commit();//�̷��� ��������� commit ��Ű��
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				//�̷��� ��������� rollback ���Ѿ� ��.
				//�� ������ ��ü���� ��. 
				//conn.close();���� conn.commit();, conn.rollback(); �־�� ��.
				//��, conn ����, �ݴ� ���̿� Ŀ��, �ѹ� �־�� ��
				//�ֳ�, conn.close�ϸ� autocommit �ǰ� �Ǿ� �����Ƿ�
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
			try {
				conn.setAutoCommit(true);
				//�ݵ�� �ٽ� true�� �ٲ��༭ �ٸ� ��ɼ��࿡ ���� ���� ����Ʈ ������ �ǵ��� ���´�.
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//UI test�� dummy
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
