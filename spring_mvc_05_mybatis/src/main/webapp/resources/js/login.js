$(document).ready(function(){

	$('#frmLogin').on('submit',function(){
		event.preventDefault(); //submit이벤트 중지
		
		let user_id = $('#user_id').val();
		let user_pw = $('#user_pw').val();
		
		$.ajax({
				//비동기 요청에 대한 정보 나열 k:v
				type:"post",//method
				url:"/mybatis/login", //요청url
				data:{"id":user_id,"pw":user_pw}//서버로 전송할 파라미터(paylod)
				dataType:"text",//서버로부터 반환받을 data의 type
				//요청에 대한 응답 데이터 처리 - sucess처리 함수의 매개변수로 전달
				success:function(result){
					if(result=="success")
						message="로그인 성공";
					else
						message="로그인 실패";
					alter(message);	
					
				error:function()
				{
					aler("전송실패");
				},
				complete:function(){
				
				}
			});//ajax끝
	});// on끝


});//ready끝