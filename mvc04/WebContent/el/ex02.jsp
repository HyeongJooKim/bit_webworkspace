<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList,java.util.HashMap" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>el/ex02.jsp</title>
<style type="text/css">
</style>
<script type="text/javascript">
</script>
</head>
<body>
	<h1>EL의 활용</h1>
	<%
		String msg1="el로 출력될까요?";
		String msg2="page scope과 겹치면 어떻게 될까?";
		//우선순위 page>request>session>application 으로 수명이 짧은 것이 우선
		//JspContext>ServletRequest>HttpSession>ServletContext
		pageContext.setAttribute("msg1", msg1);
		pageContext.setAttribute("msg2", msg2);
		//배열도 잘 담김
		String[] msgs={"java","DB","web","framework"};
		pageContext.setAttribute("msgs", msgs);
		//List
		ArrayList<String> list=new ArrayList<String>();
		list.add("JAVA");
		list.add("DB");
		list.add("WEB");
		list.add("FRAMEWORK");
		pageContext.setAttribute("alist", list);
		//map
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("key1",1111);
		map.put("key2",2222);
		map.put("key3",3333);
		map.put("key4",4444);
		pageContext.setAttribute("hmap", map);
		//javabean
		
	%>
	<p>page scope(java): <%=pageContext.getAttribute("msg1") %></p>
	<p>page scope(el): ${msg1 }</p>

	<p>page scope(java): <%=pageContext.getAttribute("msg2") %></p>
	<p>request scope(el : null 은 빈값이 나옴): ${requestScope.msg2 }</p>

	<p>page scope(el): ${msg2 }</p>
	<p>request scope(java : null은 null로 표기): <%=request.getAttribute("msg2") %></p>

	<p>Array(el): ${msgs }</p>
	<ol>
		<li>${msgs[0] }</li>
		<li>${msgs[1] }</li>
		<li>${msgs[2] }</li>
		<li>${msgs[3] }</li>
	</ol>

	<p>ArrayList(java): <%=pageContext.getAttribute("alist").toString() %></p>
	<p>ArrayList(el): ${list }</p>
	<ol>
		<li>${alist.get(0) }</li>
		<li>${alist.get(1) }</li>
		<li>${alist.get(2) }</li>
		<li>${alist.get(3) }</li>
	</ol>
	<p>HashMap(java): <%=pageContext.getAttribute("hmap").toString() %></p>
	<p>HashMap(el): ${hmap }</p>
	<ol>
		<li>${hmap.key1 }</li>
		<li>${hmap.key2 }</li>
		<li>${hmap.key3 }</li>
<%-- 	<li>${hmap.get(key3) }</li> 이거는 안됨 --%>
		<li>${hmap.get("key4") }</li>
	</ol>
	<p>bean: ${bean }</p>
<!-- public class안에 있는 private 변수값을 가져오는 걸 보면
getter를 수행함을 알 수 있음. getter 없으면 오류남 -->
	<dl>
		<dt>int su1</dt>
		<dd>${bean.su1 }</dd>
		<dt>int su2</dt>
		<dd>${bean.su2 }</dd>
		<dt>char ch</dt>
		<dd>${bean.ch }</dd>
		<dt>boolean tf</dt>
		<dd>${bean.tf }</dd>
		<dt>String name</dt>
		<dd>${bean.name }</dd>
		<dt>java.util.Date nalja</dt>
		<dd>${bean.nalja }</dd>
	</dl>
<!-- dl(dictionary list) dt(dictionary term) dd(dictionary description) -->

<!-- 한 명령에서 java code와 EL을 섞어 쓸 순 없다. 자바표현식을 대체하는 것-->
	
	<p>3항연산: ${bean.tf ? "참" : "거짓" }</p>
<!-- true일때 왼쪽값 : false일때 오른쪽 값 나옴 -->
</body>
</html>