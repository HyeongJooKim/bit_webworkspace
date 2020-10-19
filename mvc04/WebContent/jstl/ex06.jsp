<%@page import="com.bit.model.JavaBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, java.util.HashSet, java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl/ex06.jsp</title>
</head>
<body>
	<h1>JSTL 반복문</h1>
	<%
		String[] msgs={"java","DB","web","framework"};
		pageContext.setAttribute("msgs", msgs);
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("JAVA");
		list.add("DB");
		list.add("WEB");
		list.add("FRAMEWORK");
		pageContext.setAttribute("alist", list);
		
		HashSet<String> set=new HashSet<String>();
		set.add("JAVA set");
		set.add("DB set");
		set.add("WEB set");
		set.add("FRAMEWORK set");
		pageContext.setAttribute("hset", set);
		
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("key1","val1");
		map.put("key2","val2");
		map.put("key3","val3");
		map.put("key4","val4");
		pageContext.setAttribute("hmap", map);
		
		ArrayList beans=new ArrayList();
		JavaBean bean=new JavaBean();
		bean.setSu1(4444);
		bean.setSu2(4.14);
		bean.setName("DDDD");
		beans.add(bean);
		
		bean=new JavaBean();
		bean.setSu1(5555);
		bean.setSu2(5.14);
		bean.setName("EEEE");
		beans.add(bean);

		pageContext.setAttribute("beans", beans);
	%>
	<h2>Array</h2>
	<ol>
		<c:forEach items="${msgs }" varStatus="status" var="ele">
<!-- 	var="ele" 쓰면 index 없이도 값 뺄 수 있음 -->
			<li>${msgs[status.index]} : ${ele }</li>
		</c:forEach>
	</ol>
	<h2>ArrayList</h2>
	<ol>
		<c:forEach items="${alist }" varStatus="status" var="ele">
			<li>${alist.get(status.index)} : ${ele }</li>
		</c:forEach>
	</ol>
	<h2>HashSet</h2>
	<ol>
		<c:forEach items="${hset }" var="ele">
			<li>${ele }</li>
		</c:forEach>
	</ol>
	<h2>HashMap</h2>
	<ol>
		<c:forEach items="${hmap }" var="ele">
<%-- 		<li>${ele }</li> --%>
			<li>${ele.key }:${ele.value }</li>
		</c:forEach>
	</ol>
	<h2>JavaBean</h2>
	<dl>
		<c:forEach items="${beans }" var="dto">
			<dt>su1</dt>
			<dd>${dto.su1 }</dd>
			<dt>su2</dt>
			<dd>${dto.su2 }</dd>
			<dt>Name</dt>
			<dd>${dto.name }</dd>
		</c:forEach>
	</dl>

</body>
</html>