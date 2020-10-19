<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web04/bbs/detail</title>
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
			<h1>상세보기</h1>
<%
	String num=request.getParameter("idx");
	String id="";
	String nalja="";
	String sub="";
	String content="";
	int ref=0;
	int no=0;
	int lev=0;
	String sql="select id, nalja, sub, content, ref, no, lev from bbs01 where num="+num;
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
		if(rs.next()){//값 하나만 가져오니 반복 불필요하네
			id=rs.getString(1);
			nalja=rs.getDate(2).toString();
			sub=rs.getString(3);
			content=rs.getString(4);
			ref=rs.getInt(5);
			no=rs.getInt(6);
			lev=rs.getInt(7);
		}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
%>
			<table width="90%" border=0 cellspacing=1>
				<tr>
					<th bgcolor="#eeeeee">글번호</th>
					<td><%=num %></td>
					<th bgcolor="#eeeeee">글쓴이</th>
					<td><%=id %></td>
					<th bgcolor="#eeeeee">날짜</th>
					<td><%=nalja %></td>
				</tr>
				<tr>
					<th bgcolor="#eeeeee">제목</th>
					<td colspan=5><%=sub %></td>
				</tr>
				<tr>
					<td colspan=6><%=content %></td>
				</tr>
				<tr>
					<td bgcolor="#eeeeee" colspan=6 align="center">
					<a href="edit.jsp?idx=<%=num%>">[수 정]</a>
					<a href="delrte.jsp?idx=<%=num%>">[삭 제]</a>
					<a href="re.jsp?ref=<%=ref%>&no=<%=no%>&lev=<%=lev%>">[답 글]</a>
					</td>
				</tr>
			</table>
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


