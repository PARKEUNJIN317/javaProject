<%@ page language="java" contentType="text/html; charset=UTF-8"
import="java.util.*, exam.beans.ProductVO"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("utf-8");
%>

<%
    	ProductVO p1 = new ProductVO("111", "아이폰", 1300000, "애플");
	    ProductVO p2 = new ProductVO("222", "갤럭시울트라", 2000000, "삼성");
    	ArrayList<ProductVO> prdList = new ArrayList<>();
    	prdList.add(p1);
    	prdList.add(p2);
    	
    	request.setAttribute("prdList", prdList);
 %>
 <jsp:forward page="c_forEach_ArrayList_result_ex.jsp"/>
	
