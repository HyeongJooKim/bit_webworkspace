<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Student index</title>
</head>
<body>
<h1>�л��������α׷�(ver 0.5.0)</h1>
<table border=1 width=100%>
	<tr>
		<td>�й�</td>
		<td>�̸�</td>
		<td>����</td>
		<td>����</td>
		<td>����</td>
	</tr>
<%
	String sql="select * from student01 order by num";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	Properties info=new Properties();
	info.setProperty("user", user);
	info.setProperty("password", password);
//	oracle.jdbc.driver.OracleDriver driver= �̺κ� �Ƚᵵ �� ��
//	new oracle.jdbc.driver.OracleDriver();
	Class.forName("oracle.jdbc.driver.OracleDriver");//�̷��Ը� �ᵵ ��
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		conn=DriverManager.getConnection(url,info);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
%>
		<tr>
		<td><%=rs.getString(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
		<td><%=rs.getString(4) %></td>
		<td><%=rs.getString(5) %></td>
		</tr>
<%
		}
	}finally{
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(conn!=null) conn.close();
	}
%>
</table>
<a href="add.jsp">[�� ��]</a>
</body>
</html>