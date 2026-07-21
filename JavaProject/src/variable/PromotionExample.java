package variable;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 형변환
		//1byte -> 4byte byteValue의 리터럴이 대입되는 시점에 정수타입으로 확장
		byte byteValue = 10;
		int intValue = byteValue; 
		
		//2byte -> 4byte
		char charValue = '가'; //2byte
		intValue = charValue; //명시적 자동 형변환
		
		intValue = 500; 
		long longValue = intValue; //4byte -> 8byte 자동 형변환
		
		double doubleValue = intValue; // 작은크기의 정수가 큰 크기의 실수로 저장
		System.out.println(doubleValue);
		
		// 크기가 큰 실수를 정수변수에 저장할 경우 데이터 손실 발생(500 != 500.0) 
		// 개발자가 직접 결정해야함(강제타입 변환 필요)
		// Type mismatch: cannot convert from double to int
		// intValue = doubleValue;

	}

}
