<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/add.jsp</title>
</head>
<body>
	<h1>EMP List Page</h1>
	<form action="insert.action" method="post">
		<div>
			<label for="name">name</label>
			<input type="text" name="name" id="name" />
		</div>
		<div>
			<label for="sub">sub</label>
			<input type="text" name="sub" id="sub" />
		</div>
		<div>
			<label for="pay">pay</label>
			<input type="text" name="pay" id="pay" />
		</div>
		<div>
			  <button type="submit">Submit</button>
			  <button type="reset">Reset</button>
		</div>	
	</form>
</body>
</html>