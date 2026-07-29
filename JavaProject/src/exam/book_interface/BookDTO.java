package exam.book_interface;

public class BookDTO {
	
	private String bookName;
	private String bookNum;
	private String bookAuthor;
	private String bookPublish;
	
	public BookDTO(String bookName, String bookNum, String bookAuthor, String bookPublish) {
		this.bookName = bookName;
		this.bookNum = bookNum;
		this.bookAuthor = bookAuthor;
		this.bookPublish = bookPublish;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublish() {
		return bookPublish;
	}

	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}

}
