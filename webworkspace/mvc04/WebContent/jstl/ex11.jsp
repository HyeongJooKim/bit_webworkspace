<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL etc..</h1>
	<h2>a href - EL 링크방법, param 전달</h2>
	<c:url value="ex03.jsp" var="ex03" />
	<c:url value="ex09.jsp" var="ex09" >
		<c:param name="id" value="4321"/>
	</c:url>
	<ul>
		<li><a href="ex03.jsp">ex03-단순링크</a></li>
		<li><a href='<c:url value="ex03.jsp"/>'>ex03-방법1</a></li>
		<li><a href="${ex03 }">ex03-방법2 var</a></li>
		<li><a href="ex09.jsp?id=1234">ex09</a></li>
<!-- 		이걸 JSTL로 처리하는 방법 세가지 -->
		<li><a href="${ex09 }">ex09-방법3 var, param</a></li>
	</ul>
</body>
</html>