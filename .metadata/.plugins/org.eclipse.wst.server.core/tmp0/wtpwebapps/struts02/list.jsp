<%@page import="com.bit.dept.model.entity.DeptVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list.jsp</title>
</head>
<body>
	<h2>List page</h2>
	<table>
		<tr>
			<th>deptno</th>
			<th>dname</th>
			<th>loc</th>
		</tr>
		<%
			java.util.ArrayList<DeptVo> list=null;
			list=(java.util.ArrayList<DeptVo>)request.getAttribute("alist");
			for(DeptVo bean:list){
		%>
		<tr>
			<td><a href="detail.action?deptno=<%=bean.getDeptno()%>"><%=bean.getDeptno()%></a></td>
			<td><a href="detail.action?deptno=<%=bean.getDeptno() %>"><%=bean.getDname() %></a></td>
			<td><a href="detail.action?deptno=<%=bean.getDeptno() %>"><%=bean.getLoc() %></a></td>
		</tr>
		<%} %>
	</table>
	<a href="add.action">Add</a>
</body>
</html>