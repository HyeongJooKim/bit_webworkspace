<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.emp.EmpCRUD"%>
<%@page import="com.bit.emp.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web08/emp/detail</title>
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
			<h1>상세 페이지</h1>

			<!-- useBean를 통해 객체 생성하는 방식 -->
			<jsp:useBean id="bean" class="com.bit.emp.EmpDto"></jsp:useBean>
			<!-- EmpDto bean=new EmpDto(); 와 같음 -->
			<jsp:setProperty property="sabun" name="bean"/>
			<!-- bean.setSabun(Integer.parseInt(request.getparameter("sabun"))); 과 같음 -->
			<!-- serProperty 안에 value="5555"까지 넣으면 그 값이 가고, value 없으면 받아온 값을 이용하는 것 -->
			<!-- setProperty  안쓰면 그냥 객체만 생성하는 것 -->
			<!-- 이런 식으로 tag 형식을 띄는데 실제로는 java 코드가 돌아가는 방식이 점점 많이 쓰이고 있음 -->
			<!-- 액션태그라고 함. 자바 동작을 수행하는 태그들 -->
			
			<!-- 확장자는 jsp 쓰지 마라. 이유 잘 못들음. 브라우저가 해석 잘 못한다고??? -->

			<%
			bean=EmpCRUD.detail(bean.getSabun());			
			%>
			<table>
				<tr>
					<th>사번</th>
					<td><%=bean.getSabun() %></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><%=bean.getName() %></td>
				</tr>
				<tr>
					<th>날짜</th>
					<td><%=bean.getNalja() %></td>
				</tr>
				<tr>
					<th>금액</th>
					<td><%=bean.getPay() %></td>
				</tr>
			</table>
			<a href="edit.jsp?sabun=<%=bean.getSabun() %>&name=<%=bean.getName() %>&pay=<%=bean.getPay() %>">[수정]</a>
			<a href="delete.jsp">[삭제]</a>
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