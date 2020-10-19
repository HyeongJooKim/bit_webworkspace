<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web03\ex03</title>
</head>
<body>
	<h1>page 내장객체</h1>
	<%
		out.println(page==this);// true 나옴
	//page는 내장객체여서 사용자설정으로 쓸 수 없는 이름
	%>
</body>
</html>