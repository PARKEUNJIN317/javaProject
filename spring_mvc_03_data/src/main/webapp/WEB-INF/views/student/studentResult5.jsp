<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentResult5 - PathVariable 확인</title>
</head>
<body>
	<h3>URI(PathVariable)로 전달받은 학생 정보</h3>

	학번(stdNo) : ${stdNo }<br>

	<%-- stdName, stdYear는 {stdNo} 하나만 받는 요청에서는 전달되지 않으므로
		 empty 체크를 통해 값이 있을 때만 출력 --%>
	<c:if test="${not empty stdName}">
		성명(stdName) : ${stdName }<br>
	</c:if>

	<c:if test="${not empty stdYear}">
		학년(stdYear) : ${stdYear }<br>
	</c:if>

</body>
</html>
