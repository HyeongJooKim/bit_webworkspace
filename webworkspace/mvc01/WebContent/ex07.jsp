<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ex07.jsp</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('button').click(function(){
		//메소드는 늘어났으나 원하는 대로 잘 안됨. 파라미터 전달해보자
		var param='msg='+$('input').val();
		if($(this).text()=='get'){
//			$.get('ex08');
			$.get('ex08?'+param,{'method':'get','dataType':'plain/text','type':'get','success':function(){}});
		}else if($(this).text()=='post'){
//			$.post('ex08');
 			$.ajax({'url':'ex08','data':param,'type':'post'}); 
		}else if($(this).text()=='put'){
			$.ajax('ex08',{'type':'put','data':param});
		}else if($(this).text()=='delete'){
			$.ajax({'url':'ex08','type':'delete','data':param});
			//다 되는 방식들
		}
	});
});
</script>
</head>
<body>
	<h1>method별 호출</h1>
	<input type="text"/>
	<button>get</button>
	<button>post</button>
	<button>put</button>
	<button>delete</button>
	<button>head</button>
</body>
</html>