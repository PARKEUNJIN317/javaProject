package bookcrud;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO implements IBookDAO{

	Connection con =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	BookDTO bDto = null;
	ArrayList<BookDTO> bookList = null;
	
	public BookDAO() {
		con = DBConn.getConnection();
	}
	
	@Override
	public void insertBook(BookDTO dto) {
		try {
			String sql = "insert into book values(?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,bDto.getBookNo());
			pstmt.setString(2,bDto.getBookName());
			pstmt.setInt(3,bDto.getBookPrice());
			pstmt.setDate(4,new java.sql.Date(bDto.getBookDate().getTime()));
			pstmt.setString(5,bDto.getPubNo());
			pstmt.setString(6,bDto.getBookAuthor());
			pstmt.setInt(7,bDto.getBookStock());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("도서 등록 성공");
			}else {
				System.out.println("도서 등록 실패");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBConn.close(pstmt);
		}	
	}

	@Override
	public ArrayList<BookDTO> getAllBook() {
		bookList = new ArrayList<BookDTO>();
		try {
			String sql = "select * from book";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookName = rs.getString(2);
				int bookPrice = rs.getInt(3);
				Date bookDate = rs.getDate(4);
				String pubNo = rs.getString(5); 
				String bookAuthor = rs.getString(6);	
				int bookStock = rs.getInt(7);
				
				bDto = new BookDTO(bookNo, bookName, bookPrice, bookDate, pubNo, bookAuthor,bookStock);
				bookList.add(bDto);
			}
			
			
		}catch(SQLException e) {
			System.out.println("전체 도서 정보 조회 오류 발생");
			e.printStackTrace();
		}finally {
			DBConn.close(pstmt,rs);
		}
		return bookList;
	}

	@Override
	public ArrayList<BookDTO> searchBookName(String bookName) {
		bookList = new ArrayList<BookDTO>();
		try {
			String sql = "select * from book where bookName=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(2, bookName);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String bookNo = rs.getString(1);
				bookName = rs.getString(2);
				int bookPrice = rs.getInt(3);
				Date bookDate = rs.getDate(4);
				String pubNo = rs.getString(5); 
				String bookAuthor = rs.getString(6);	
				int bookStock = rs.getInt(7);
				
				bDto = new BookDTO(bookNo, bookName, bookPrice, bookDate, pubNo, bookAuthor,bookStock);
				bookList.add(bDto);
			}
			
		}catch(SQLException e) {
			System.out.println("도서명 검색 오류 발생");
			e.printStackTrace();
		}finally {
			DBConn.close(pstmt,rs);
		}
		return bookList;
	}

	@Override
	public ArrayList<BookDTO> searchBookpub(String pubName) {
		bookList = new ArrayList<BookDTO>();
		try {
			String sql = "select * from book B inner join publisher P on B.pubNo=P.pubNo where P.pubName=?";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookName = rs.getString(2);
				int bookPrice = rs.getInt(3);
				Date bookDate = rs.getDate(4);
				String pubNo = rs.getString(5); 
				String bookAuthor = rs.getString(6);	
				int bookStock = rs.getInt(7);
				
				bDto = new BookDTO(bookNo, bookName, bookPrice, bookDate, pubNo, bookAuthor,bookStock);
				bookList.add(bDto);
			}
			
			
		}catch(SQLException e) {
			System.out.println("출판사 검색 오류 발생");
			e.printStackTrace();
		}finally {
			DBConn.close(pstmt,rs);
		}
		return bookList;
	
	}

	@Override
	public ArrayList<BookDTO> searchBookAuthor(String bookAuthor) {
		bookList = new ArrayList<BookDTO>();
		try {
			String sql = "select * from book where bookAuthor=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(6,bookAuthor);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookName = rs.getString(2);
				int bookPrice = rs.getInt(3);
				Date bookDate = rs.getDate(4);
				String pubNo = rs.getString(5); 
				bookAuthor = rs.getString(6);	
				int bookStock = rs.getInt(7);
				
				bDto = new BookDTO(bookNo, bookName, bookPrice, bookDate, pubNo, bookAuthor,bookStock);
				bookList.add(bDto);
			}
			
			
		}catch(SQLException e) {
			System.out.println("저자 검색 오류 발생");
			e.printStackTrace();
		}finally {
			DBConn.close(pstmt,rs);
		}
		return bookList;
	}

	@Override
	public void updateBook(BookDTO dto) {
		try {
			String sql = "update book set bookName=?, bookPrice=?, bookDate=?, pubNo=?, bookauthor=?, bookStock=?";
			pstmt =con.prepareStatement(sql);
			
			pstmt.setString(7,bDto.getBookNo());
			pstmt.setString(1,bDto.getBookName());
			pstmt.setInt(2,bDto.getBookPrice());
			pstmt.setDate(3,new java.sql.Date(bDto.getBookDate().getTime()));
			pstmt.setString(4,bDto.getPubNo());
			pstmt.setString(5,bDto.getBookAuthor());
			pstmt.setInt(6,bDto.getBookStock());
			
			pstmt.executeUpdate();
			
			System.out.println("도서 수정 성공");
			
			
		}catch(SQLException e) {
			System.out.println("수정 오류 발생");
			e.printStackTrace();
		}finally {
			DBConn.close(pstmt);
		}
		
	}

	@Override
	public void deleteBook(String bookNo) {
		try {
			String sql = "delete from book where bookNo=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bookNo);
			
			pstmt.executeUpdate();
			System.out.println(bookNo + "도서 data 삭제 성공");
			
		}catch(SQLException e) {
			System.out.println("삭제 오류 발생");
			e.printStackTrace();
		}finally {
			DBConn.close(pstmt);
		}
		
	}

	
}
