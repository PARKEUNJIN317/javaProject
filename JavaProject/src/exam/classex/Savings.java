package exam.classex;

import java.util.Scanner;

public class Savings {
	
	private String name;
	private int deposit; //예금액
	private int interest; //이자
	private int balance; // 잔액
	

	public void setName() {
		this.name =  "홍길동";
	}

	public void setBalance() {
		this.balance = 10000;
	}
	
	public String getName() {
		return name;
	}
	
	public void inputDeposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("예금액 입력 : ");
		deposit = sc.nextInt();
		balance += deposit;
		
	}
	
	public int getInterest() {
		interest = (int) (balance*0.1);
		balance  += interest;
		return interest;
	}
	

	public int getBalance() {
		return balance;
	}
	
	
	
	

}
