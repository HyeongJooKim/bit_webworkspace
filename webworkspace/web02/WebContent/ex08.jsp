<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web02\ex08</title>
</head>
<body>
<%
//�Ķ���� �̸� ���ٴ� ���� �Ͽ�, �̸� ���� �˾Ƴ���
java.util.Enumeration <String> names=request.getParameterNames();
while(names.hasMoreElements()){
	System.out.println(names.nextElement());
}

java.util.Map<String, String[]> map=request.getParameterMap();
//�Է� ���� ������(checkbox ó��)�� �Ѿ�� ��쵵 �����Ƿ� �迭�� ��[]
java.util.Set<String> keys=map.keySet();
java.util.Iterator<String> ite=keys.iterator();
while(ite.hasNext()){
//	System.out.println(ite.next());
	String key=ite.next();
	System.out.println(key);
	System.out.println(java.util.Arrays.toString(map.get(key)));
}

java.util.Enumeration en=request.getHeaderNames();
while(en.hasMoreElements()){
	System.out.println(request.getHeader(en.nextElement().toString()));
}

String id=request.getParameter("id");
String pw=request.getParameter("pw");
String[] ra=request.getParameterValues("ra");
%>
<h1>�� �ޱ�</h1>
<p>id:<%=id %></p>
<p>pw:<%=pw %></p>
<p>checkbox:<%=java.util.Arrays.toString(ra) %></p>
</body>
</html>