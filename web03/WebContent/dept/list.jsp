<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*, java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web03/dept/list</title>
</head>

<table width="100%">
	<tr>
		<td colspan=6><img src="../img/logo.png"></td>
	</tr>
	<tr>
		<td bgcolor=lightgrey></td>
		<td bgcolor=lightgrey width=100 align=center><a href="../index.jsp"> [HOME] </td>
		<td bgcolor=lightgrey width=100 align=center><a href="list.jsp"> [DEPT] </td>
		<td bgcolor=lightgrey width=100 align=center><a href="../emp/list.jsp"> [E M P] </td>
		<td bgcolor=lightgrey width=100 align=center><a href="../login/login.jsp"> [LOGIN] </td>
		<td bgcolor=lightgrey></td>
	</tr>
	<tr>
		<td colspan=6>
		<center>
		<h1>DEPT LIST PAGE</h1>
			<table border=1 width=600>
			<tr>
				<th width=50>DEPTNO</th>
				<th>DNAME</th>
				<th>LOC</th>
				<th width=50>DEL</th>
			</tr>
<%
			String sql="select * from dept order by deptno";
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String driver="oracle.jdbc.driver.OracleDriver";
			String user="scott";
			String password="tiger";
			
			Class.forName(driver);
			Properties info=new Properties();
			info.setProperty("user", user);
			info.setProperty("password", password);

			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			try{
				conn=DriverManager.getConnection(url,info);
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				while(rs.next()){
%>		
				<tr>
					<td><%=rs.getInt(1) %></td>
					<td><%=rs.getString(2) %></td>
					<td><%=rs.getString(3) %></td>
					<td>
					<!-- ���1 ����: post method �����ϹǷ� �ΰ��� ���� ���� �� �ִ�.-->
					<form action="delete.jsp" method="post">
					<input type="hidden" name="deptno" value="<%=rs.getInt(1) %>">			
					<input type="submit" value="����">
					</form>
<!-- ���2 			<a href="delete.jsp"?deptno=<%=rs.getInt(1) %>">[����]</a> -->
					</td>
				</tr>
<%
			}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}
%>
			</table>
			<a href="add.jsp">[�� ��]</a>
		</center>
		</td>
	</tr>
	<tr>
		<td colspan=6></td>
	</tr>
	<tr>
		<td colspan=6 bgcolor=lightgray align=center>
		��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)�� ����ڵ�Ϲ�ȣ : 214-85-24928<br>
(��)��Ʈ��ǻ�� ���ʺ��� ��ǥ�̻� : ������ / ���� : 02-3486-9600 / �ѽ� : 02-6007-1245<br>
����Ǹž� �Ű��ȣ : �� ����-00098ȣ / ����������ȣ����å���� : ������<br>
Copyright (c) ��Ʈķ�� All rights reserved.
		</td>
	</tr>
</table>
</body>
</html>