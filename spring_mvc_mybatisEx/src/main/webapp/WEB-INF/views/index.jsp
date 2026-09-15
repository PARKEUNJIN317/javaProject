<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관리 프로그램</title>
</head>
<body>

	<h3>도서관리시스템</h3>
	<br>
	<a href="<c:url value='/product/listAllBook'/>">전체도서조회</a><br>
	<a href="<c:url value='/product/newBookForm'/>">도서 등록</a>

</body>
</html>