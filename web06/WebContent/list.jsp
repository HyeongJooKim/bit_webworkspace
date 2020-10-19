<%@page import="com.bit.emp.dto.Emp02Bean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web06/list</title>
</head>
<body>
	<table width=100%>
		<tr>
			<td align="center">
				<img alt="" src="/web06/img/logo.png">
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="darkgray">
				<a href="./" style="color:white;">[HOME]</a>
				<a href="./list.jsp" style="color:white;">[EMP]</a>
				<a href="" style="color:white;">[DEPT]</a>
				<a href="" style="color:white;">[LOGIN]</a>
			</td>
			
		</tr>
		<tr>
			<td>
			<!-- content start -->
			<h1 align="center">EMP 목록</h1>
			<form method="post">
			<table border=1 cellspacing=0 width=80% align="center">
				<tr bgcolor="lightgrey">
					<th>사번</th>
					<th>이름</th>
					<th>날짜</th>
					<th>금액</th>
				</tr>
				<%
				com.bit.emp.Emp02List emp=new com.bit.emp.Emp02List();
				java.util.ArrayList<Emp02Bean> list=emp.list();
				for(int i=0; i<list.size(); i++){
					Emp02Bean bean=list.get(i);
				%>
				<tr>
					<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getSabun() %></a></td>
					<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getName() %></a></td>
					<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getNalja() %></a></td>
					<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getPay() %></a></td>
				</tr>
				<%
				}
				%>
			</table>
			</form>
			<center>
			<a href="add.jsp">[입 력]</a>			
			</center>
			<!-- content end -->
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="darkgray" style="color:white;">
			비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>
			(주)비트컴퓨터 서초본원<br>
			</td>
		</tr>
	</table>
</body>
</html>