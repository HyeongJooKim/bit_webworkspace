<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input.jsp</title>
</head>
<body>
	<h2>Add Page</h2>
	<form action="result.action">
		sabun:<input type="text" name="sabun"/>${fieldErrors.sabun }<br>
		name:<input type="text" name="name"/>${fieldErrors.name }<br>
		<button>Add</button>
	</form>
<!-- https://struts.apache.org/getting-started/processing-forms.html  -->
<!-- 여기 있는 태그 쓰면 이렇게 안써도 됨 -->
<%-- <%@ taglib prefix="s" uri="/struts-tags" %> --%>
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!--   <head> -->
<!--     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> -->
<!--     <title>Register</title> -->
<!--   </head> -->
<!--   <body> -->
<!--     <h3>Register for a prize by completing this form.</h3> -->

<!--     <s:form action="register"> -->
<!--       <s:textfield name="personBean.firstName" label="First name" /> -->
<!--       <s:textfield name="personBean.lastName" label="Last name" /> -->
<!--       <s:textfield name="personBean.email"  label ="Email"/>   -->
<!--       <s:textfield name="personBean.age"  label="Age"  /> -->
<!--       <s:submit/> -->
<!--     </s:form>	 -->
<!--   </body> -->
<!-- </html> -->
	
</body>
</html>