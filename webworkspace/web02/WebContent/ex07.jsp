<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web02\ex07</title>
</head>
<body>
<h1>�� ����</h1>
<form action="ex08.jsp" method="get">
	<!--method ���� ���ϸ� get (������ �ּ�ǥ���ٿ� ������ �����,
	post�� �ٲٸ� ������ �Է�â�� �Է°� ���� �ȵǰ� header�� ���� �Ƿ��� -->

	id<input type="text" name="id"><br>
	<!-- textfield ���� -->
	pw<input type="password" name="pw"><br>
	<!-- textfield �ε� �Է��ϴ� ���� dot�� ǥ�õ�. �Է¹��� ������ -->
	hobby
	<input type="checkbox" name="ra" value="item1"><br>
	<input type="checkbox" name="ra" value="item2"><br>
	<input type="checkbox" name="ra" value="item3"><br>
	<input type="submit">
	<!-- �̸� �Է� ���� ���ϴ� �������� �̶�� ��ư ���� -->
	<!--ȭ�鿡 �Է¶� ����� �Է��ϸ�
	http://localhost:8080/web02/ex08.jsp?id=guest&pw=1234 ������ ������ -->
</form>
</body>
</html>