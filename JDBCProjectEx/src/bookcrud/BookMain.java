package bookcrud;

import java.util.ArrayList;
import java.util.Scanner;



public class BookMain {

	public static void main(String[] args) {
		IBookDAO dao = new BookDAO();
		
		Scanner sc = new Scanner(System.in);
		String menuNo =null;
		String searchNo = null;
		String bookNo = null;
		String bookName = null;
		String pubName = null;
		String bookAuthor = null;
		ArrayList<BookDTO> bookList = null;
		
	
		while(true) {
			try {
				System.out.println("**********************************************");
				System.out.println("               도서 관리 프로그램             ");
				System.out.println("**********************************************");
				
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 정보 조회");
				System.out.println("3. 도서 정보 수정");
				System.out.println("4. 도서 정보 삭제");
				System.out.println("5. 종료");
			
				System.out.println("---------------------------------------------");
				
				System.out.print("메뉴 번호 입력 : ");
				menuNo = sc.nextLine();
			}catch(Exception e) {
				System.out.print("잘못된 입력입니다. 다시 입력하세요");
			}

			switch(menuNo) {
			case "1" : // 도서등록
				dao.insertBook(BookReadWrite.getBookInfo(sc));
				break;
				
			case "2" : //정보조회
				System.out.println("-------- 도서 정보 조회 ---------");
				System.out.println("1. 모든 도서 정보 조회");
				System.out.println("2. 도서명 검색");
				System.out.println("3. 출판사명 검색");
				System.out.println("4. 저자명 검색");
				System.out.print("메뉴 번호 입력 : ");
				searchNo = sc.nextLine();
				
				switch(searchNo) {
				case "1" : 
					bookList = dao.getAllBook();
					BookReadWrite.writeBookInfo(bookList);
					break;
				case "2" : 
					System.out.println("도서명을 입력하세요");
					bookName = sc.nextLine();
					BookReadWrite.writeBookInfo(dao.searchBookName(bookName));
					break;
				case "3" :
					System.out.println("출판사명을 입력하세요");
					pubName = sc.nextLine();
					BookReadWrite.writeBookInfo(dao.searchBookpub(pubName));
					break;
				case "4" : 
					System.out.println("저자명을 입력하세요");
					bookAuthor = sc.nextLine();
					BookReadWrite.writeBookInfo(dao.searchBookAuthor(bookAuthor));
					break;
				default : System.out.println("잘못된 번호입니다.");
				}
				break;
				
			case "3" : //수정
				System.out.println("수정할 도서번호 입력 :");
				bookNo = sc.nextLine();
				BookReadWrite.writeBookInfo(dao.detailBook(bookNo));
				dao.updateBook(BookReadWrite.getBookInfo(sc));
				break;
				
			case "4" : //삭제
				System.out.println("삭제할 도서번호 입력 : ");
				bookNo = sc.nextLine();
				dao.deleteBook(bookNo);
				break;
				
			case "5" : //종료
				System.out.println("종료 합니다");
				sc.close();
				System.exit(0); //프로그램 종료
				break;
			default : 
				System.out.println("잘못된 입력입니다");
			
			}
		}
		
	
	}

}
