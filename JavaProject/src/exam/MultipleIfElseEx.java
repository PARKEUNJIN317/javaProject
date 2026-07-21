package exam;

import java.util.Scanner;
public class MultipleIfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3 ;
		
		System.out.print("숫자1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 입력 : ");
		num2 = sc.nextInt();
		System.out.print("숫자3 입력 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) 
				System.out.println("가장 큰 수 : " + num1);
		}
		if(num2 > num1) {
			if(num2 > num3)
				System.out.println("가장 큰 수 : " + num2);
		}
		if(num3 > num2) {
			if(num3 > num1)
				System.out.println("가장 큰 수 : " + num3);
		}

	}

}
