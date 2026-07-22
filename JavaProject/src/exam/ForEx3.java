package exam;
import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start, end, i, sum=0;
		System.out.print("star 입력 : ");
		start = sc.nextInt();
		System.out.print("end 입력 : ");
		end = sc.nextInt();
		
		for(i=start; i<=end; i++) {
			sum +=i;
		}
		System.out.println(start + " ~ " + end + "의 합 : " + sum);

	}

}
