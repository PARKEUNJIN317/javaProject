package exam;
import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, amount, pay ;
		
		System.out.println("******* 상품정보 *******");
		System.out.println("1 노트북 : 1,200,000원");
		System.out.println("2 디지털카메라 : 400,000원");
		System.out.println("***************************");
		
		System.out.print("상품번호 입력: ");
		num = sc.nextInt();
		
		
		
		
		
		if(num == 1 || num == 2) {
			String name = (num == 1) ? "노트북" : "디지털카메라";
			 int price = (num == 1) ? 1200000 : 400000;
			 double discount;
			 
			 System.out.print("주문 수량 입력 : ");
			 amount = sc.nextInt();
			 pay = amount * price;
			 
			 if(pay >= 1000000) {
				discount = 0.1;
			 }else if(pay >= 500000) {
				 discount = 0.05;
			 }else {
				 discount = 0;
			 }
			 
			 int discountPay = (int)(pay * discount);
		      int total = pay - discountPay;
			 
			System.out.println("******* 주문 내용 *******");
			System.out.println("상품명 : " + name);
	        System.out.println("가격 : " + price + " 원");
	        System.out.println("주문 수량 : " + amount + " 개");
	        System.out.println("주문액 : " + pay + " 원");
	        System.out.println("할인액 : " + discountPay + " 원");
	        System.out.println("총지불액 : " + total + " 원");
		 
			
		} else {
			System.out.println("잘못 입력하였습니다. 종료합니다");
		}
		
		

	}

}
