<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web09/ex02</title>
</head>
<body>
	<jsp:useBean id="bean" class="test.Target" scope="request"></jsp:useBean>
	<h1>actionTag<%System.out.println(bean); %></h1>
<!-- �����ϸ�
�ּ� http://localhost:8080/web09/ex02.jsp
ȭ�� �̵����test.Target@2ed07ccc
�ܼ� test.Target@2ed07ccc
���� �ּ� ����, �� ���� ��ü
client�� ex02�� ��û�ϸ� ������ ex02 ������ ex03���� forward�ؼ� 
���� request�� ex02 �ּҿ� ���븸 ex03�� �����ְ� �������� �ؼ��ؼ� ȭ�鿡 ���
forward �� ���� �ܼ��� ��� �ڵ常 �����ϴ� ���̹Ƿ� �̹����� ��� 
ex02 ���Ͽ� �̹��� ��θ� �ٿ�����. �׷��� �̹����� �ȶߴ� ��
�ּ� �ȹٲ�� �� Ư���� �� �̿��غ���? 
 -->
	<jsp:forward page="result/ex03.jsp">
		<jsp:param value="xyz" name="msg"/>
	</jsp:forward>
<!-- forward �ϸ� �Ķ���ʹ� ���� �� �ǳ� �̹����� ����.
�����ϸ� �ּ�â�� ���� �ּ� (forward�� �ּҰ� �ƴ϶�)�� ������
�Ķ���ʹ� ���޵ǳ�, �̹����� ����. 
��? ���� �ּ� ���Ͽ��� forward �� �ּҸ� �� �ٿ��� ȣ���ϹǷ�
http://localhost:8080/web09/ex02.jsp 
-->
</body>
</html>