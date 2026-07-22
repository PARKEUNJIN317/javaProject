package exam;
import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();
		
		int i =1;
		int score;
		double total=0;
		double avg;
		
		while(i<=num) {
			System.out.print("학생"+i+" 점수 입력 : ");
			score = sc.nextInt();
			total += score;
			i++;
		}
		avg = total/num;
		System.out.println("평균 : "+ avg);
		
		
	}

}
