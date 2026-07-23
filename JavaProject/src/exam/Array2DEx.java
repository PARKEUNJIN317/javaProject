package exam;
import java.util.Scanner;

public class Array2DEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		String[][] arr = {{"chair","의자"},{"computer","컴퓨터"},{"integer","정수"}};
		
		for(int i=0; i<arr.length; i++) {
			String en = arr[i][0];
			String ko = arr[i][1];
			
			System.out.print("Q" + (i+1) + "." + en +"의 뜻은? :");
			answer = sc.next();
			if(answer.equals(ko)) {
				System.out.println("정답입니다.");
			}else { 
				System.out.println("틀렸습니다. 정답은 "+ ko +"입니다.");
			}
			System.out.println();
		}
		
	}

}
