package variable;

public class OperationPromotionEx {

	public static void main(String[] args) {
		//연산식에서 자동 타입 변환
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// 정수 연산일 경우 int타입이 기본타입(4byte)
		// 더한 결과가 int 타입(타입불일치오류발생)
		//byte byteValue3 = byteValue1 + byteValue2; 
		int byteValue = byteValue1 + byteValue2;
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		// char도 정수이므로 연산결과는 int타입 (컴파일오류발생)
		//char charValue23 = charValue1 + charValue2;
		int charValue23 = charValue1 + charValue2;
		System.out.println(charValue23); //int형 변수값 출력
		System.out.println((char)charValue23); //char형 출력
		
		
		// java의 나누기 연산
		// int/int 결과는 정수
		int intValue3 = 10;
		int intValue4 = intValue3 /4; //10/4 =2를 반환 (실수 결과를 원하면 실수 연산을 해야함)
		System.out.println(intValue4); 
		
		// int/double = double형으로 int가 자동형변환발생
		int intValue5 =10;
		//int intValue6 = intValue5/4.0;
		double dValue6 = intValue5/4.0; //정수/실수 = 실수 결과 반환
		System.out.println(dValue6);
		
	}

}
