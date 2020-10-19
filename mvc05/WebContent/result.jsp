<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>result.jsp</title>
<link rel="stylesheet" type="text/css" href="css/header.css" />
</head>
<body>
<%@ include file="template/header.jspf" %>
	<h2>로그인성공</h2>
	<p>${login.name }님 로그인하셨습니다</p>
</body>
</html>