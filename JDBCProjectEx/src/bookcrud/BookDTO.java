package bookcrud;

import java.sql.Date;

public class BookDTO {

	private String bookNo;
	private String bookName;
	private int bookPrice;
	private Date bookDate;
	private String pubNo;
	private String bookAuthor;
	private int bookStock;
	
	
	public BookDTO(String bookNo, String bookName, int bookPrice, Date bookDate, String pubNo, String bookAuthor, int bookStock) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDate = bookDate;
		this.pubNo = pubNo;
		this.bookAuthor = bookAuthor;
		this.bookStock = bookStock;
		
	}


	public String getBookNo() {
		return bookNo;
	}


	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	public Date getBookDate() {
		return bookDate;
	}


	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}


	public String getPubNo() {
		return pubNo;
	}


	public void setPubNo(String pubNo) {
		this.pubNo = pubNo;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public int getBookStock() {
		return bookStock;
	}


	public void setBookStock(int bookStock) {
		this.bookStock = bookStock;
	}

	
	
	
	
}
