<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품검색결과</title>
</head>
<body>

	<table border="1">
		<tr><th>상품번호</th><th>상품명</th><th>제조사</th><th>가격</th><th>생산일</th><th>재고</th></tr>
		<c:forEach var="prd" items="${prdList }">
			<tr>
				<td>${prd.no }</td>
				<td>${prd.name }</td>
				<td>${prd.maker }</td>
				<td>${prd.price }</td>
				<td>${prd.date }</td>
				<td>${prd.stock }</td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>