package exam.book_interface;

public class BookMain {

	public static void main(String[] args) {
		  IBookDAO dao = new BookDAO();
		  dao.insertBook();

	}

}
