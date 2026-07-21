package variable;

public class Final {

	public static void main(String[] args) {
		// 상수 : final 예약어 사용
		final double PI = 3.14;
		double radius = 10;
		double circleArea = 0;
		
		circleArea = radius * radius * PI;
		radius = 20.0; //변수값 변경 가능
		// PI =31.4; 상수 변경 불가능
		
		
		//println 메서드는 문자열을 파라미터로 전달받음
		// 아래 코드는 circleArea 변수의 값이 문자열 형변환 되어서 파라미터로 전달
		//파라미터 전달 전 문자열 결합연산(+) 사용가능
		System.out.println("원의면적 = " + circleArea);

	}

}
