<%@page import="com.bit.emp.dto.Emp02Bean"%>
<%@page import="com.bit.emp.Emp02Insert"%>
<%@page import="com.bit.emp.Emp02Update"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web06/edit</title>
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
			request.setCharacterEncoding("euc-kr");
			String method=request.getMethod();
			if(method.equals("POST")){
				String param1=request.getParameter("sabun");
				String param2=request.getParameter("name");
				String param3=request.getParameter("pay");
				try{
					int sabun=Integer.parseInt(param1.trim());
					String name=param2.trim();
					int pay=Integer.parseInt(param3.trim());
	
					Emp02Update emp=new Emp02Update();
					int result=emp.update(name, pay, sabun);
					if(result>0) response.sendRedirect("detail.jsp?idx="+sabun);
					else response.sendRedirect("edit.jsp?idx="+sabun);
				}catch(NumberFormatException e){
					response.sendRedirect("edit.jsp?idx="+param1);
				}
				return;
			}
			//여기 이하는 안해도 그만임
			Emp02Bean bean=null;
			if(method.equals("GET")){
				String param=request.getParameter("idx");
				int sabun=Integer.parseInt(param);
				com.bit.emp.Emp02Detail emp=new com.bit.emp.Emp02Detail();
				bean=emp.detail(sabun);
			}			
			%>
			<h1 align="center">EMP 수정페이지</h1>
			<form method="post">
			<table border=1 cellspacing=0 width=80% align="center">
				<tr>
					<th>사번</th>
					<td><input type="text" name="sabun" value="<%=bean.getSabun() %>" readonly="readonly"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" value="<%=bean.getName() %>"></td>
				</tr>
				<tr>
					<th>날짜</th>
					<td><%=bean.getNalja() %></td>
				</tr>
				<tr>
					<th>금액</th>
					<td><input type="text" name="pay" value="<%=bean.getPay() %>"></td>
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