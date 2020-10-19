<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, com.bit.model.*" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC02-list.jsp</title>
<link rel="stylesheet" type="text/css" href="css/frame.css"/>
<style type="text/css">
	#contents>table~a{
		display: inline-block;
		width: 150px;
		height: 50px;
		background-image: linear-gradient(darkgray,gray,darkgray);
		border-radius: 25px;
		margin: 0px auto;
		text-decoration: none;
		text-align: center;
		line-height: 50px;
		color: white;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
 		$('table~a').last().click(function(){
 			history.back();
 			return false;
 		});
	});

</script>
</head>
<body>
<div>
	<div id="header">
		<h1>비트교육</h1>
	</div>
	<div id="menu">
		<ul>
			<li><a href="index.bit">HOME</a></li>
			<li><a href="list.bit">EMP</a></li>
			<li><a href="#">DEPT</a></li>
			<li><a href="login.bit">LOGIN</a></li>
		</ul>
	</div>
	<div id="contents">
	<jsp:useBean id="dto" class="com.bit.model.Emp03Dto" scope="request"></jsp:useBean>
<%--<%
 	Emp03Dto bean=(Emp03Dto)request.getAttribute("dto");
%> --%>
		<h2>상세페이지</h2>
		<table>
			<tr>
				<th>사번</th>
<%-- 			<td><%=bean.getSabun() %></td> --%>
				<td><jsp:getProperty property="sabun" name="dto"/></td>
			</tr>
			<tr>
				<th>이름</th>
<%-- 			<td><%=bean.getName() %></td> --%>
				<td><jsp:getProperty property="name" name="dto"/></td>
			</tr>
			<tr>
				<th>제목</th>
<%-- 			<td><%=bean.getSub() %></td> --%>
				<td><jsp:getProperty property="sub" name="dto"/></td>
			</tr>
		</table>
		<a href="edit.bit?idx=<%=dto.getSabun() %>">수정</a>
		<a href="delete.bit?idx=<%=dto.getSabun() %>">삭제</a>
		<a href="">뒤로</a>
	</div>
	<div id="footer">
		<address>COPYRIGHT BY BITACADEMY CO.LTD. ALL RIGHTS RESERVED.<br>HTTP://www.BITacademy.com</address>
	</div>
</div>
</body>
</html>