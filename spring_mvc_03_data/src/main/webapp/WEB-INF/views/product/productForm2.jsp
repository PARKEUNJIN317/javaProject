<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품정보 등록</title>
</head>
<body>
	<form method="post" action="/projectData/product/newProduct2">
			상품번호 <input type="text" name="no"><br>
			상품명 <input type="text" name="name"><br>
			가격 <input type="text" name="price"><br>
			제조사 <input type="text" name="maker"><br>
			제조일 <input type="text" name="date"><br>
			재고 <input type="text" name="stock"><br>
			<input type="submit" value="등록"> <input type="reset" value="취소">
		</form>
		

</body>
</html>