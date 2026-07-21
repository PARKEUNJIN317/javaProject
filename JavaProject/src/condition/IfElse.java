package condition;

import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		int score = 85;
		// if문 
		//조건이 참인 경우 실행문장만 확인함
		// 중괄호가 없으므로 조건문 바로 아래 한문장만 if 영역
		if(score>=90)
			System.out.println("등급이 A입니다"); // if 영역
			System.out.println("언제 실행되는 문장인가요?"); //if 영역 아님(if문과 상관없이 실행됨)
		
			if(score>=90) {
				System.out.println("등급이 A입니다"); // if 영역
				System.out.println("언제 실행되는 문장인가요?");//if영역
			}
				
		
		// if ~else 문
		// 조건이 참인 경우 거짓인 경우 각각 실행문장을 확인
			if(score>=90) 
				System.out.println("등급이 A입니다"); 
			else
				System.out.println("등급이 A가 아닙니다");
				System.out.println("언제 실행되는 문장인가요?"); // 조건과 상관없이 실행되는 문장
			
				
			if(score>=90) {
				System.out.println("등급이 A입니다"); 
				System.out.println("언제 실행되는 문장인가요?"); 
			}
			else
				System.out.println("등급이 A가 아닙니다"); //else 영역
				System.out.println("언제 실행되는 문장인가요?"); // 조건이 참일때 실행? 조건이 거짓일때 실행?
							
		//다중 if ~else
		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.print("점수 입력(0~100) : ");
		score = sc.nextInt();
		
		if(score >= 90) 
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else 
			grade = 'F';
			
		System.out.println("성적 : " + grade);
		
		sc.close();
		
		
			
	}

}
