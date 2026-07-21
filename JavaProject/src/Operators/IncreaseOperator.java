package Operators;

public class IncreaseOperator {

	public static void main(String[] args) {
		// 단항 연산자
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------------------------");
		// 증감 연산자 단독으로 사용되면 연산자의 위치는 상관 없음
		x++; // x = x+1
		++x; // x = x+1
		System.out.println(x);
		
		System.out.println("---------------------------------");
		// 증감 연산자 단독으로 사용되면 연산자의 위치는 상관 없음
		y--; // y = y-1
		--y; // y = y-1
		System.out.println(y);
		
		// 증감연산자 사용시 위치가 중요한 경우
		// 다른 연산자(대입연산자)와 같이 사용할 경우
		x = 10; y =10;
		
		// 증감연산을 변수 앞에 사용
		//변수 값을 증가시키고 값을 사용
		z = ++x;
		
		System.out.println("---------------------------------");
		System.out.println(x);
		System.out.println(z);
		
		// 증감연산을 변수 뒤에 사용
		// z값이 저장, 후에 y값 1증가
		//변수의 값을 먼저 사용하고 나중에 증가
		z = y++; 
				
		System.out.println("---------------------------------");
		System.out.println(y); 
		System.out.println(z);		
		
		//증감연산과 다른 연산자와 같이 사용(대입이 아닌 다른 연산자)
		x = 1; y = 1;
		
		z = ++x + 10;
		int z1 = y ++ + 10;
		
		System.out.println("---------------------------------");
		System.out.println(x); 
		System.out.println(z);	
		System.out.println(y);
		System.out.println(z1);
		
		// 논리 부정연산
		boolean bl = true;
		
		System.out.println("---------------------------------");
		System.out.println(!bl);
		
		// 비트 반전 연산자 : ~
		// 비트 데이터에 대해서 0을 1로 1은 0으로 반전
		// 정수타입(btye, short, int, long)만 피연산자가 될 수 있다.
		// 양수 10을 비트로 바꾸면 0 0000000 00000000 00000000 00001010
		// ~10은 1 1111111 11111111 11111111 11110101
		System.out.println(~10); 
		
		

	}

}
