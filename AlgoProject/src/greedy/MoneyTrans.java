package greedy;

import java.util.Scanner;

public class MoneyTrans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액입력 : ");
		int money = sc.nextInt();
		
		int[] unit = {5000,1000,500,100,50,10};
		
		for(int i=0; i<unit.length; i++) {
			System.out.println(unit[i] + "원:" + money/unit[i]); // 현재단위로 변환
			money = money % unit[i]; // 변환하고 남은금액
			
		}
		System.out.println("나머지 : " + money);
		
	}

}
