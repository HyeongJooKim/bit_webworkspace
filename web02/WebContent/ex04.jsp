<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web02\ex04</title>
</head>
<body>
	<h1 align=center>구구단 출력 <%=new Date() %></h1>
	<table algin=center border=1 width=100%>
		<tr>
			<%
			for(int i=2; i<10; i++){
				out.write("<td>");//문자열이라 출력이 됨. .toCharArray() 가 오버로드되어 수행되는 것
				out.print(i+"단");//
				out.println("</td>");//소스코드에서 줄바꿈해주는 역할. 웹 성능은 동일
			}
			//out (jsp 내장객체) : 웹으로 출력하라.
			%>
		</tr>
		<%
		for(int i=1; i<10; i++){
			out.print("<tr>");
			for(int j=2; j<10; j++){
				out.println("<td>");
				out.print(j+"x"+i+"="+i*j);
				out.println("</td>");
			}
		}
		//소스코드는 이렇게 간단하지만 웹에서 소스보기하면 풀어서 쓰여 있음
		%>
	</table>
</body>
</html>