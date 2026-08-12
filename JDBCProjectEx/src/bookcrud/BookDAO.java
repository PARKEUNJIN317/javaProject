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
			
			pstmt.setString(1,dto.getBookNo());
			pstmt.setString(2,dto.getBookName());
			pstmt.setString(3,dto.getBookAuthor());
			pstmt.setInt(4,dto.getBookPrice());
			pstmt.setDate(5,new java.sql.Date(dto.getBookDate().getTime()));
			pstmt.setInt(6,dto.getBookStock());
			pstmt.setString(7,dto.getPubNo());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("성공 : 도서 정보가 등록되었습니다.");
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
				String bookAuthor = rs.getString(3);
				int bookPrice = rs.getInt(4);
				Date bookDate = rs.getDate(5);
				int bookStock = rs.getInt(6);
				String pubNo = rs.getString(7); 
					
				bDto = new BookDTO(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
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
			pstmt.setString(1, bookName);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String bookNo = rs.getString(1);
				bookName = rs.getString(2);
				String bookAuthor = rs.getString(3);
				int bookPrice = rs.getInt(4);
				Date bookDate = rs.getDate(5);
				int bookStock = rs.getInt(6);
				String pubNo = rs.getString(7); 
					
				bDto = new BookDTO(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
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
			pstmt.setString(1, pubName);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookName = rs.getString(2);
				String bookAuthor = rs.getString(3);
				int bookPrice = rs.getInt(4);
				Date bookDate = rs.getDate(5);
				int bookStock = rs.getInt(6);
				String pubNo = rs.getString(7); 
					
				bDto = new BookDTO(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
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
			pstmt.setString(1,bookAuthor);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookName = rs.getString(2);
				bookAuthor = rs.getString(3);
				int bookPrice = rs.getInt(4);
				Date bookDate = rs.getDate(5);
				int bookStock = rs.getInt(6);
				String pubNo = rs.getString(7); 
					
				bDto = new BookDTO(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
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
			String sql = "update book set bookName=?, bookPrice=?, bookDate=?, pubNo=?, bookauthor=?, bookStock=? where bookNo=?";
			pstmt =con.prepareStatement(sql);
			
			 pstmt.setString(1, dto.getBookName());
		     pstmt.setInt(2, dto.getBookPrice());
		     pstmt.setDate(3,new java.sql.Date(dto.getBookDate().getTime()));
		     pstmt.setString(4, dto.getPubNo());
		     pstmt.setString(5, dto.getBookAuthor());
		     pstmt.setInt(6, dto.getBookStock());
		   	 pstmt.setString(7, dto.getBookNo());

			
			pstmt.executeUpdate();
			
			System.out.println("성공 : 도서정보를 수정하였습니다. 도서 정보 조회에서 확인하세요");
			
			
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
			System.out.println("성공"+ bookNo + "도서를 삭제 하였습니다. 도서 정보 조회에서 확인하세요");
			
		}catch(SQLException e) {
			System.out.println("삭제 오류 발생");
			e.printStackTrace();
		}finally {
			DBConn.close(pstmt);
		}
		
	}
	
	public BookDTO detailBook(String bookNo) {
		try {
			
		String sql = "select * from book where bookNo=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, bookNo);
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			bookNo = rs.getString(1);
			String bookName = rs.getString(2);
			String bookAuthor = rs.getString(3);
			int bookPrice = rs.getInt(4);
			Date bookDate = rs.getDate(5);
			int bookStock = rs.getInt(6);
			String pubNo = rs.getString(7); 
			
			bDto = new BookDTO(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
			
		}else {
			bDto=null;
		}			
	}catch(SQLException e) {
		System.out.println("오류발생");
		e.printStackTrace();
	}finally {
		DBConn.close(pstmt, rs);
	}
	return bDto;
	}

	
}
