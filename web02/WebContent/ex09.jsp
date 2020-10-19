<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web02\ex09</title>
</head>
<body>
	<%
	System.out.println(response);
	java.io.OutputStream os=response.getOutputStream();
	os.write("abcd".getBytes());
	os.close();
	%>
</body>
</html>