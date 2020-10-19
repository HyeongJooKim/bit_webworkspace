<%@page import="com.bit.dept.model.Dept04Dto, java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mvc03-detail.jsp</title>
<%@ include file="/template/head.jspf" %>
<!-- 절대경로스타일 -->
<style type="text/css">
#content{}
#content>h2{}
#content>form{
	mardin: 0px auto;
}
#content>form>div{}
#content>form>div>label{}
#content>form>div>input{
	border-width: 0px;
}
</style>
<script type="text/javascript">
	$(function(){
		$('#dname,#loc').prop('readonly',true);
		//수정 버튼 눌러야 수정가능하게 시작은 readonly로
//		$(document).one('submit','form',function(){
		//이렇게 document에서 시작하면 후에 생긴 form에도 적용될 수 있음.
		//one은 한번만 이벤트가 일어나는 것
		$('form').one('submit',function(){
			$('#dname,#loc').prop('readonly',false);
			$('form').find('input').css('border-width','2px');
			$('form').find('button').eq(1).text('취소');
			$('form').off('reset',del);
			$('#content h2').text('수정페이지');
			return false;
		});
		$('form').on('reset',del);
	});
	function del(){
		alert('delete');
		return false
	}
</script>
</head>
<body>
<%@ include file="template/header.jspf" %>
<!-- 상대경로스타일 -->
<%@ include file="./template/menu.jspf" %>
<!-- 상대경로에서 생략된 부분을 써준 것 -->
	<h2>DEPT detail</h2>
	<form method="post">
		<div>
			<label for="deptno">deptno</label>
			<input type="text" name="deptno" id="deptno" value="${bean.deptno }" readonly="readonly" />
		</div>
		<div>
			<label for="dname">dname</label>
			<input type="text" name="dname" id="dname"  value="${bean.dname }" />
		</div>
		<div>
			<label for="loc">"loc"</label>
			<input type="text" name="loc" id="loc"  value="${bean.loc }" />
		</div>
		<div>
			<button type="submit">수정</button>
			<button type="reset">삭제</button>
			<button type="button" onclick="history.back();">뒤로</button>
		</div>
	</form>
<%@ include file="template/footer.jspf" %>
</body>
</html>