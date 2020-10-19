<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl/ex12.jsp</title>
</head>
<body>
	<h1>JSTL formatting</h1>
	<c:set value="1000000" var="su"></c:set>
	<p>${su }</p>
	<p><fmt:formatNumber value="${su }" pattern="#,###"></fmt:formatNumber></p>
	<p><fmt:formatNumber value="${su }" pattern="$#,###"></fmt:formatNumber></p>
	<c:set value="<%=new java.util.Date() %>" var="nalja"></c:set>
	<p>${nalja }</p>
	<p><fmt:formatDate value="${nalja }" pattern="YYYY-MM-DD-HH:mm:ss"></fmt:formatDate></p>
<!-- EL과 java는 exclusive, JSTL은 이 둘 중 하나와 함께 쓰게 됨 -->
</body>
</html>