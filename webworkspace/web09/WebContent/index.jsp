<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web09/index</title>
</head>
<body>
	<table width=100% align="center" bgcolor="#FADD3B" >
		<tr>
			<td><img src="img/logo.jpg"></td>
		</tr>
		<tr>
			<td align="center">
				<a href="?title=main">[HOME]</a>
				<a href="?title=intro">[INTRO]</a>
				<a href="?title=emp/list">[EMP]</a>
				<a href="">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
			<%
			String title=request.getParameter("title");
			if(title==null)title="main";
			title+=".jsp";
			%>
			<jsp:include page="<%=title %>"></jsp:include>
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="#FADD3B" style="color:white;">
			비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>
			(주)비트컴퓨터 서초본원<br>
			</td>
		</tr>
	</table>
</body>
</html>