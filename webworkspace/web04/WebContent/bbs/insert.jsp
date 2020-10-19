<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web04/bbs/insert</title>
</head>
<body>
<%
//Method -> get 방식의 한글처리
//Ser -> server.xml 설정변경
//<Connector URIEncoding="euc-kr" connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443"/>
//URIEncoding="euc-kr" 추가함
//Method -> post 방식의 한글처리
//매 파라미터 파싱 전 한글 처리
//request.setCharacterEncoding("euc-kr"); 추가

	request.setCharacterEncoding("euc-kr");
	String sub=request.getParameter("sub");
	String id=request.getParameter("id");
	String content=request.getParameter("content");
	
	if(sub.isEmpty())sub="제목없음";
	sub.replace("<","&lt;");// < 태그 기능을 가지는 신호 대신 보여지는 문자 < 로 변환
	sub.replace("<","&gt;");// 사용자가 <script> 사용하는 것 금지함
	sub.replace("--", "­­");//SQL injection 방어
	sub.replace("'", "＇");//SQL injection 방어
	sub.replace(" ", "&nbsp");//SQL injection 방어
	
	String sql="insert into bbs01 (num, sub, id, nalja, content,ref,no,lev) values (bbs01_seq.nextval, '";
	sql+=sub+"', '"+id+"', sysdate, '"+content+"',bbs01_seq.currval,0,0)";
	System.out.println(sql);
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	Class.forName(driver);
	Connection conn=null;
	Statement stmt=null;
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
	response.sendRedirect("list.jsp");
%>
</body>
</html>