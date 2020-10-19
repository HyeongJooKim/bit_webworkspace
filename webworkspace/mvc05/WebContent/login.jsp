<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login.jsp</title>
<link rel="stylesheet" type="text/css" href="css/header.css" />
</head>
<body>
<%@ include file="template/header.jspf" %>
	<h2>login page</h2>
	<form method="post">
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun" id="sabun"/>
		</div>
		<div>
			<label for="name">name</label>
			<input type="text" name="name" id="name"/>
		</div>
		<div>
			<input type="submit" value="로그인" />
			<input type="reset" value="취소" />
		</div>
	</form>
</body>
</html>