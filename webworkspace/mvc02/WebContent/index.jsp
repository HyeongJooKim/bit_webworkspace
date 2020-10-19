<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, com.bit.model.*" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC02-list.jsp</title>
<link rel="stylesheet" type="text/css" href="css/frame.css"/>
<style type="text/css">

</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
 		$('<img/>').attr('src','img/big3.jpg').insertAfter('#contents>img')
		.after($('<img/>').attr('src','img/big2.jpg'));
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
		<img src="img/big1.jpg"/>
	</div>
	<div id="footer">
		<address>COPYRIGHT BY BITACADEMY CO.LTD. ALL RIGHTS RESERVED.<br>HTTP://www.BITacademy.com</address>
	</div>
</div>
</body>
</html>