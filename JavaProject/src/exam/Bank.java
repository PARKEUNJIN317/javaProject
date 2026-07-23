package exam;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int deposit,withdrawal, exit, num;
		int balance = 0;
		
		bank: while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금| 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:  
				System.out.print("예금액>");
				deposit = sc.nextInt();
				balance += deposit;
				break;
			case 2:
				System.out.print("출금액>");
				withdrawal = sc.nextInt();
				balance -= withdrawal;
				break;
			case 3: 
				System.out.println("잔고>" + balance);
				break;
			case 4:
				System.out.println("프로그램종료");
				break bank;
			}
			
		}
		
		

	}

}
