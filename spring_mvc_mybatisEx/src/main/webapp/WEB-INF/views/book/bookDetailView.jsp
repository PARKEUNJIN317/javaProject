<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>도서 상세 정보 조회</title>
		<script>
			function deleteCheck(){
				let answer = confirm("삭제하시겠습니까?");
				if(answer==true){
					location.href="<c:url value='/book/deleteBook/${vo.bookNo}'/>";
				}
			}
		</script>
	</head>
	<body>
		 <h3>도서 상세 정보 조회</h3>
	     <table border="1" width="300">
				<tr><td>도서번호</td><td>${vo.bookNo }</td></tr>
				<tr><td>도서명</td><td>${vo.bookName }</td></tr>
				<tr><td>저자</td><td>${vo.bookAuthor }</td></tr>
				<tr><td>도서가격</td><td>${vo.bookPrice }</td></tr>
				<tr><td>제조일</td>	<td><fmt:formatDate value="${vo.bookDate }" pattern="YYYY-MM-DD"/></td></tr>
				<tr><td>재고</td><td>${vo.bookStock }</td></tr>
				<tr><td>출판사 번호</td><td>${vo.pubNo }</td></tr>
		</table><br><br>
		<a href="<c:url value='/book/updateBookForm/${vo.bookNo }'/>">도서정보수정</a>
		<a href="javascript:deleteCheck();">[도서정보삭제]</a>
    
	    <!--  index 페이지로 이동 링크 추가 -->
		<a href="<c:url value='/'/>">[홈으로 이동]</a> 
	</body>
</html>