<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*, java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web03/dept/add</title>
</head>

<table width="100%">
	<tr>
		<td colspan=6><img src="../img/logo.png"></td>
	</tr>
	<tr>
		<td bgcolor=lightgrey></td>
		<td bgcolor=lightgrey width=100 align=center><a href="../index.jsp"> [HOME] </td>
		<td bgcolor=lightgrey width=100 align=center><a href="list.jsp"> [DEPT] </td>
		<td bgcolor=lightgrey width=100 align=center><a href="../emp/list.jsp"> [E M P] </td>
		<td bgcolor=lightgrey width=100 align=center><a href="../login/login.jsp"> [LOGIN] </td>
		<td bgcolor=lightgrey></td>
	</tr>
	<tr>
		<td colspan=6>
		<!-- content start -->
		<center>
		<h1>DEPT ADD PAGE</h1>
			<form action="insert.jsp">
				<table>
				<tr>
					<td>Department No</td>
					<td><input type="text" name="deptno"></td>
				</tr>
				<tr>
					<td>Department Name</td>
					<td><input type="text" name="dname"></td>
				</tr>
				<tr>
					<td>Location</td>
					<td><input type="text" name="loc"></td>
				</tr>
				<tr>
					<td colspan=2 align="center">
						<input type="submit" name="�Է�">
						<input type="reset" name="���">
					</td>
				</tr>
				</table>
				
			</form>
		</center>
		<!-- content end -->
		</td>
	</tr>
	<tr>
		<td colspan=6></td>
	</tr>
	<tr>
		<td colspan=6 bgcolor=lightgray align=center>
		��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)�� ����ڵ�Ϲ�ȣ : 214-85-24928<br>
(��)��Ʈ��ǻ�� ���ʺ��� ��ǥ�̻� : ������ / ���� : 02-3486-9600 / �ѽ� : 02-6007-1245<br>
����Ǹž� �Ű��ȣ : �� ����-00098ȣ / ����������ȣ����å���� : ������<br>
Copyright (c) ��Ʈķ�� All rights reserved.
		</td>
	</tr>
</table>
</body>
</html>