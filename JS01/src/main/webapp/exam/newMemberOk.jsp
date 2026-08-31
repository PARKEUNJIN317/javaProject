<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Bean 속성값 출력</title>
	</head>
	<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id="member" class="exam.beans.MemberBean" scope="page">
		<jsp:setProperty property="*" name="member"/>
	</jsp:useBean>
	
	<h3>Bean 속성 값 출력</h3>
	아이디 : <%= member.getId() %>
	비밀번호 : <%= member.getPwd() %><br>
	성명 : <%= member.getName() %><br>
	이메일 : <%= member.getEmail() %>
	
	
	</body>
</html>