<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web02\ex04</title>
</head>
<body>
	<h1 align=center>������ ��� <%=new Date() %></h1>
	<table algin=center border=1 width=100%>
		<tr>
			<%
			for(int i=2; i<10; i++){
				out.write("<td>");//���ڿ��̶� ����� ��. .toCharArray() �� �����ε�Ǿ� ����Ǵ� ��
				out.print(i+"��");//
				out.println("</td>");//�ҽ��ڵ忡�� �ٹٲ����ִ� ����. �� ������ ����
			}
			//out (jsp ���尴ü) : ������ ����϶�.
			%>
		</tr>
		<%
		for(int i=1; i<10; i++){
			out.print("<tr>");
			for(int j=2; j<10; j++){
				out.println("<td>");
				out.print(j+"x"+i+"="+i*j);
				out.println("</td>");
			}
		}
		//�ҽ��ڵ�� �̷��� ���������� ������ �ҽ������ϸ� Ǯ� ���� ����
		%>
	</table>
</body>
</html>