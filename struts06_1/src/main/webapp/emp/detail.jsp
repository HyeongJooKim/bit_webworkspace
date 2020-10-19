<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/detail.jsp</title>
</head>
<body>
	<h1>EMP Detail & Edit</h1>
	<form action="update.action">
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun" id="sabun" value="${bean.sabun }" readonly/>
		</div>
		<div>
			<label for="name">name</label>
			<input type="text" name="name" id="name" value="${bean.name }" />
		</div>
		<div>
			<label for="sub">sub</label>
			<input type="text" name="sub" id="sub"  value="${bean.sub }"/>
		</div>
		<div>
			<label for="nalja">nalja</label>
			<input type="date" name="nalja" id="nalja"  value="${bean.nalja }"/>
		</div>
		<div>
			<label for="pay">pay</label>
			<input type="text" name="pay" id="pay"  value="${bean.pay }"/>
		</div>
		<div>
			  <button>Edit</button>
		</div>	
	  <a href="delete.action?sabun=${bean.sabun }">Delete</button>
	</form>
</body>
</html>