//ajax를 활용한 비동기 통신, 검색결과를 받아와서 정해진 위치에 태그 생성 후 포함

$(document).ready(function(){
	$('#bookSearchFrm1').on('submit',function(){
		event.preventDefault();
	
		//폼에 있는 data를 payload(파라미터)로 구성
		let formData = $(this).serialize();
		
		let keyword = $("#keyword").val();
		let type = $("#type").val();
		
		if(keyword == "" || type == ""){
			alert("검색조건과 검색어를 입력하세요");
			return false;
		}else{
			$.ajax({
			type:"post",
			url:"/mybatis/book/bookSearch1",
			data:formData,
			success:function(){
				//검색결과 표현하는 위치에 태그를 추가 태그객체.append()
				$('#searchResultBox').empty(); //검색결과 표현 영역안을 지움
				$('#searchResultBox').append(
					'<table id="resultTable" border="1" width="500">'+
					'<tr><th>도서번호</th><th>도서명</th><th>저자</th>'+
					'<th>가격</th><th>출판일</th><th>재고</th><th>출판사번호</th></tr>'
				);
				
				if(result==""){//검색결과가 없는 경우
					$('#resultTable').append('<tr align="center"><td colspan="7">찾는 상품이 없습니다</td></tr>');
				}else{
					console.log(result);
					for(let i=0; i<result.length; i++){
						let book_date = new Date(result[i].prdDate);
						let year = prd_date.getFullYear();
						let month = (prd_date.getMonth()+1).toString().padStart(2,'0');
						let date = (prd_date.getDate()).toString().padStart(2,'0');
						let prdDate = `${year}-${month}-${date}`
						$('#resultTable').append('<tr><td>' + result[i].bookNo + '</td><td>' + 
										    				  result[i].bookName+'</td><td>' +
				    										  result[i].bookAuthor+'</td><td>' +
				    										  result[i].bookPrice+'</td><td>' +
				    										  bookDate+'</td><td>'+
				    										  '<img src="/mybatis/prd_images/' +
				    										  result[i].bookStock+'</td><td>' +
				    										  result[i].pubNo +
				    										  '.jpg"width="30" height="20" ></td></tr>');
				    										  
					}
				}
				$('#searchResultBox').append("</table>");
			},
			error:function(){alert("실패");}
			});//ajax 끝
		}
		
	});//on끝
});//ready 끝