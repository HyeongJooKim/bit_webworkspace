<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web03/emp/detail</title>
</head>
<body>
<table width="100%">
	<tr>
		<td colspan=6><img src="../img/logo.png"></td>
	</tr>
	<tr>
		<td bgcolor=lightgrey></td>
		<td bgcolor=lightgrey width=100 align=center><a href="../index.jsp"> [HOME] </td>
		<td bgcolor=lightgrey width=100 align=center><a href="../dept/list.jsp"> [DEPT] </td>
		<td bgcolor=lightgrey width=100 align=center><a href="list.jsp"> [E M P] </td>
		<td bgcolor=lightgrey width=100 align=center><a href="../login/login.jsp"> [LOGIN] </td>
		<td bgcolor=lightgrey></td>
	</tr>
	<tr>
		<td colspan="6">
		<center>
		<h1>EMP DETAIL PAGE</h1>
		<table bgcolor="#eeeeee" border=0 width=80% cellspacing=0>
		<%
		String empno=request.getParameter("empno");
		String sql="select empno, ename, job, mgr, hiredate, sal, comm,";
		sql+="(select dname from dept where emp.deptno=dept.deptno)";
		sql+="from emp where empno="+empno;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		String user="scott";
		String password="tiger";
		Class.forName(driver);
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			conn=DriverManager.getConnection(url,user, password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				%>
				<tr>
					<td>empno</td>
					<td><%=rs.getString(1) %></td>
				</tr>
				<tr>
					<td>ename</td>
					<td><%=rs.getString(2) %></td>
				</tr>
				<tr>
					<td>job</td>
					<td><%=rs.getString(3) %></td>
				</tr>
				<tr>
					<td>mgr</td>
					<td><%=rs.getString(4) %></td>
				</tr>
				<tr>
					<td>hiredate</td>
					<td><%=rs.getString(5) %></td>
				</tr>
				<tr>
					<td>sal</td>
					<td><%=rs.getString(6) %></td>
				</tr>
				<tr>
					<td>comm</td>
					<td><%=rs.getString(7) %></td>
				</tr>
				<tr>
					<td>dname</td>
					<td><%=rs.getString(8) %></td>
				</tr>
				<tr>
					<td colspan=2 align=center bgcolor="white">
					<a href="edit.jsp?empno=<%=rs.getInt(1) %>"> [수 정]</a>
					<a href=""> [삭 제]</a>
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
			</center>
			</td>
	</tr>
	<tr>
		<td colspan=6 bgcolor=lightgray align=center>
		비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928<br>
(주)비트컴퓨터 서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br>
통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br>
Copyright (c) 비트캠프 All rights reserved.
		</td>
	</tr>
</table>
</body>
</html>