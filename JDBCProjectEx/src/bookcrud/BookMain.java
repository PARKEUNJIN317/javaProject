package bookcrud;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menuNo =null;
		
	
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

		}
	}

}
