<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, com.bit.model.*" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC02-list.jsp</title>
<link rel="stylesheet" type="text/css" href="css/frame.css"/>
<style type="text/css">	
	#contents{
		text-align: center;
	}
	#contents>h2{
		text-align: center;
	}
	#contents>form{
		width: 500px;
	}
	#contents>form>div{
		margin-top: 5px;
	}
	#contents>form>div>label{
		width: 150px;
		display: inline-block;
	}
	#contents>form>div>input{
		width: 300px;
		border
	}
	#err{
		background-color: red;
		height: 30px;
		color: white;
	}
	#err>span:first-child{
		background-color: red;
		float: right;
		border: 1px solid white;
		margin: 5px;
		width: 20px;
		height: 20px;
		color: white;
		text-align: center;
		line-height: 20px;
		cursor: pointer;
	}
	#err>span:last-child{
		background-color: red;
		clear: both;
		line-height: 30px;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
 	$(document).ready(function(){
		if(<%=request.getAttribute("err") %>){
	 		$('#err').show();
		}else{
	 		$('#err').hide();
		}
 		$('#err>span').eq(0).click(function(){
 			$('#err').hide();			
  		});
 		$('#contents form button').eq(2).click(function(){
 			window.history.back();
 		});
 		$('#contents form').submit(function(){
 			$('#err').hide();
 			if($('#sabun').val()==''){
 				$('#err').show();
 				$('#err>span').last().text('사번을 입력하세요');
 				$('#sabun').focus();
/*  				$('#sabun').next().css('display','inline'); */
 				return false;
 			}else if($('#name').val()==''){
 				$('#err').show();
 				$('#err>span').last().text('이름을 입력하세요');
 				$('#name').focus();
/*  				$('#name').next().css('display','inline'); */
 				return false;
 			}else if($('#sub').val()==''){
 				$('#sub').val('제목없음');
 			}else if($('#pay').val()==''){
 				$('#err').show();
 				$('#err>span').last().text('금액을 입력하세요');
 				$('#pay').focus();
/*  				$('#pay').next().css('display','inline'); */
 				return false;
 			}
 		});
	}); 

</script>
</head>
<body>
<div id="err">
	<span>X</span>
	<span><%=request.getAttribute("err") %></span>
</div>

<div>
	<div id="header">
		<h1>비트교육센터</h1>
	</div>
	<div id="menu">
		<ul>
			<li><a href="index.bit">HOME</a></li>
			<li><a href="list.bit">EMP</a></li>
			<li><a href="#">DEPT</a></li>
			<li><a href="login.bit">LOGIN</a></li>
		</ul>
	</div>
	<div id="contents">
		<h2>입력페이지</h2>
		<form method="post">
			<div>
				<label for="sabun">sabun</label>
				<input type="text" name="sabun" id="sabun"/>
<!-- 				<span><br>빈값을 허용하지 않습니다</span> -->
			</div>
			<div>
				<label for="name">name</label>
				<input type="text" name="name" id="name"/>
			</div>
			<div>
				<label for="sub">sub</label>
				<input type="text" name="sub" id="sub"/>
			</div>
			<div>
				<label for="pay">pay</label>
				<input type="text" name="pay" id="pay"/>
			</div>
			<div>
				<button type="submit">입력</button>
				<button type="reset">취소</button>
				<button type="button">뒤로</button>
			</div>
		</form>
	</div>
	<div id="footer">
		<address>COPYRIGHT BY BITACADEMY CO.LTD. ALL RIGHTS RESERVED.<br>HTTP://www.BITacademy.com</address>
	</div>
</div>
</body>
</html>