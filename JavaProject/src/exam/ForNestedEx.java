package exam;

public class ForNestedEx {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=9; i++) {
			
			for(int j=2; j<=9; j++) {
				int multi=0;
				multi = i*j;
				System.out.print(j + "X" + i + "=" + multi + " ");
			}
			System.out.println();
		}

	}

}
