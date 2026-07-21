package variable;

public class DataType {

	public static void main(String[] args) {
		// 정수타입 : 기본타입 int, long형은 기본타입이 아니기 때문에 리터럴 뒤에 l/L 추가해야함.
		int four = 100 ; //4byte
		long fourD = 100; //8byte
		
		// 100010001000100 4byte로도 표현 불가능한 가중치의 정수임
		// 4byte로 표현하려고해서 오류가 발생
		// 4byte로 표현하지 말고 8byte로 처리하도록 l/L을 추가해야함
		long longValue = 100010001000100L;
		System.out.println(longValue); System.out.println(four);
		System.out.println("===============================================");
		
		//문자타입 변수 선언
		char a = 'A'; //문자 A
		char b = '\u0041'; // 문자 A의 유니코드 값
		char c =65; //문자A의 아스키코드값
		
		System.out.println(a); System.out.println(b); System.out.println(c);
		System.out.println("===============================================");
		
		//실수 타입 : 소수점이 있는 실수값을 저장하기 위한 타입
		// float(4byte) / double(8byte) 실수의 기본타입
		//기본타입은 리터럴을 표현할 때 준비하는 크기를 의미함
		
		double avg = 88.5; //8byte리터럴을 8byte변수에 대입(동일크기이므로 문제없음)
		//float avg1 = 88.5; //8byte리터럴을 4byte변수에 대입(큰 타입을 작은 타입에 넣어서 문제가 생김)
		float avg2 = 88.5f;// 실수 리터럴 8byte가 아닌 4byte로 처리후 4btye변수에 대입(오류없이 처리)
		
		double doubleValue = 0.123456789123456789;
		float floatValue = 0.123456789123456789f;
		
		System.out.println("doubleValue : " + doubleValue); //double타입이 더 정밀함
		System.out.println("floatValue : " + floatValue);
		System.out.println("============================================");
		
		//실수의 지수 표현
		int var1 = 3000000;
		double var2 = 3000000;
		double var3 = 3e6;
		float var4 = 3e6f;
		double var5 = 2e-3;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("============================================");
		
		//문자열 : 참조타입 String -> 큰 따옴표 이용 문자열 리터럴을 생성하고  String타입 변수에 저장
		//기본변수 : 값저장,    참조형변수 (문자열등) : 값이 있는 메모리의 주소
		String name = "홍길동"; //문자열 홍길동은 메모리의 특정공간에 저장되고 name변수에는 홍길동이 저장된 시작주소가 저장됨
		String addr = "서울시 강남구 역삼동";
		
		//논리형(boolean)타입
		boolean booleanValue = true;
	}

}
