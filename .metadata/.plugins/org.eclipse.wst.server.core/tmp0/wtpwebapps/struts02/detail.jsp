<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>detail.jsp</title>
</head>
<body>
	<h2>Detail page</h2>
	<div><span>deptno</span><span>${bean.deptno }</span></div>
	<div><span>dname</span><span>${bean.dname }</span></div>
	<div><span>loc</span><span>${bean.loc }</span></div>
	<div>
		<a href="edit.action?deptno=${bean.deptno }">Edit</a>
		<a href="delete.action?deptno=${bean.deptno }">Delete</a>
	</div>
</body>
</html>