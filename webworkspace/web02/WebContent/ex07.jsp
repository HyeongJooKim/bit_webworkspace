<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web02\ex07</title>
</head>
<body>
<h1>값 전달</h1>
<form action="ex08.jsp" method="get">
	<!--method 지정 안하면 get (브라우저 주소표시줄에 쿼리문 노출됨,
	post로 바꾸면 브라우저 입력창에 입력값 노출 안되고 header에 정보 실려감 -->

	id<input type="text" name="id"><br>
	<!-- textfield 생성 -->
	pw<input type="password" name="pw"><br>
	<!-- textfield 인데 입력하는 값이 dot로 표시됨. 입력문자 가려줌 -->
	hobby
	<input type="checkbox" name="ra" value="item1"><br>
	<input type="checkbox" name="ra" value="item2"><br>
	<input type="checkbox" name="ra" value="item3"><br>
	<input type="submit">
	<!-- 이름 입력 따로 안하니 쿼리전송 이라는 버튼 생성 -->
	<!--화면에 입력란 생기고 입력하면
	http://localhost:8080/web02/ex08.jsp?id=guest&pw=1234 쿼리문 생성됨 -->
</form>
</body>
</html>