package exam.book_interface;

import java.util.ArrayList;

public interface IBookDAO {

	public void insertBook();
	public void deleteBook(String bookNum);
	public ArrayList<BookDTO> getALLBook();
	public void updateBook(BookDTO dto);
	public BookDTO searchBook(String bookNum);
}
