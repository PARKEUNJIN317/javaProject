package exam.finalalgoex;

import java.util.Scanner;

public class StorageMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTreeStorage<Product> storage = new BinarySearchTreeStorage<Product>();

		menu : while(true) {
			System.out.println("=========== 재고 관리 시스템 ===========");
			System.out.println("1. 새 품목 등록");
			System.out.println("2. 재고 품목 반출");
			System.out.println("3. 재고 목록 확인");
			System.out.println("4. 종료");
			System.out.print("메뉴 선택 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo){
				case 1:
					
				case 2:
					
				case 3:
					
				case 4:
					System.out.println("프로그램을 종료합니다.");
					break menu;
					
				default:
					System.out.println("올바른 번호를 입력해 주세요.");
			}
		}
	}

}
