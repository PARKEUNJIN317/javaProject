package nestedclass.access;

public class A2 {

	//바깥 클래스 A2의 맴버 필드, 메소드
	int field1;
	void method1() {};
	
	//바깥 클래스 A2의 맴버 필드, 메소드
	static int field2;
	static void method2() {};
	
	class B2{//인스턴스 맴버클래스에서 바깥 클래스 필드와 메서드 접근
		void method() {
			field1 = 3;
			method1();
			field2 = 2;
			method2();
		}
	}
	
	static class C2{ //정적 맴버클래스 바깥 클래스 필드와 메서드 종류 상관없이 접근 사용해서 사용 가능한지
		void method() {
			//field1 = 3;
			//method1();
			field2 = 2;
			method2();
		}
	}
}
