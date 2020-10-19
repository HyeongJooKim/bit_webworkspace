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
<h1>입력페이지</h1>
<%
	String name=request.getParameter("name");
	if(name==null)name="";
%>
<form action="insert.jsp">
	<table>
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" value="<%=name%>"></td>
		</tr>
		<tr>
			<th>금액</th>
			<td><input type="text" name="pay"></td>
		</tr>
		<tr>
			<td colspan=2 align="center">
				<input type="submit" value="입력">
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
</form>
</center>
<%@ include file="../template/footer.jspf" %>
</body>
</html>