<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web05/emp/add</title>
</head>
<body>
<%@ include file="../template/header.jspf" %>
<%@ include file="../template/menu.jspf" %>
<center>
<h1>�Է�������</h1>
<%
	String name=request.getParameter("name");
	if(name==null)name="";
%>
<form action="insert.jsp">
	<table>
		<tr>
			<th>�̸�</th>
			<td><input type="text" name="name" value="<%=name%>"></td>
		</tr>
		<tr>
			<th>�ݾ�</th>
			<td><input type="text" name="pay"></td>
		</tr>
		<tr>
			<td colspan=2 align="center">
				<input type="submit" value="�Է�">
				<input type="reset" value="���">
			</td>
		</tr>
	</table>
</form>
</center>
<%@ include file="../template/footer.jspf" %>
</body>
</html>