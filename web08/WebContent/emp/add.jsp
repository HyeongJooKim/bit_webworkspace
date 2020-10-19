<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.emp.EmpCRUD"%>
<%@page import="com.bit.emp.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web08/emp/add</title>
</head>
<body>
	<table border=0 cellspacing=0 width=100% align="center">
		<tr>
			<td bgcolor="#FADD3B">
				<img alt="" src="/web08/img/logo.jpg" width=100>
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="#FADD3B">
				<a href="../index.jsp">[HOME]</a>
				<a href="list.jsp">[EMP]</a>
				<a href="../dept/list.jsp">[DEPT]</a>
				<a href="../login/form.jsp">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
			<!-- content start -->
			<h1>입력 페이지</h1>
			<form action="insert.jsp" method="post">
				<table>
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
						<td colspan=2>
							<input type="submit" value="입력">
							<input type="reset" value="취소">
						</td>
					</tr>
				</table>
			</form>
			<!-- content end -->
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