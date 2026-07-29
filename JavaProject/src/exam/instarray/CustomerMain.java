package exam.instarray;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, age;
		String name, phoneNum, job, gender;
		
		Customer[] c = new Customer[3];
		
		System.out.println("***** 고객 정보 입력 *****");
		for(int i=0; i<c.length; i++) {
			System.out.print("고객번호 : ");
			num = sc.nextInt();
			System.out.print("고객명 : ");
			name = sc.next();
			System.out.print("전화번호 : ");
			phoneNum = sc.next();
			System.out.print("직업 : ");
			job = sc.next();
			System.out.print("성별 : ");
			gender = sc.next();
			System.out.print("나이 : ");
			age = sc.nextInt();
			c[i] = new Customer(num, name, phoneNum, job, gender, age);
			
		}
		System.out.println("***** 고객 정보 출력 *****");
		for(int i=0; i<c.length; i++) {
			c[i].showCustomerInfo();
		}
		
		

	}

}
