<%@page import="com.bit.dept.DeptCRUD"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web08/dept/detail</title>
</head>
<body>
<% String path="../"; %>
<jsp:include page="/template/header.jsp">
	<jsp:param value="<%=path %>" name="path"/>
</jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value="<%=path %>" name="path"/>
</jsp:include>
<jsp:useBean id="bean" class="com.bit.dept.DeptDto"></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>
<%
DeptCRUD crud=new DeptCRUD();
crud.detail(bean);
%>
			<h1><jsp:getProperty property="num" name="bean"/>번의 상세 페이지</h1>
			<table width=80%>
				<tr>
					<th>번호</th>
					<td><jsp:getProperty property="num" name="bean"/></td>
				</tr>
				<tr>
					<th>아이디</th>
					<td><jsp:getProperty property="id" name="bean"/></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><jsp:getProperty property="name" name="bean"/></td>
				</tr>
				<tr>
					<th>레벨</th>
					<td><jsp:getProperty property="lev" name="bean"/></td>
				</tr>
				<tr>
					<td colspan=2>
						<a href="edit.jsp?num=<%=bean.getNum() %>">[수정]</a>
						<a href="delete.jsp">[삭제]</a>
					</td>
				</tr>
			</table>
<jsp:include page="./../template/footer.jsp"></jsp:include>
</body>
</html>