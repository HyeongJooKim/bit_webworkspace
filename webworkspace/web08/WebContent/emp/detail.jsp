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
			<h1>�� ������</h1>

			<!-- useBean�� ���� ��ü �����ϴ� ��� -->
			<jsp:useBean id="bean" class="com.bit.emp.EmpDto"></jsp:useBean>
			<!-- EmpDto bean=new EmpDto(); �� ���� -->
			<jsp:setProperty property="sabun" name="bean"/>
			<!-- bean.setSabun(Integer.parseInt(request.getparameter("sabun"))); �� ���� -->
			<!-- serProperty �ȿ� value="5555"���� ������ �� ���� ����, value ������ �޾ƿ� ���� �̿��ϴ� �� -->
			<!-- setProperty  �Ⱦ��� �׳� ��ü�� �����ϴ� �� -->
			<!-- �̷� ������ tag ������ ��µ� �����δ� java �ڵ尡 ���ư��� ����� ���� ���� ���̰� ���� -->
			<!-- �׼��±׶�� ��. �ڹ� ������ �����ϴ� �±׵� -->
			
			<!-- Ȯ���ڴ� jsp ���� ����. ���� �� ������. �������� �ؼ� �� ���Ѵٰ�??? -->

			<%
			bean=EmpCRUD.detail(bean.getSabun());			
			%>
			<table>
				<tr>
					<th>���</th>
					<td><%=bean.getSabun() %></td>
				</tr>
				<tr>
					<th>�̸�</th>
					<td><%=bean.getName() %></td>
				</tr>
				<tr>
					<th>��¥</th>
					<td><%=bean.getNalja() %></td>
				</tr>
				<tr>
					<th>�ݾ�</th>
					<td><%=bean.getPay() %></td>
				</tr>
			</table>
			<a href="edit.jsp?sabun=<%=bean.getSabun() %>&name=<%=bean.getName() %>&pay=<%=bean.getPay() %>">[����]</a>
			<a href="delete.jsp">[����]</a>
			<!-- content end -->
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="#FADD3B" style="color:white;">
			��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)<br>
			(��)��Ʈ��ǻ�� ���ʺ���<br>
			</td>
		</tr>
		
	</table>
</body>
</html>