<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>edit.jsp</title>
</head>
<body>
	<h2>Edit page</h2>
	<form action="update.action" method="post">
		<div>
			<label for="deptno">deptno</label>
			<input type="text" name="deptno" id="deptno" value="${bean.deptno }" readonly/>
		</div>
		<div>
			<label for="dname">dname</label>
			<input type="text" name="dname" id="dname" value="${bean.dname}"/>
		</div>
	
		<div>
			<label for="loc">loc</label>
			<input type="text" name="loc" id="loc" value="${bean.loc}"/>
		</div>
		<div>
			<button>Done</button>
		</div>
	</form>
</body>
</html>