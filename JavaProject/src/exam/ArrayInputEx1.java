package exam;
import java.util.Scanner;

public class ArrayInputEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
		System.out.println("숫자입력");
		for(int i=0; i<score.length; i++) {
			System.out.printf("score[%d} : ",i);
			score[i] = sc.nextInt();
		}
		System.out.print("입력된 값: ");
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i]+" ");			
		}
		int max = score[0];
		for(int i=1; i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
	}

}
