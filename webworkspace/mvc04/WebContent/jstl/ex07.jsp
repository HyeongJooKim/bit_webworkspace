<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.StringTokenizer" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl/ex07.jsp</title>
</head>
<body>
	<h1>JSTL etc..</h1>
	<%
		String msg="java,DB,web,,,framework,app";
		pageContext.setAttribute("msg", msg);
		StringTokenizer stToken=new StringTokenizer(msg,",");
		while(stToken.hasMoreTokens()){
			System.out.println(stToken.nextToken());
		}
		//빈 문자열은 제외하고 답 나옴.
	%>
	<h2>forTokens</h2>
	<ul>
		<c:forTokens items="${msg }" delims="," var="ele">
			<li>${ele }</li>
		</c:forTokens>
	</ul>
	<div>
		<c:import url="ex06.jsp"/>
<%-- 		<c:import url="https://www.google.com" /> --%>
<!--include처럼 쓸 수 있다. 
소스코드를 그대로 가져와서 입력창같은 것도 내 페이지의 소스인양 쓸 수 있다. 
싱글소스문제 없이 가져올 수도 있다 -->
	</div>
</body>
</html>