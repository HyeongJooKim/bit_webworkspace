<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mvc03-addDept.jsp</title>
<%@ include file="template/head.jspf" %>
<style type="text/css">
#content{}
#content>h2{}
#content>form{}
#content>form>div{}
#content>form>div>label{}
#content>form>div>input{}
#content>form>div:first-child~div{}
</style>

</head>
<body>
<%@ include file="template/header.jspf" %>
<%@ include file="template/menu.jspf" %>
	<h2>입력페이지</h2>
	<form method="post">
		<div>
			<label for="dname">dname</label>
			<input type="text" name="dname" id="dname" />
		</div>
		<div>
			<label for="loc">"loc"</label>
			<input type="text" name="loc" id="loc" />
		</div>
		<div>
			<button type="submit">입력</button>
			<button type="reset">취소</button>
			<button type="button" onclick="history.back();">뒤로</button>
		</div>
	</form>
<%@ include file="template/footer.jspf" %>
</body>
</html>