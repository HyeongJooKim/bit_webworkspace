<%@page import="com.bit.emp.dto.Emp02Bean"%>
<%@page import="com.bit.emp.Emp02Insert"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web06/detail</title>
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
			<%
			String param=request.getParameter("idx");
			int sabun=Integer.parseInt(param);
			com.bit.emp.Emp02Detail emp=new com.bit.emp.Emp02Detail();
			Emp02Bean bean=emp.detail(sabun);
			%>
			<h1 align="center">EMP ��������</h1>
			<form method="post">
			<table border=1 cellspacing=0 width=80% align="center">
				<tr>
					<th>���</th>
					<td><%=bean.getSabun() %></td>
				</tr>
				<tr>
					<th>�̸�</th>
					<td><%=bean.getName() %></td>
				</tr>
				<tr>
					<th>��¥</th>
					<td><%=bean.getNalja() %></td>
				</tr>
				<tr>
					<th>�ݾ�</th>
					<td><%=bean.getPay() %></td>
				</tr>
				<tr>
					<th colspan=2>
					<a href="edit.jsp?idx=<%=bean.getSabun() %>">[�� ��]</a>
					<a href="delete.jsp?idx=<%=bean.getSabun() %>">[�� ��]</a>
					</th>
				</tr>
			</table>	
			</form>
			<!-- content end -->
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="darkgray" style="color:white;">
			��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)<br>
			(��)��Ʈ��ǻ�� ���ʺ���<br>
			</td>
		</tr>
	</table>
</body>
</html>