package exam;

import java.util.Scanner;
public class TimeCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time, hour, min, sec;
		System.out.print("시간 입력(초) : ");
		time = sc.nextInt();
		
		hour = time / 3600;
		min = (time % 3600) / 60;
		sec = time % 60;
		
		System.out.println(time + "초는 " + hour + "시간, "+ min + "분, " + sec + "초입니다.");
		
		
		
		
		

	}

}
