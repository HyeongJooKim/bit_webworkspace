<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web09/ex02</title>
</head>
<body>
	<jsp:useBean id="bean" class="test.Target" scope="request"></jsp:useBean>
	<h1>actionTag<%System.out.println(bean); %></h1>
<!-- 실행하면
주소 http://localhost:8080/web09/ex02.jsp
화면 이동결과test.Target@2ed07ccc
콘솔 test.Target@2ed07ccc
둘이 주소 같음, 즉 같은 객체
client가 ex02을 요청하면 서버가 ex02 내용인 ex03으로 forward해서 
동일 request인 ex02 주소에 내용만 ex03을 보내주고 브라우저는 해석해서 화면에 띄움
forward 할 때는 단순히 명령 코드만 전달하는 것이므로 이미지의 경우 
ex02 이하에 이미지 경로를 붙여버림. 그래서 이미지는 안뜨는 것
주소 안바뀌는 이 특성을 잘 이용해보면? 
 -->
	<jsp:forward page="result/ex03.jsp">
		<jsp:param value="xyz" name="msg"/>
	</jsp:forward>
<!-- forward 하면 파라미터는 전달 잘 되나 이미지는 깨짐.
실행하면 주소창에 본인 주소 (forward한 주소가 아니라)가 나오고
파라미터는 전달되나, 이미지는 깨짐. 
왜? 현재 주소 이하에서 forward 된 주소를 더 붙여서 호출하므로
http://localhost:8080/web09/ex02.jsp 
-->
</body>
</html>