package bookcrud;

import java.util.ArrayList;

public interface IBookDAO {
	
	public void insertBook(BookDTO dto);
	
	public ArrayList<BookDTO> getAllBook();
	
	public ArrayList<BookDTO> searchBookName(String bookName);
	
	public ArrayList<BookDTO> searchBookpub(String pubName);
	
	public ArrayList<BookDTO> searchBookAuthor(String bookAuthor);
	
	public void updateBook(BookDTO dto);
	
	public void deleteBook(String bookNo);

	public BookDTO detailBook(String bookNo);

}
