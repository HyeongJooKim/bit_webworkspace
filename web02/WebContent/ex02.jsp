<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1 align=center>������ ���</h1>
	<%!
	String func01(int i, int j){
		return "<td>"+i+"x"+j+"="+i*j+"</td>";
	}//�״��� ū ȿ���� ������ �׷��� �޼ҵ�ε� �� ��
	%>
	
	<%
		String msg="";
		for(int i=1; i<10; i++){
			msg+="<tr>";
			for(int j=2; j<10; j++){
				//<td>
				msg+=func01(i,j);
				//</td>
			}
			msg+="</tr>";
		}
		//���� ���� ���ڵ��� ��� �ϳ��� ���ڿ��� �����ְ� ��� �ѹ��� �ϳ�
	%>
	<table algin=center border=1 width=100%>
		<tr>
			<td>2��</td>
			<td>3��</td>
			<td>4��</td>
			<td>5��</td>
			<td>6��</td>
			<td>7��</td>
			<td>8��</td>
			<td>9��</td>
		</tr>
	<%=msg %>
	</table>
</body>
</html>