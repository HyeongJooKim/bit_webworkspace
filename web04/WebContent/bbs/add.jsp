<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web04/bbs/add</title>
</head>
<body>
<table width="100%" align="center" cellspacing=0>
	<tr>
		<td colspan="6"><img src="/web04/img/logo.png"></td>
	</tr>
	<tr>
		<td bgcolor="#cccccc">&nbsp</td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/">[HOME]</a></td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/bbs/list.jsp">[BBS]</a></td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/emp/list.jsp">[EMP]</a></td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/login/form.jsp">[LOGIN]</a></td><!-- form�� index -->
		<td bgcolor="#cccccc">&nbsp</td>
	</tr>
	<tr>
		<td colspan="6">
			<center>
			<h1>�۾���</h1>
			<form action="insert.jsp" method="post">
			<table align="center" width="80%">
				<tr>
					<th width=15% align="right">����</th>
					<td><input type="text" name="sub" size="60"></td>
				</tr>
				<tr>
					<th align="right">�۾���</th>
					<td><input type="text" name="id" size="60"></td>
				</tr>
				<tr>
					<th></th>
					<td><textarea name="content" rows="10" cols="57"></textarea></td>
				</tr>
			</table>				
					<input type="submit" value="�۾���">
					<input type="reset" value="���">
			</form>
			</center>
		</td>
	</tr>
	<tr>
		<td bgcolor="#cccccc"></td>
		<td bgcolor="#cccccc" colspan="4">
		��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)�� ����ڵ�Ϲ�ȣ : 214-85-24928<br>
		(��)��Ʈ��ǻ�� ���ʺ��� ��ǥ�̻� : ������ / ���� : 02-3486-9600 / �ѽ� : 02-6007-1245<br>
		����Ǹž� �Ű��ȣ : �� ����-00098ȣ / ����������ȣ����å���� : ������<br>
		Copyright (c) ��Ʈķ�� All rights reserved.
		</td>
		<td bgcolor="#cccccc"></td>
	</tr>
</table>
</body>
</html>