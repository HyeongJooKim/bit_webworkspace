<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl/ex05.jsp</title>
</head>
<body>
	<h1>JSTL 제어문</h1>
	<h2>조건문</h2>
	<h3>if</h3>
	<%
		boolean tf=true;
		pageContext.setAttribute("tf", tf);
		int su=-1;
		pageContext.setAttribute("su", su);
		//이것도 필요 없이 아래처럼 set 해버리면 됨
	%>
	<c:set value="-10" var="su"></c:set>
	<p>if 하나 뿐임. 빈 곳 없게 조건 잘 짜야 함</p> 
	<c:if test="${tf }">
		<p>참입니다</p>
	</c:if>
	<c:if test="${5<0 }">
		<p>거짓이면 출력안됨</p>
	</c:if>
	<c:if test="${su>0 }">
		<p>${su }은(는) 양수입니다</p>
	</c:if>
	<c:if test="${su==0 }">
		<p>${su }은(는) 0입니다</p>
	</c:if>
	<c:if test="${su<0 }">
		<p>${su }은(는) 음수입니다</p>
	</c:if>
	
	<h3>choose</h3>
	<c:choose>
		<c:when test="${su==1 }">su=1</c:when>
		<c:when test="${su==-1 }">su=-1</c:when>
		<c:when test="${su==0 }">su=0</c:when>
		<c:otherwise>몰라</c:otherwise>
	</c:choose>
	<p>조건 부분에 0,1은 들어가도 인식 못함. 반드시 true, false가 나올 수 있는 조건식만</p>
	
	<h2>반복문</h2>
	<c:forEach begin="5" end="1" var="su2" varStatus="status">
<!-- status라는 객체가 들어있음 
	${status.current} 현재 for문의 해당하는 번호
	${status.index} 0부터의 순서
	${status.count} 1부터의 순서
	${status.first} 첫 번째인지 여부
	${status.last} 마지막인지 여부 계속 : false다가 마지막에만 true
	${status.begin} for문의 시작 번호
	${status.end} for문의 끝 번호
	${status.step} for문의 증가값
-->
		<p>${status.index} 출력 ${su2 }</p>
	</c:forEach>
</body>
</html>