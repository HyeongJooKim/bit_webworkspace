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
					<th>��ȣ</th>
					<th>���̵�</th>
					<th>�̸�</th>
					<th>����</th>
				</tr>
				<%
				DeptCRUD crud=new DeptCRUD();
//				ArrayList<DeptDto> list=crud.list();
				for(DeptDto bean : crud.list()){
				//jdk 1.5 ���� ������ ������ loop��
				//: �����ʿ��� : ������ �ϳ��� ������ �ݺ��ض�
				//set������ ������. iterator ���̵� �� �� ������
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
			<a href="add.jsp">[�Է�]</a>
			
<jsp:include page="./../template/footer.jsp"></jsp:include>
</body>
</html>