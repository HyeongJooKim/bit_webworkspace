<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add.jsp</title>
</head>
<body>
	<h2>Add Page</h2>
	<form action="insert.action" method="post">
		<div>
			<label for="dname">dname</label>
			<input type="text" name="dname" id="dname"/>
		</div>
		<div>
			<label for="loc">loc</label>
			<input type="text" name="loc" id="loc"/>
		</div>
		<div>
			<button>Add</button>
		</div>
	</form>
</body>
</html>