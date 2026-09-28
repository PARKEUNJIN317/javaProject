//login 비동기 방ㅅ ㅣㄱ
$(document).ready(function(){
	$('#loginForm').on('submit', function(){
 		event.preventDefault();
		$.ajax({
			type:"post",
			url:"/member/login",
			data:{
				"id":$('#id').val(),
				 "pwd":$('#pwd').val()
			},
			dataType:"text",
			success:function(result){
				if(result=="success"){
					alert("로그인 성공\nMain페이지로 이동합니다");
					location.href="/";
				}else{
					alert("아이디 또는 비밀번호가 일치하지 않습니다");
				}
			},
			error:function(){
				alert("전송실패");
			}
			
			
			
		});//ajax끝		
	});//on끝
});//ready끝