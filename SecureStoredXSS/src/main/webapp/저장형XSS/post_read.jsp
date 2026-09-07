<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.util.HashMap" %>
<%@page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>게시글 상세 열람</title>
</head>

<body>
	<h1>게시글 상세 열람</h1>
	<% try { 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			String user = "SQL_SELECT";
			String pwd = "1234";			
			Connection con = DriverManager.getConnection(url,user,pwd);	
			
			request.setCharacterEncoding("utf-8");
			String num = request.getParameter("num");
			
			String query = "SELECT * FROM pratice_board where num=?";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet result = pstmt.executeQuery();
			
			Map<String, Object> board = new HashMap<String, Object>();
			if(result.next()) {
				board.put("num", result.getInt("num"));
				board.put("writer", result.getString("writer"));
				board.put("title", result.getString("title"));
				board.put("content", result.getString("content"));
				board.put("regdate", result.getTimestamp("regdate"));
			}
			request.setAttribute("board", board);
	%>

	<table border="1">
		
			<tr>
				<td>번호</td>
				<td>
					<c:out value="${board.num}"/>
				</td>
			</tr>
			<tr>
				<td>작성일</td>
				<td>
					<c:out value="${board.regdate}"/>
				</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>
					<c:out value="${board.writer}"/>
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>
					<c:out value="${board.title}"/>
				</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>
					<c:out value="${board.content}"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button type=button onclick="location.href='post_list.jsp'">목록으로</button>
				</td>
			</tr>
		
	</table>
	<% } catch (Exception ex) { out.println("오류가 발생했습니다. 오류 메시지 : " + ex.getMessage());
    }%>

</body>
</html>