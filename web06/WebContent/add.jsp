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
	//�ѱ� ó���� ���ؼ�
	int sabun=Integer.parseInt(request.getParameter("sabun"));
	String name=request.getParameter("name");
	int pay=Integer.parseInt(request.getParameter("pay"));
	
	Emp02Insert emp=new Emp02Insert();
	emp.insert(sabun,name,pay);
	response.sendRedirect("list.jsp");
	return;
}
			
			%>
			<h1 align="center">EMP �Է�������</h1>
			<form method="post">
			<!-- action="add.jsp" ������ ��. �����ϸ� �ڱ� �ڽ�. method �Ⱦ��� get ��� -->
			<table border=1 cellspacing=0 width=80% align="center">
				<tr>
					<th>���</th>
					<td><input type="text" name="sabun"></td>
				</tr>
				<tr>
					<th>�̸�</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>�ݾ�</th>
					<td><input type="text" name="pay"></td>
				</tr>
				<tr>
					<th colspan=2>
					<input type="submit" value="�Է�">
					<input type="reset" value="���">
					</th>
				</tr>
			</table>	
			</form>
			<!-- content end -->
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="darkgray" style="color:white;">
			��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)<br>
			(��)��Ʈ��ǻ�� ���ʺ���<br>
			</td>
		</tr>
	</table>
</body>
</html>