<!--page directive ��ġ: ���� �� ��� �͵� ���������� �Ϲ������� ���� ���� ��-->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!--import�ϴ� �ٸ� �����. page �ٿ� �ִ� �͵鵵 �� ���� �ᵵ ��-->
<%@ page import="java.util.Date, java.util.Scanner" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web02\ex05</title>
</head>
<body>
<h1>request ���尴ü</h1>
<%
	out.println(request);
	//org.apache.catalina.connector.RequestFacade@348be02e 
	out.println(request.getRequestURL());//http://192.168.0.193:8080/web02/ex05.jsp
	//URL : ��û�� ������ ����
	out.println("<br>");
	out.println(request.getProtocol());//HTTP/1.1 
	out.println("<br>");
	out.println(request.getServerName());//192.168.0.193  Server �̸�
	out.println("<br>");
	out.println(request.getServerPort());//8080  Server�� port ����
	out.println("<br>");
	out.println(request.getRemoteAddr());//0:0:0:0:0:0:0:1  �� ip�� �����ϸ� 192.168.0.193
	out.println("<br>");
	out.println(request.getRemotePort());//51429  Client�� port����
	out.println("<br>");
	out.println(request.getContextPath());
	//web02  �츮�� Context ���� ���� ���ؼ� ��γ���.
	//context ��� �ٲ� �� ����. Service > Tomcat ����Ŭ�� > Module ���� ����
	out.println("<br>");
	out.println(request.getMethod());//GET ��� ��� ��. �ٸ� �͵� �� ��� ��.
	out.println("<br>");
	out.println(request.getRequestURI());//web02/ex05.jsp  ������ ���ϴ� ������
%>
</body>
</html>