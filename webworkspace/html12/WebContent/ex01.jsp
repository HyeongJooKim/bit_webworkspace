<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ex01.jsp</title>
</head>
<body>
<%
System.out.println(request.getMethod()+" ex01.jsp 요청함");
String param1=request.getParameter("name");
String param2=request.getParameter("cnt");
if(param2==null)param2="4";
int cnt=Integer.parseInt(param2);
if(param1==null)param1="big";
for(int i=0; i<cnt; i++){%>
	<img alt="" src="img/<%=param1+(i+1)%>.jpg"/>
<%}%>
</body>
</html>