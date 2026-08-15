package exam.classex;

import java.util.Scanner;

public class Product {
	String prdName;
	int prdPrice;
	int prdSold;
	int prdStock;
	
	public void inputPrdInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**** 상품 정보 입력 ****");
		System.out.print("상품명 : ");
		prdName = sc.next();
		System.out.print("가격 : ");
		prdPrice = sc.nextInt();
		System.out.print("판매 수량 : ");
		prdSold = sc.nextInt();
		System.out.print("재고 수량 : ");
		prdStock = sc.nextInt();
	}
	
	public void showPrdInfo() {
		Product p = new Product();
		System.out.println("**** 상품 정보 출력 ****");
		System.out.println("상품명 : " + prdName);
		System.out.println("가격 : " + prdPrice);
		System.out.println("판매 수량 : " + prdSold);
		System.out.println("재고 수량 : " + prdStock);
		System.out.println("매출액 : " + p.salesAmount(prdPrice, prdSold));
		System.out.println("재고액 : " + p.stockAmount(prdPrice, prdStock));
	
	}
	
	public int salesAmount(int prdPrice, int prdSold) {
		return prdPrice*prdSold;
	}
	public int stockAmount(int prdPrice, int prdStock) {
		return prdPrice*prdStock;
	}

}
