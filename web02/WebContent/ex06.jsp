<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web02\ex06</title>
</head>
<body>
	<h1>get parameter value</h1>
	<p>id:<%=request.getParameter("id") %></p>
	<!--������ ��ܿ� http://192.168.0.193:8080/web02/ex06.jsp?id=abcd  �Է��ϸ� �������� id:abcd ��µ� -->
</body>
</html>