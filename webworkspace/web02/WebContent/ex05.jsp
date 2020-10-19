<!--page directive 위치: 문서 중 어디에 와도 동작하지만 일반적으로 제일 위에 씀-->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!--import하는 다른 방법들. page 줄에 있는 것들도 다 따로 써도 됨-->
<%@ page import="java.util.Date, java.util.Scanner" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web02\ex05</title>
</head>
<body>
<h1>request 내장객체</h1>
<%
	out.println(request);
	//org.apache.catalina.connector.RequestFacade@348be02e 
	out.println(request.getRequestURL());//http://192.168.0.193:8080/web02/ex05.jsp
	//URL : 요청한 페이지 정보
	out.println("<br>");
	out.println(request.getProtocol());//HTTP/1.1 
	out.println("<br>");
	out.println(request.getServerName());//192.168.0.193  Server 이름
	out.println("<br>");
	out.println(request.getServerPort());//8080  Server의 port 정보
	out.println("<br>");
	out.println(request.getRemoteAddr());//0:0:0:0:0:0:0:1  내 ip로 접근하면 192.168.0.193
	out.println("<br>");
	out.println(request.getRemotePort());//51429  Client의 port정보
	out.println("<br>");
	out.println(request.getContextPath());
	//web02  우리는 Context 따로 지정 안해서 경로나옴.
	//context 경로 바꿀 수 있음. Service > Tomcat 더블클릭 > Module 에서 변경
	out.println("<br>");
	out.println(request.getMethod());//GET 방식 사용 중. 다른 것도 더 배울 것.
	out.println("<br>");
	out.println(request.getRequestURI());//web02/ex05.jsp  서버가 답하는 페이지
%>
</body>
</html>