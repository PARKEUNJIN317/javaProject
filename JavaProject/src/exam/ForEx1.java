package exam;

public class ForEx1 {

	public static void main(String[] args) {
		
		int i, sum=0;
		for(i=1; i<=10; i+=2) {
			sum +=i;
			System.out.println(i);
		}
		System.out.println("1~10홀수의 합:" + sum);

	}

}
