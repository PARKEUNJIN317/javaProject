package exam;
import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int negative=0;
		int positive =0;
		int zero = 0;
		for(int i=1; i<=10; i++) {
			System.out.print("숫자"+i+" 입력 : ");
			int num = sc.nextInt();
			
			if(num < 0) {
				negative++;
			} else if(num > 0) {
				positive++;
			}else {
				zero++;
			}	
		}
		System.out.println("양수 개수 : "+ positive);
		System.out.println("음수 개수 : "+ negative);
		System.out.println("0의 개수 : "+ zero);

	}

}
