package extendsex.constructor;

class A{
	public A() { // 호출되면 실행 
		// 실행 후에 호출한 쪽으로 리턴
		System.out.println("기본 생성자 A");
	}
	
}

class B extends A {
	public B() {
		// B가 A를 상속 받았으므로 먼저 A클래스의 생성자 호출(컴파일러에 의해 자동 호출)
		// 리턴되는 영역
		System.out.println("기본 생성자 B");
	}
	public B(int x) {
		//생성자 오버로딩에 의해 매개변수가 있는 생성자
		System.out.println("매개변수 생성자 B" + x);
	}
}

class C extends B { // B가 A 를 상속 받았기 때문에 C는 B와 A를 상속 받는 결과가 됨
	public C() {
		// C가 B를 상속 받았으므로 먼저 B클래스의 생성자 호출(컴파일러에 의해 자동 호출) -리턴영역

		// B클래스가 2개의 생성자 함수가 있음
		// 컴파일러에 의해 자동호출되는 생성자는 매개변수가 없는 기본 생성자가 호출
		System.out.println("기본 생성자 C");
	}
}




public class ConstructorTest {

	public static void main(String[] args) {
		// C 클래스 객체 인스턴스 생성(생성자 호출)
		// 인스턴스 생성시 C클래스 생성자 호출 - 상속 관계에 있는 모든 객체가 생성됨
		C c  = new C();

	}

}
