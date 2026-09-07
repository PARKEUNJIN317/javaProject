<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection"%>
<%@page import= "java.sql.PreparedStatement"%>
<%@page import= "java.sql.ResultSet"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>게시글 목록</title>
</head>

<body>
	<form action="post_read.jsp" method="get">
		<h1>게시글 목록</h1>
		<% try { 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			String user = "SQL_SELECT";
			String pwd = "1234";			
			Connection con = DriverManager.getConnection(url,user,pwd);	
			
			String query = "SELECT * FROM pratice_board order by num desc";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet result = pstmt.executeQuery();	
			
			List<Map<String, Object>> boardList = new ArrayList<Map<String, Object>>();
			while(result.next()) {
				Map<String, Object> row = new HashMap<String, Object>();
				row.put("num", result.getInt("num"));
				row.put("writer", result.getString("writer"));
				row.put("title", result.getString("title"));
				row.put("regdate", result.getTimestamp("regdate"));
				boardList.add(row);
			}
			request.setAttribute("boardList", boardList);
		%>

			<table border="1">
				<tr>
					<td colspan="5">
						<h3>게시글 제목 클릭시 상세 열람 가능</h3>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<button type="button" value="신규 글 작성" onClick="location.href='post_new.jsp'">신규 글
							작성</button>
					</td>
				</tr>
				<tr>
					<td>번호</td>
					<td>작성자</td>
					<td>제목</td>
					<td>작성일</td>
					<td>관리</td>
				</tr>
				<c:forEach var="board" items="${boardList}">
						<tr>
							<td>
								<c:out value="${board.num}"/>
							</td>
							<td>
								<c:out value="${board.writer}"/>
							</td>
							<td><a href="post_read.jsp?num=${board.num}">
									<c:out value="${board.title}"/>
								</a></td>
							<td>
								<c:out value="${board.redgdate}"/>
							</td>
							<td>
								<button type="button" value="수정"
									onClick="location.href='post_modify.jsp?num=${board.num}'">수정</button>
								<button type="button" value="삭제"
									onClick="location.href='post_delete_send.jsp?num=${board.num}'">삭제</button>
							</td>
						</tr>
					</c:forEach>
			</table>
			<% } catch (Exception ex) { 
					out.println("오류가 발생했습니다. 오류 메시지 : " + ex.getMessage());				
				}%>
	</form>
</body>
</html>