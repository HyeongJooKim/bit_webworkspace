<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.dept.DeptCRUD"%>
<%@page import="com.bit.dept.DeptDto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web08/dept/add</title>
</head>
<body>
<% String path="../"; %>
<jsp:include page="/template/header.jsp">
	<jsp:param value="<%=path %>" name="path"/>
</jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value="<%=path %>" name="path"/>
</jsp:include>
			<h1>DEPT01 입력 페이지</h1>
			<form action="insert.jsp">
			<table width=80%>
<!--				<tr>
					<th>번호</th>
					<td><input type="text" name="num"></td>
				</tr> -->
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<th>패스워드</th>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td colspan=2>
						<input type="submit" value="입력">
						<input type="reset" value="취소">
					</td>
				</tr>
			</table>
			</form>
<jsp:include page="./../template/footer.jsp"></jsp:include>
</body>
</html>