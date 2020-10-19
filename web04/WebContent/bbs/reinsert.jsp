<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web04/bbs/reinsert</title>
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
	int ref=Integer.parseInt(request.getParameter("ref"));
	int no=Integer.parseInt(request.getParameter("no"));
	int lev=Integer.parseInt(request.getParameter("lev"));
	
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
		if(lev==0){
			String sql="insert into bbs01 (num, sub, id, nalja, content,ref,no,lev)";
			sql+="values (bbs01_seq.nextval, '"+sub+"', '"+id+"', sysdate, '"+content+"',"+ref;
			sql+=",(select max(no)+1 from bbs01 where ref="+ref+"),"+(lev+1)+")";
			stmt.executeUpdate(sql);
			System.out.println(sql);
		}else{
			String sql="update bbs01 set no=no+1 where ref="+ref+" and no>"+no;
			stmt.executeUpdate(sql);
			sql="insert into bbs01 (num, sub, id, nalja, content,ref,no,lev)";
			sql+="values (bbs01_seq.nextval, '"+sub+"', '"+id+"', sysdate, '"+content+"',"+ref+",";
			sql+=no+"+1,"+lev+"+1)";
			stmt=conn.createStatement();//초기화해줘야 함
			stmt.executeUpdate(sql);
			System.out.println(sql);
		}
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