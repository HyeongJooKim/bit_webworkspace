<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
//�����. �޼���, �Լ� �� ����
int su=4321;

public int func01(){//static �����ص� ���ƴ� ���� �ʿ� ����
	System.out.println("func01 run");
	return 1234;
}
//ȣ���ؾ� �����. non-static. Scriptlet�� non-static�̶� �Ҹ�.
//class ���� �� (WAS container�� �ڵ� ������)

%>

	<h1>��ũ��Ʈ��(Scriptlet)</h1>
	<%
	//main()�� ����
	int a=100;
	int b=20;
	int c=a+b;
	System.out.println(c);
	java.util.Date date=new java.util.Date();
	System.out.println(date);
	//Scriplet�ȿ����� �ڹ� �ּ� ����. ���� ����Ϸ��� ǥ����
	int d=func01();//this. ������ ��. �������� ���� ȣ���. 
	%>
	
	<!--ǥ����: ȭ�� ��¿� ";" ���� �ȵ�.--> 
	<%=date %> <br>
	<%=d %>
	<%=this.su %>

</body>
</html>