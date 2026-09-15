<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체도서조회</title>
</head>
<body>

	<h3>전체 도서 조회</h3>		
		<table border="1" width="600">
			<table border="1" width="600">
			<tr><th>도서번호</th>
			<th>도서명</th>
			<th>저자</th>
			<th>도서가격</th>
			<th>출판일</th>
			<th>재고</th>
			<th>출판사번호</th>
			</tr>
			
			<c:forEach items="${prdList}" var="book">
				<tr>
					<td><a href="<c:url value='/book/detailViewBook/${book.bookNo}' />">${b.bookNo}</a></td>
					<td>${book.bookName}</td>
					<td>${book.bookAuthor}</td>
					<td>${book.bookPrice }</td>
					<td>${book.bookCompany }</td>
					<td>${book.bookStock }</td>
					<td>${book.pubNo }</td>
					<td><fmt:formatDate value="${book.bookDate}" pattern="YYYY-MM-dd"/></td>					
				</tr>
			</c:forEach>						
		</table><br><br>

	
		<a href="/">홈으로 이동</a>

</body>
</html>