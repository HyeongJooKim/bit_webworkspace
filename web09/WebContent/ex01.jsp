<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web09/ex01</title>
</head>
<body>
	<jsp:useBean id="bean" class="test.Target" scope="request"></jsp:useBean>
	<h1>�����̷�Ʈ<%System.out.println(bean); %></h1>
<!-- �����ϸ�
�ּ� http://localhost:8080/web09/result/ex03.jsp?msg=abcd 
ȭ�� �̵����test.Target@57d2eb1e
�ܼ�         test.Target@1fd8b35d
���� �ּҰ� �ٸ�. �ٸ� ��ü
<meta http-equiv="refresh">�� ���� ��ɰ� ���
client(browser)�� ex01�� ��û�ϸ� �켱 ������ ex01�� ��� (1st cycle����)�ϰ�
�������� ex01�� ������ ���� �� �ȿ� ex03���� �̵��϶�� ����� �־ �ٽ� ������ ex03�� ��û�ϰ�
������ ex03�� ������ �������� �ڵ带 �ؼ��ؼ� ȭ�鿡 ��� (2nd cycle)
 -->
	<%
		response.sendRedirect("result/ex03.jsp?msg=abcd");
	%>
<!-- �����ϸ� �ּ�â�� 
http://localhost:8080/web09/result/ex03.jsp?msg=abcd ������
�̹����� �� ����
-->
</body>
</html>