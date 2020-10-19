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
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/login/form.jsp">[LOGIN]</a></td><!-- form도 index -->
		<td bgcolor="#cccccc">&nbsp</td>
	</tr>
	<tr>
		<td colspan="6">
			<center>
			<h1>게시판</h1>
			<table width="90%" border=1 cellspacing=0>
				<tr>
					<th bgcolor="#dddddd" width="10%">글번호</th>
					<th bgcolor="#dddddd" >제목</th>
					<th bgcolor="#dddddd" width="20%">글쓴이</th>
					<th bgcolor="#dddddd" width="15%">날짜</th>
				</tr>
<%
	String key=request.getParameter("key");
	String word=request.getParameter("word");
	if(key==null)key="sub";
	if(word==null)word="";
	
	String sql="select num, sub, id, nalja, lev from bbs01 where "+key+" like '%"+word+"%' order by ref desc, no";
	//name칸에 ' -- 를 입력하면 그 이후는 다 주석처리되면서 허용 권한보다 많은 정보를 볼 수 있게 됨
	//이런 식으로 관리자 권한으로 들어갈 수 있는 것을 SQL Injection (SQL 삽입공격)이라 함.
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
			if(gap!=0)msg+="└";
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
					<option value="sub">제목</option>
					<option value="id">글쓴이</option>
				</select>
				<input type="text" name="word">
				<input type="submit" value="검색">
			</form>
			<a href="add.jsp">[입력]</a>
			</center>
		</td>
	</tr>
	<tr>
		<td bgcolor="#cccccc"></td>
		<td bgcolor="#cccccc" colspan="4">
		비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928<br>
		(주)비트컴퓨터 서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br>
		통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br>
		Copyright (c) 비트캠프 All rights reserved.
		</td>
		<td bgcolor="#cccccc"></td>
	</tr>
</table>
</body>
</html>


