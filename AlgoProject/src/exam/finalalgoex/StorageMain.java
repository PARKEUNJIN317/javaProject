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
				registerProduct(storage, sc);
				break;
			case 2:
				releaseProduct(storage, sc);
				break;
			case 3:
				printStock(storage);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break menu;
			default:
				System.out.println("올바른 메뉴를 선택해 주세요.");
			}
		}

		sc.close();
	}


	private static void registerProduct(BinarySearchTreeStorage<Product> storage, Scanner sc) {
		System.out.print("등록할 품목명 : ");
		String name = sc.nextLine().trim();

		System.out.print("등록할 재고 수량 : ");
		int stock;
		try {
			stock = Integer.parseInt(sc.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("수량은 숫자로 입력해 주세요.");
			return;
		}

		boolean added = storage.add(new Product(name, stock));
		if (added) {
			System.out.println(name + " 품목이 등록되었습니다.");
		} else {
			System.out.println("이미 등록된 품목입니다.");
		}
		printStock(storage);
	}


	private static void releaseProduct(BinarySearchTreeStorage<Product> storage, Scanner sc) {
		System.out.print("반출할 품목명 : ");
		String name = sc.nextLine().trim();

		System.out.print("반출할 수량 : ");
		int qty;
		try {
			qty = Integer.parseInt(sc.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("수량은 숫자로 입력해 주세요.");
			return;
		}

	
		int result = storage.updateStock(new Product(name), qty);

		if (result == -2) {
			System.out.println("반출하려는 품목이 창고에 없습니다.");
		} else if (result == -1) {
			System.out.println("반출수량만큼 재고가 없습니다.");
		} else if (result == 1) {
			System.out.println("재고 반출 완료");
		} else if (result == 0) {
			System.out.println("재고가 없는 품목이므로 재고 품목에서 삭제합니다.");
			storage.remove(new Product(name));
		}

		printStock(storage);
	}


	private static void printStock(BinarySearchTreeStorage<Product> storage) {
		System.out.print("재고 확인 : ");
		storage.preorder();
		System.out.println();
	}

}