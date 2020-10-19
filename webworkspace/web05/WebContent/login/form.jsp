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
<h1>로그인</h1>
<form action="result.jsp" method="post">
	<table>
	<%
	System.out.println(session.getAttribute("name"));
	System.out.println(session.getId());
	//접속시마다 랜덤값이 지정됨
	System.out.println(session.getMaxInactiveInterval());
	//1800초, 즉 30분으로 설정되어 있음
	//Server의 web.xml의 608 라인에 설정되어 있음
		
	String param=request.getParameter("err");
	if(param!=null){
	%>
	<tr>
		<td colspan="2" bgcolor="red">id, pw를 다시 확인하세요</td>
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
				<input type="submit" value="로그인">
				<input type="reset" value="취 소">
				<input type="button" value="회원가입">
			</td>
		</tr>
	</table>
</form>
</center>
<%@ include file="../template/footer.jspf" %>
</body>
</html>