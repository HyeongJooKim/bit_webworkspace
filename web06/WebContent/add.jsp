<%@page import="com.bit.emp.Emp02Insert"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web06/add</title>
</head>
<body>
	<table width=100%>
		<tr>
			<td align="center">
				<img alt="" src="/web06/img/logo.png">
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="darkgray">
				<a href="./" style="color:white;">[HOME]</a>
				<a href="./list.jsp" style="color:white;">[EMP]</a>
				<a href="" style="color:white;">[DEPT]</a>
				<a href="" style="color:white;">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
			<!-- content start -->
			<%
if("POST".equals(request.getMethod())){
	request.setCharacterEncoding("euc-kr");
	//한글 처리를 위해서
	int sabun=Integer.parseInt(request.getParameter("sabun"));
	String name=request.getParameter("name");
	int pay=Integer.parseInt(request.getParameter("pay"));
	
	Emp02Insert emp=new Emp02Insert();
	emp.insert(sabun,name,pay);
	response.sendRedirect("list.jsp");
	return;
}
			
			%>
			<h1 align="center">EMP 입력페이지</h1>
			<form method="post">
			<!-- action="add.jsp" 생략된 셈. 생략하면 자기 자신. method 안쓰면 get 방식 -->
			<table border=1 cellspacing=0 width=80% align="center">
				<tr>
					<th>사번</th>
					<td><input type="text" name="sabun"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>금액</th>
					<td><input type="text" name="pay"></td>
				</tr>
				<tr>
					<th colspan=2>
					<input type="submit" value="입력">
					<input type="reset" value="취소">
					</th>
				</tr>
			</table>	
			</form>
			<!-- content end -->
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="darkgray" style="color:white;">
			비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>
			(주)비트컴퓨터 서초본원<br>
			</td>
		</tr>
	</table>
</body>
</html>