<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web04/bbs/list</title>
</head>
<body>
<table width="100%" align="center" cellspacing=0>
	<tr>
		<td colspan="6"><img src="/web04/img/logo.png"></td>
	</tr>
	<tr>
		<td bgcolor="#cccccc">&nbsp</td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/">[HOME]</a></td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/bbs/list.jsp">[BBS]</a></td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/emp/list.jsp">[EMP]</a></td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/login/form.jsp">[LOGIN]</a></td><!-- form�� index -->
		<td bgcolor="#cccccc">&nbsp</td>
	</tr>
	<tr>
		<td colspan="6">
			<center>
			<h1>�Խ���</h1>
			<table width="90%" border=1 cellspacing=0>
				<tr>
					<th bgcolor="#dddddd" width="10%">�۹�ȣ</th>
					<th bgcolor="#dddddd" >����</th>
					<th bgcolor="#dddddd" width="20%">�۾���</th>
					<th bgcolor="#dddddd" width="15%">��¥</th>
				</tr>
<%
	String key=request.getParameter("key");
	String word=request.getParameter("word");
	if(key==null)key="sub";
	if(word==null)word="";
	
	String sql="select num, sub, id, nalja, lev from bbs01 where "+key+" like '%"+word+"%' order by ref desc, no";
	//nameĭ�� ' -- �� �Է��ϸ� �� ���Ĵ� �� �ּ�ó���Ǹ鼭 ��� ���Ѻ��� ���� ������ �� �� �ְ� ��
	//�̷� ������ ������ �������� �� �� �ִ� ���� SQL Injection (SQL ���԰���)�̶� ��.
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	Class.forName(driver);
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
			int gap=rs.getInt(5);
			String msg="";
			for(int i=0; i<gap; i++){
				msg+="&nbsp;&nbsp;&nbsp;";
			}
			if(gap!=0)msg+="��";
%>
				<tr>
					<td><a href="detail.jsp?idx=<%=rs.getInt(1) %>"><%=rs.getInt(1) %></td>
					<td><a href="detail.jsp?idx=<%=rs.getInt(1) %>"><%=msg+rs.getString(2) %></td>
					<td><a href="detail.jsp?idx=<%=rs.getInt(1) %>"><%=rs.getString(3) %></td>
					<td><a href="detail.jsp?idx=<%=rs.getInt(1) %>"><%=rs.getDate(4) %></td>
				</tr>
<%
		}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
%>
			</table>
			<form action="list.jsp">
				<select name="key">
					<option value="sub">����</option>
					<option value="id">�۾���</option>
				</select>
				<input type="text" name="word">
				<input type="submit" value="�˻�">
			</form>
			<a href="add.jsp">[�Է�]</a>
			</center>
		</td>
	</tr>
	<tr>
		<td bgcolor="#cccccc"></td>
		<td bgcolor="#cccccc" colspan="4">
		��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)�� ����ڵ�Ϲ�ȣ : 214-85-24928<br>
		(��)��Ʈ��ǻ�� ���ʺ��� ��ǥ�̻� : ������ / ���� : 02-3486-9600 / �ѽ� : 02-6007-1245<br>
		����Ǹž� �Ű��ȣ : �� ����-00098ȣ / ����������ȣ����å���� : ������<br>
		Copyright (c) ��Ʈķ�� All rights reserved.
		</td>
		<td bgcolor="#cccccc"></td>
	</tr>
</table>
</body>
</html>


