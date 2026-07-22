package loop;

public class For {

	public static void main(String[] args) {
		// for (초기식; 조건식; 증감식;){반복문장}
		int i ;// main메소드 내 어디서든 사용가능
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.print("i 최종값 : ");
		System.out.println(i);
		
		
		for(int j=10; j<=30; j+=2) {
			System.out.println(j);
		}
		//for문 안에서 선언한 변수는 for문 밖에서 사용할수 없음
//		System.out.print("j 최종값 : ");
//		System.out.println(j);
		
		//1~100까지 더한값을 확인
		//1+2+3+4+5+6+...+100
		int k, sum=0;
		for(k=1; k<=100; k++) {
			sum += k;
		}
		System.out.println("1~"+ (k-1)+"합: " + sum);

	}

}
