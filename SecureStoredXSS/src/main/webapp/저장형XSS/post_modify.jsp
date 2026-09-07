<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<body>
    <h1>글 수정</h1>
    <%
    try
    {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String db_address = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String db_username = "SQL_SELECT";
		String db_pwd = "1234";
        Connection connection = DriverManager.getConnection(db_address, db_username, db_pwd);

        request.setCharacterEncoding("UTF-8");

        int num = Integer.parseInt(request.getParameter("num"));

        //SQL 인젝션 방지 : num을 문자열에 직접 이어붙이지 않고 ?에 바인딩
        String selectQuery = "SELECT * FROM pratice_board WHERE num=?";

        PreparedStatement psmt = connection.prepareStatement(selectQuery);
        psmt.setInt(1, num);

        ResultSet result = psmt.executeQuery();

        Map<String, Object> board = new HashMap<String, Object>();
        if(result.next())
        {
        	board.put("num", result.getInt("num"));
        	board.put("writer", result.getString("writer"));
        	board.put("title", result.getString("title"));
        	board.put("content", result.getString("content"));
        }
        request.setAttribute("board", board);
    %>
        <form action="post_modify_send.jsp" method="post">
        <%-- c:out은 " 도 이스케이프하므로, 저장된 값에 따옴표가 있어도
             value 속성 밖으로 빠져나가는 공격(속성 이탈)을 막아줌 --%>
        <input type="hidden" name="num" value="<c:out value="${board.num}" />">
        <table border="1">
            <tr>
                <td>작성자</td>
                <td><input type="text" name="writer" value="<c:out value="${board.writer}" />"></td>
            </tr>
            <tr>
                <td>제목</td>
                <td><input type="text" name="title" value="<c:out value="${board.title}" />"></td>
            </tr>
            <tr>
                <td>내용</td>
                <td><textarea rows="10" cols="20" name="content"><c:out value="${board.content}" /></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit">수정</button>
                    <button type="button" onclick="location.href='post_list.jsp'">목록으로</button>
                    <button type="reset">원상복구</button>
                </td>
            </tr>
        </table>
        </form>
    <%
    }
    catch (Exception ex)
    {
    	out.println("오류가 발생했습니다. 오류 메시지 : " + ex.getMessage());
    }%>
</body>
</html>
