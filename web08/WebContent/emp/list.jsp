<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.emp.EmpCRUD"%>
<%@page import="com.bit.emp.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web08/emp/list</title>
</head>
<body>
	<table border=0 cellspacing=0 width=100% align="center">
		<tr>
			<td bgcolor="#FADD3B">
				<img alt="" src="/web08/img/logo.jpg" width=100>
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="#FADD3B">
				<a href="../index.jsp">[HOME]</a>
				<a href="list.jsp">[EMP]</a>
				<a href="../dept/list.jsp">[DEPT]</a>
				<a href="../login/form.jsp">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
			<!-- content start -->
			<h1>����Ʈ ������</h1>
			<table width=80%>
				<tr>
					<th>���</th>
					<th>�̸�</th>
					<th>��¥</th>
					<th>�ݾ�</th>
				</tr>
				<%
				ArrayList<EmpDto> list=EmpCRUD.list();
				for(int i=0; i<list.size(); i++){
						EmpDto bean=list.get(i);
				%>
				<tr>
					<td><a href="detail.jsp?sabun=<%=bean.getSabun() %>"><%=bean.getSabun() %></a></td>
					<td><%=bean.getName() %></td>
					<td><%=bean.getNalja() %></td>
					<td><%=bean.getPay() %></td>
				</tr>
				<%
				}
				%>
			</table>
			<a href="add.jsp">[�Է�]</a>
			<!-- content end -->
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="#FADD3B" style="color:white;">
			��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)<br>
			(��)��Ʈ��ǻ�� ���ʺ���<br>
			</td>
		</tr>
		
	</table>
</body>
</html>