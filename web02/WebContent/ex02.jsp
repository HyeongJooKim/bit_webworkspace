<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1 align=center>구구단 출력</h1>
	<%!
	String func01(int i, int j){
		return "<td>"+i+"x"+j+"="+i*j+"</td>";
	}//그다지 큰 효용은 없지만 그래도 메소드로도 한 번
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
		//적고 싶은 문자들을 모두 하나의 문자열로 묶어주고 출력 한번에 하네
	%>
	<table algin=center border=1 width=100%>
		<tr>
			<td>2단</td>
			<td>3단</td>
			<td>4단</td>
			<td>5단</td>
			<td>6단</td>
			<td>7단</td>
			<td>8단</td>
			<td>9단</td>
		</tr>
	<%=msg %>
	</table>
</body>
</html>