<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관리 프로그램</title>
</head>
<body>

	<h3>도서관리시스템</h3>
	<br>
	<a href="<c:url value='/book/listAllBook'/>">전체도서조회</a><br>
	<a href="<c:url value='/book/newBookForm'/>">도서 등록</a>

</body>
</html>