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
//선언부. 메서드, 함수 등 선언
int su=4321;

public int func01(){//static 선언해도 돌아는 가나 필요 없음
	System.out.println("func01 run");
	return 1234;
}
//호출해야 실행됨. non-static. Scriptlet도 non-static이란 소리.
//class 뭔지 모름 (WAS container가 자동 생성함)

%>

	<h1>스크립트릿(Scriptlet)</h1>
	<%
	//main()와 유사
	int a=100;
	int b=20;
	int c=a+b;
	System.out.println(c);
	java.util.Date date=new java.util.Date();
	System.out.println(date);
	//Scriplet안에서는 자바 주석 가능. 웹에 출력하려면 표현식
	int d=func01();//this. 생략된 셈. 참조변수 없이 호출됨. 
	%>
	
	<!--표현식: 화면 출력용 ";" 쓰면 안됨.--> 
	<%=date %> <br>
	<%=d %>
	<%=this.su %>

</body>
</html>