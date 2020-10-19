<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web05/emp/insert</title>
</head>
<body>
<%@ include file="../template/header.jspf" %>
<%
	String param1=request.getParameter("name");
	String param2=request.getParameter("pay");
	String name="";
	int pay=0;
	try{
		//변수를 바로 입력하고 않고 계산함으로써 입력오류 줄일 수 있다.
		name=param1.trim();//사용자가 잘못 입력할 수 있는 앞뒤 공백 제거
		pay=Integer.parseInt(param2.trim());
	}catch(Exception e){//아무 값 없이 입력하면 오류발생하는 것을 방지
		response.sendRedirect("add.jsp?name="+param1);
		//이름은 살려줌. 잘못 입력 버튼 눌렀어도 살아있게
		return;
	}
	String sql="insert into emp01 values (emp01_seq.nextval,'"+name+"', sysdate, "+pay+")";
	try{
		Class.forName(driver);
		conn=java.sql.DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		stmt.executeQuery(sql);
	}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("list.jsp");
%>
</body>
</html>