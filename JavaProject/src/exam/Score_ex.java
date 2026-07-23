package exam;
import java.util.Scanner;

public class Score_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = null;
		int student=0;
		int sum = 0;
		float avg=0;
		
		exam: while(true) {
			System.out.println("-------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
				System.out.print("학생수>");
				student = sc.nextInt();
				scores = new int[student];
				break;
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"] : ");
					scores[i] = sc.nextInt();
					sum += scores[i];
				}
				break;
			case 3: 
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"] : "+ scores[i]);
				}
				break;
			case 4: 
				int max = scores[0];
				for(int i=0; i<scores.length; i++) {
					if(max<=scores[i]) {
						max = scores[i];
					}
				}
				avg = (float)sum/scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : "+ avg);
				break;
			default : 
				System.out.println("프로그램종료"); break exam;
				
			
			}
			
		}
		
		

	}

}
