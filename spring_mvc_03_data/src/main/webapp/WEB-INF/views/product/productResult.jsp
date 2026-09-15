<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	상품번호 : ${no }<br> 
	상품명 : ${name }<br>
	가격 : ${price }<br>
	제조사 : ${maker }<br>
	제조일 : ${date }<br>
	재고 : ${stock }<br>
	
	상품명 : <a href="/projectData/product/productDataView/${name}">${name }</a><br>
	
	상품명 : <a href="/projectData/product/productDataView/${name}/${stock}/${no}">${name }</a><br>
	
	
</body>
</html>