<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>포매팅태그 라이브러리</title>
	</head>
	<body>
		<h3>fmt: formatNumber 태그 이용한 숫자 포맷팅</h3>
		<c:set var="price" value="1000000"/>
		기본(천단위 구분) :<fmt:formatNumber value="${price}" type="number"/><br>
		원화 : <fmt:formatNumber value="${price}" type="currency" currencySymbol="\\"/><br>
		원화 : <fmt:formatNumber value="${price}" type="currency" currencySymbol="￦"/><br>
		원화 : <fmt:formatNumber value="${price}" type="currency" currencySymbol="₩"/><br>
		달러 : <fmt:formatNumber value="${price}" type="currency" currencySymbol="$"/><br>
		천단위구분없음 : <fmt:formatNumber value="${price}" type="number" groupingUsed="false"/><br>
		퍼센트 :<fmt:formatNumber value="${price}" type="percent" groupingUsed="false"/><br>
		<hr>
		<h3>fmt:formatDate 태그 이용한 날짜 포맷팅</h3>
		<c:set var="now" value="<%= new Date() %>"/>
		<fmt:formatDate value="${now}" type="date"/><br><!-- 2026.9.1 -->
		<fmt:formatDate value="${now}" type="date" dateStyle="full"/><br><!-- 2026년 9월 1일 화요일 -->
		<fmt:formatDate value="${now}" type="date" dateStyle="short"/><br><!-- 26.9.1 -->
		
		<fmt:formatDate value="${now}" type="time"/><!-- 오후 4:25:11 -->
		<fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><!--오후 4:27:26 2026년 9월 1일 화요일 오후 4시 27분 26초 대한민국 표준시  -->
		
		<hr>
		<h3>fmt:formatDate 태그 이용한 날짜 포맷팅-출력형식 지정</h3>
		<fmt:formatDate value="${now}"  pattern="YYYY-MM-dd hh:mm:ss"/><br>
		
		<!-- 타임존 변경 -->
		<fmt:timeZone value="America/New York">
			<fmt:timeZone value=" ${now}" type="both" dateStyle="full" timeStyle="full"/>
		</fmt:timeZone>
	</body>
</html>