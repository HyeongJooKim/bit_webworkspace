<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web09/ex01</title>
</head>
<body>
	<jsp:useBean id="bean" class="test.Target" scope="request"></jsp:useBean>
	<h1>리다이렉트<%System.out.println(bean); %></h1>
<!-- 실행하면
주소 http://localhost:8080/web09/result/ex03.jsp?msg=abcd 
화면 이동결과test.Target@57d2eb1e
콘솔         test.Target@1fd8b35d
둘이 주소가 다름. 다른 객체
<meta http-equiv="refresh">와 같은 기능과 결과
client(browser)가 ex01을 요청하면 우선 서버는 ex01을 출력 (1st cycle끝남)하고
브라우저가 ex01을 띄우려고 보니 그 안에 ex03으로 이동하라는 명령이 있어서 다시 서버에 ex03을 요청하고
서버가 ex03을 보내면 브라우저가 코드를 해석해서 화면에 띄움 (2nd cycle)
 -->
	<%
		response.sendRedirect("result/ex03.jsp?msg=abcd");
	%>
<!-- 실행하면 주소창에 
http://localhost:8080/web09/result/ex03.jsp?msg=abcd 나오고
이미지도 잘 나옴
-->
</body>
</html>