$(document).ready(function(){

	$('#frmLogin2').on('submit', function(event){
		event.preventDefault(); //submit이벤트 중지 (페이지 새로고침 방지)

		let user_id = $('#user_id').val();
		let user_pw = $('#user_pw').val();

		$.ajax({
			//비동기 요청에 대한 정보 나열 k:v
			type: "post", //method
			url: "login", //요청url
			data: {"user_id": user_id, "user_pw": user_pw}, //서버로 전송할 파라미터(payload)
			dataType: "text", //서버로부터 반환받을 data의 type

			//요청에 대한 응답 데이터 처리 - success 처리 함수의 매개변수로 전달
			success: function(result){
				let message;
				if(result == "success"){
					message = "로그인 성공\n상품 조회 화면으로 이동합니다";
					location.href="/mybatis/product/listAllProduct";
				}else
					message = "로그인 실패";
				alert(message);
			},

			error: function(){
				alert("전송실패");
			},

			complete: function(){

			}
		}); //ajax끝
	}); // on끝

}); //ready끝