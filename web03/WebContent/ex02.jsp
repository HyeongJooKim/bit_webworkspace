<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web03\ex02</title>
</head>
<body>
<h1>application 내장객체</h1>
<%
	String value=application.getInitParameter("bit");
	out.println(value);
	//서버 닫았다 다시 열어야 실행됨
	Enumeration<String> enu=application.getInitParameterNames();
	while(enu.hasMoreElements()){
		out.println(enu.nextElement());
	}
%>
</body>
</html>