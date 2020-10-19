<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web03\ex01</title>
</head>
<body>
	<h1>pageContext 내장객체</h1>
	<%
	String id=pageContext.getRequest().getParameter("id");
	javax.servlet.jsp.JspWriter myOut=pageContext.getOut();
	myOut.println("id:"+id);
	//http://localhost:8080/web03/ex01.jsp?id=1234 처럼 하면 그 입력한 id=1234 나옴
	%>
</body>
</html>