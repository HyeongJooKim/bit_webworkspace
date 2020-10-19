<%@page import="com.bit.dept.model.Dept04Dto, java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mvc03-list.jsp</title>
<%@ include file="template/head.jspf" %>
<style type="text/css">
#content{}
#content>h2{
	text-align: center;
}
#content>table{
	width: 500px;
	margin: 10px auto;
}
#content>table,
#content>table tr th,
#content>table tr td{
	border-collapse: collapse;
	border: 1px solid grey;
}
#content>h2+a{
	display: inline-block;
	width: 100px;
	height: 30px;
	text-align: center;
	line-height: 30px;
	background-image: linear-gradient(darkgrey,gray,darkgray); 
	border-radius: 20px;
	margin: 0px 250px;
	text-decoration: none;
	font-weight: bold;
	color: white;
}
</style>
<script type="text/javascript">
	$(function(){
	});
</script>
</head>
<body>
<%@ include file="template/header.jspf" %>
<%@ include file="template/menu.jspf" %>
	<h2>DEPT List Page</h2>
	<a href="add.bit">입력</a>
	<table>
		<tr>
			<th>DEPTNO</th>
			<th>DNAME</th>
			<th>LOC</th>
		</tr>
		<c:forEach items="${list }" var="bean">
			<c:url value="detail.bit" var="detail">
				<c:param name="idx" value="${bean.deptno }" />
			</c:url>
			
			<tr>
				<td><a href="${detail }">${bean.deptno }</td>
				<td><a href="${detail }">${bean.dname }</td>
				<td><a href="${detail }">${bean.loc }</td>
			</tr>
		</c:forEach>
	</table>
<%@ include file="template/footer.jspf" %>
</body>
</html>