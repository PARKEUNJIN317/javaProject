$(document).ready(function(){
	$('#bookNoCheckBtn').on('click',function(){
	
		event.preventDefault();
		
		let bookNo=$('#bookNo').val();
		
		if(bookNo == ""){
			alert("도서번호를 입력하세요");
			return false;
		}else{
			$.ajax({
				type:"post",
				url:"/mybatis/book/bookNoCheck",
				data:{"bookNo":bookNo},
				dataType:"text",
				success:function(result){
					if(result=="available"){
						alert("사용 가능한 번호입니다");
					}else{
						alert("사용 불가능한 번호입니다");
					}
				},
				error:function(){
					alert("전송실패");
				}
			
			
			});//ajax끝
			
		}//else 끝
	
	});//on끝

});//ready끝