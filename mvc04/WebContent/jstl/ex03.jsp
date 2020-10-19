<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl/ex03.jsp</title>
</head>
<body>
	<h1>JSTL</h1>
	<p>Jsp Standard Tag Library</p>
	<p>jstl.jar, standard.jar 라이브러리 추가해야 함</p>
	<p>taglib에 등록해야 c tag 사용가능</p>
	<c:out value="출력"></c:out><br>
	<c:set var="msg" scope="page" value="${null}"></c:set><br>
	<c:set var="msg2" scope="page" value="abcd"></c:set><br>
<!-- scope="page"는 안줘도 디폴트값 -->
	<c:out value="msg"/><br>
	${msg}<br>
	<c:out value="${msg}">대체할 문자열</c:out><br>
	<c:out value="${msg2}">대체할 문자열2</c:out><br>
<!-- 대체할 문자열은 value가 null일때만 사용됨 -->

<%-- <c:out value="<%="msg3" %>"/><br> 이건 오류 --%>
	<c:out value='<%="msg3" %>'>대체문자열2</c:out><br>
<!-- msg2 나옴 이건 오류는 아님 -->

</body>
</html>