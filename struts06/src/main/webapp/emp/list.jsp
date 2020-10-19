<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/list.jsp</title>
</head>
<body>
	<h1>EMP List Page</h1>
	<table>
		<tr>
			<th>SABUN</th>
			<th>NAME</th>
			<th>SUB</th>
			<th>NALJA</th>
			<th>PAY</th>
		</tr>
		<c:forEach items="${list }" var="bean">
			<tr>
				<th><a href="detail.action?sabun=${bean.sabun }">${bean.sabun }</a></th>
				<th><a href="detail.action?sabun=${bean.sabun }">${bean.name }</a></th>
				<th><a href="detail.action?sabun=${bean.sabun }">${bean.sub }</a></th>
				<th><a href="detail.action?sabun=${bean.sabun }">${bean.nalja }</a></th>
				<th><a href="detail.action?sabun=${bean.sabun }"><fmt:formatNumber value="${bean.pay }" pattern="$#,###"/></a></th>
			</tr>
		</c:forEach>
	</table>
	<a href="add.action">Add an EMP</a>
</body>
</html>