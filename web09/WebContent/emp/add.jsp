<%@page import="com.bit.*, java.sql.*, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web09/emp/add</title>
</head>
<body>
	<h1>입력 페이지</h1>
		<form action="emp/insert.jsp" method="post">
			<table>
				<tr>
					<th>사번</th>
					<td><input type="text" name="sabun"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>금액</th>
					<td><input type="text" name="pay"></td>
				</tr>
				<tr>
					<td colspan=2>
						<input type="submit" value="입력">
						<input type="reset" value="취소">
					</td>
				</tr>
			</table>
		</form>
</body>
</html>