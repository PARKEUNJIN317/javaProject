package exam;
import java.util.Scanner;
public class InputEx {

	public static void main(String[] args) {
		Scanner sc ;
		sc = new Scanner(System.in);
		
		
		
		
		
		System.out.print("이름입력 : ");
		String name = sc.next();
		System.out.print("학년입력 : ");
		int year=sc.nextInt();
		System.out.print("점수입력 : ");
		double score = sc.nextDouble();
		System.out.print("학점입력 : ");
		String grade = sc.next();
		System.out.println("----------------------------");
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + year);
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);
		
		
		
		
		
		sc.close();
	}

}
