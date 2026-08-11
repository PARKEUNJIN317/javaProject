package bookcrud;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import jdbc.crudmodule.StudentDTO;

public class BookReadWrite {

	public static BookDTO getBookInfo(Scanner sc) {
		
		BookDTO dto = null;
		
		try {
			
			System.out.println("도서 정보 등록");
			System.out.print("도서번호 입력 : ");
			String bookNo = sc.nextLine();
			
			System.out.print("도서명 입력 : ");
			String bookName = sc.nextLine();
			
			System.out.print("저자 입력 : ");
			String bookAuthor = sc.nextLine();
			
			
			sc.nextLine();
			
			System.out.print("가격 입력 : ");
			int bookPrice = sc.nextInt();
			
			
			System.out.print("발행일 입력 : ");
			String bookDatee = sc.nextLine();
			SimpleDateFormat fm = new SimpleDateFormat("yyyy-mm-dd");
			Date bookDate= fm.parse(bookDatee);
			
			
			System.out.print("재고 입력 : ");
			String bookStock = sc.nextLine();	
				
			
			System.out.print("출판사 번호 입력 : ");
			String pubNo = sc.nextLine();	
			
			dto = new StudentDTO(stdNo, stdName, stdYear, stdAddress, stdBirth, dptNo);
			
			
		}catch(Exception e) {
			System.out.print("입력오류");
			e.printStackTrace();
		}
		return dto;
		
	}
}
