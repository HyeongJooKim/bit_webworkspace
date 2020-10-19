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
//파라미터 이름 모든다는 가정 하에, 이름 먼저 알아내기
java.util.Enumeration <String> names=request.getParameterNames();
while(names.hasMoreElements()){
	System.out.println(names.nextElement());
}

java.util.Map<String, String[]> map=request.getParameterMap();
//입력 값이 여러개(checkbox 처럼)가 넘어올 경우도 있으므로 배열을 줌[]
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
<h1>값 받기</h1>
<p>id:<%=id %></p>
<p>pw:<%=pw %></p>
<p>checkbox:<%=java.util.Arrays.toString(ra) %></p>
</body>
</html>