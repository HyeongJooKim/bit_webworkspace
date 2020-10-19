<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.dept.DeptCRUD"%>
<%@page import="com.bit.dept.DeptDto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web08/dept/list</title>
</head>
<body>
<jsp:include page="/template/header.jsp">
	<jsp:param value="../" name="path"/>
</jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value="../" name="path"/>
</jsp:include>
			<h1>DEPT01 LIST</h1>
			<table width=80%>
				<tr>
					<th>번호</th>
					<th>아이디</th>
					<th>이름</th>
					<th>레벨</th>
				</tr>
				<%
				DeptCRUD crud=new DeptCRUD();
//				ArrayList<DeptDto> list=crud.list();
				for(DeptDto bean : crud.list()){
				//jdk 1.5 이후 등장한 개선된 loop문
				//: 오른쪽에서 : 왼쪽을 하나씩 꺼내서 반복해라
				//set에서도 유용함. iterator 없이도 값 잘 꺼내옴
				%>
				<tr>
					<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
					<td><a><%=bean.getId() %></a></td>
					<td><a><%=bean.getName() %></a></td>
					<td><a><%=bean.getLev() %></a></td>
				</tr>
				<%
				}
				%>
			</table>
			<a href="add.jsp">[입력]</a>
			
<jsp:include page="./../template/footer.jsp"></jsp:include>
</body>
</html>