/*
axios를 활용한 post 방식의 비동기 요청 처리 스크립트
javascript 기능을 활용
*/
 
window.onload = function(){
	let bookNoCheckBtn = document.getElementById('bookNoCheckBtn');
 
	bookNoCheckBtn.addEventListener('click', (event) => {
		event.preventDefault();
		let bookNo = document.getElementById('bookNo').value;
 
		if(bookNo == ""){
			alert("도서번호를 입력하세요");
		}else{
			let data = {"bookNo": bookNo}; 
			axios.post("/mybatis/book/bookNoCheck3", data)
				.then(function(response){
					if(response.data == "available"){
						alert("사용가능한 번호입니다3");
					}else{
						alert("사용 불가능한 번호입니다3");
					}
				})
				.catch((error) => {
					console.log(error.response);
				})
		}
	});
}
 