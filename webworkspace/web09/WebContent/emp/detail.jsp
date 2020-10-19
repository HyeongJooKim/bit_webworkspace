<%@page import="com.bit.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*,java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web09/emp/detail</title>
</head>
<jsp:useBean id="bean" class="com.bit.EmpDto"></jsp:useBean>
<jsp:setProperty property="sabun" name="bean"/>
<body>
<center>
	<h1><%=request.getParameter("sabun") %>의 상세 페이지</h1>
	<%
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		conn=com.bit.MyOracle.getConnection();
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select * from emp02 where sabun="+bean.getSabun());
		while(rs.next()){
			bean.setName(rs.getString("name"));
			bean.setNalja(rs.getDate("nalja"));
			bean.setPay(rs.getInt("pay"));
		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	%>
	<table>
		<tr>
			<th width=100>사번</th>
			<td><jsp:getProperty property="sabun" name="bean"/></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><jsp:getProperty property="name" name="bean"/></td>
		</tr>
		<tr>
			<th>날짜</th>
			<td><jsp:getProperty property="nalja" name="bean"/></td>
		</tr>
		<tr>
			<th>금액</th>
			<td><jsp:getProperty property="pay" name="bean"/></td>
		</tr>
	</table>
	<a href="?title=emp/edit&sabun=<jsp:getProperty property="sabun" name="bean"/>">[수정]</a>
	<a href="emp/delete.jsp?sabun=<jsp:getProperty property="sabun" name="bean"/>">[삭제]</a>
</center>
</body>
</html>