package exam;
import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		
		System.out.print("단수입력 : ");
		i= sc.nextInt();
		
		for(j=1; j<10; j++) {
			System.out.println(i+"X"+j+"=" + i*j);
				
			}


	}

}
