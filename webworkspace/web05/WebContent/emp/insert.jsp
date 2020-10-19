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
		//������ �ٷ� �Է��ϰ� �ʰ� ��������ν� �Է¿��� ���� �� �ִ�.
		name=param1.trim();//����ڰ� �߸� �Է��� �� �ִ� �յ� ���� ����
		pay=Integer.parseInt(param2.trim());
	}catch(Exception e){//�ƹ� �� ���� �Է��ϸ� �����߻��ϴ� ���� ����
		response.sendRedirect("add.jsp?name="+param1);
		//�̸��� �����. �߸� �Է� ��ư ����� ����ְ�
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