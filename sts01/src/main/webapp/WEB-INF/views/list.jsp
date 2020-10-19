<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="utf-8">
	<title>list.jsp</title>
</head>
<body>
	<h1>List page</h1>
	<table>
		<tr>
			<th>DEPTNO</th>
			<th>DNAME</th>
			<th>LOC</th>
		</tr>
 		<c:forEach items="${list }" var="bean"> 
 		<tr>
 			<td><a href="#">${bean.deptno }</a></td> 
 			<td><a href="#">${bean.dname }</a></td> 
 			<td><a href="#">${bean.loc }</a></td> 
 		</tr> 
 		</c:forEach> 
	</table>

</body>
</html>
