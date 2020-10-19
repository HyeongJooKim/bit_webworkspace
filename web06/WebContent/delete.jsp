<%@page import="com.bit.emp.dto.Emp02Bean"%>
<%@page import="com.bit.emp.Emp02Delete"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web06/delete</title>
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
			<!-- post -->
			<%
			if("POST".equals(request.getMethod())){
				int sabun=Integer.parseInt(request.getParameter("sabun"));
				Emp02Delete emp=new Emp02Delete();
				emp.delete(sabun);
				response.sendRedirect("list.jsp");
				return; 
			}
			%>
			<!-- get -->
			<table>
				<tr>
					<td><%=request.getParameter("idx") %>번 사원 정보를 삭제하시겠습니까?</td>
				</tr>
				<tr>
					<td align="center">
						<form method="post">
							<input type="hidden" name="sabun" value="<%=request.getParameter("idx") %>">
							<input type="submit" value="삭제">
						</form>
					</td>
				</tr>
			</table>
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