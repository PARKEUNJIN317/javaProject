package exam.book_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO implements IBookDAO {
	ArrayList<BookDTO> bookList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void insertBook() {
		System.out.print("도서명 : ");
		String bookName = sc.next();
        System.out.print("도서번호 : ");
        String bookNum = sc.next();
        System.out.print("저자 : ");
        String bookAuthor = sc.next();
        System.out.print("출판사 : ");
        String bookPublish = sc.next();

        BookDTO dto = new BookDTO(bookName, bookNum, bookAuthor, bookPublish);
        bookList.add(dto);

        System.out.println("도서가 등록되었습니다.");
		
	}

	@Override
	public void deleteBook(String bookNum) {
		BookDTO target = searchBook(bookNum);
		
	}

	@Override
	public ArrayList<BookDTO> getALLBook() {
		
		return null;
	}

	@Override
	public void updateBook(BookDTO dto) {
		
		
	}

	@Override
	public BookDTO searchBook(String bookNum) {
		
		return null;
	}
	
	
}

