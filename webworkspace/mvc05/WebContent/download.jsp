<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>download.jsp</title>
</head>
<body>
<%@ include file="template/header.jspf" %>
	<h1>업로드 완료</h1>
<!-- 일반앵커 -->
<%-- <a href="up/${rename }">${origin }</a> --%>
<!-- 팝업창 -->
<%-- 	<a target="_blank" href="up/${remane }">${origin }</a> --%>
	<a href="download.bit?file=${rename }&org=${origin }">${origin }</a>
</body>
</html>