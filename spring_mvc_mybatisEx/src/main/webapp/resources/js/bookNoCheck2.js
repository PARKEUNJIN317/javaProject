$(document).ready(function(){
	$('#bookNoCheckBtn').on('click',function(){
		
		event.preventDefault();
		
		let bookNo = $('#bookNo').val();
		
		if(bookNo == ""){
			alert("상품번호를 입력하세요");
			return false;
		}else{

			fetch("/mybatis/book/bookNoCheck2/" + bookNo)
				.then(response => response.text())
				.then(result => {
					console.log(result);
					if(result=="available"){
						alert("사용가능한 번호3");
					}else{
						alert("사용불가능한 번호3");
					}
				})
				.catch(err => console.log(err));
	
		} //else끝
	}); //on 끝
});//ready 끝