package exam.instarray;

import java.util.Scanner;

public class Course {
	Scanner sc = new Scanner(System.in);
	String subject, teacher;
	int year, score; 
	

	public void input() {
		
		System.out.print("\n과목명 : ");
		subject = sc.next();
		System.out.print("교수 : ");
		teacher = sc.next();
		System.out.print("학년 : ");
		year = sc.nextInt();
		System.out.print("이수 학점 : ");
		score = sc.nextInt();
	}
	
	public void output() {
		System.out.println(subject + " " + teacher + " " + year + "학년 " + score + "학점");
		
	}

}
