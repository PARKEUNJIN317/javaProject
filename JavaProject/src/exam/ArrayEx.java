package exam;
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] gram = new int[5];
		int[] list = new int[5];
		int[] read = new int[5];
		int[] total = new int[5];
		int count = 0;
		int[] grade = new int[5];

		System.out.println("*** 영어 시험 점수 입력 ***");
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1)+"번 성명 입력 : ");
			name[i] = sc.next();
			System.out.print((i+1)+"번 문법 점수 입력 : ");
			gram[i] =sc.nextInt();
			System.out.print((i+1)+"번 듣기 점수 입력 : ");
			list[i] =sc.nextInt();
			System.out.print((i+1)+"번 독해 점수 입력 : ");
			read[i] =sc.nextInt();
			
			count++;
			
			System.out.print("계속 입력하시겠습니까? (y입력하면 계속) :");
			String input= sc.next();
			if(!input.equals("y")) {
				break;
			}
	
		}
		for(int i=0; i<count; i++) {
			total[i] =gram[i]+list[i]+read[i];
			
			switch(total[i]/200) {
			case 4: grade[i] = 1; break;
			case 3: grade[i] = 2; break;
			case 2: grade[i] = 3; break;
			default: grade[i] = 4; break;
			}
		}
		
		System.out.println();
		System.out.println("*** 영어 시험 결과 ***");
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번 "+ total[i] +" "+ grade[i]+"등급");
		}
		
	
		
		
	}

}
