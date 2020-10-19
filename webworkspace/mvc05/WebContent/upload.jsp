<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload.jsp</title>
</head>
<body>
<%@ include file="template/header.jspf" %>
	<h1>파일업로드</h1>
	<form action="upload.bit" method="post" enctype="multipart/form-data">
<!-- 파일을 올리기엔 get방식은 제약이 너무 많아, 반드시 post 방식 써야 함 
enctype="application/x-www-form-urlencoded" : form이 가지고 있는 디폴트값. 
enctype="multipart/form-data" 파일용 으로 바꿔준다.
-->
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun" id="sabun"/>
		</div>
		<div>
			<label for="file1">file1</label>
			<input type="file" name="file1" id="file1"/>
		</div>
		<div>
			<button type="submit">업로드</button>
		</div>
	</form>
</body>
</html>