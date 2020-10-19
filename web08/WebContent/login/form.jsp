<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web08/login/form</title>
</head>
<body>
<%String path="../"; %>
<%@ include file="../template/header.jspf" %>
<%@ include file="../template/menu.jspf" %>
	<h1>로그인 페이지</h1>
	<form action="result.jsp" method="post">
		<table width=60%>
			<tr>
				<td>id</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>pw</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td colspan=2>
					<input type="submit" value="로그인">				
					<input type="reset" value="취소">				
				</td>
			</tr>
		</table>	
	</form>	
<%@ include file="../template/footer.jspf" %>
</body>
</html>