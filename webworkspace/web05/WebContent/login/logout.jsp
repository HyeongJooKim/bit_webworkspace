<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web05/login/logout</title>
</head>
<body>

<%@ include file="../template/header.jspf" %>
<%@ include file="../template/menu.jspf" %>
<%@ include file="../template/footer.jspf" %>
<%
	session.invalidate();//로그아웃
	response.sendRedirect("out.jsp");
	//session 객체를 갱신하는 것
%>
</body>
</html>