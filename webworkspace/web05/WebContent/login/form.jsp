<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web05/login/form</title>
</head>
<body>
<%@ include file="../template/header.jspf" %>
<%@ include file="../template/menu.jspf" %>
<center>
<h1>�α���</h1>
<form action="result.jsp" method="post">
	<table>
	<%
	System.out.println(session.getAttribute("name"));
	System.out.println(session.getId());
	//���ӽø��� �������� ������
	System.out.println(session.getMaxInactiveInterval());
	//1800��, �� 30������ �����Ǿ� ����
	//Server�� web.xml�� 608 ���ο� �����Ǿ� ����
		
	String param=request.getParameter("err");
	if(param!=null){
	%>
	<tr>
		<td colspan="2" bgcolor="red">id, pw�� �ٽ� Ȯ���ϼ���</td>
	</tr>
	<%} %>
		<tr>
			<th>id</th>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<th>pw</th>
			<td><input type="password" name="pw"></td>
		</tr>
		<tr>
			<td colspan="2" align="center" bgcolor="lightgrey">
				<input type="submit" value="�α���">
				<input type="reset" value="�� ��">
				<input type="button" value="ȸ������">
			</td>
		</tr>
	</table>
</form>
</center>
<%@ include file="../template/footer.jspf" %>
</body>
</html>