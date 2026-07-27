package extendsex.constructor;


class A1{
	public A1() { 
		System.out.println("기본 생성자 A");
	}
}

class B1 extends A1 {
	public B1() {
		System.out.println("기본 생성자 B");
	}
	public B1(int x) {
		System.out.println("매개변수 생성자 B : " + x);
	}
}

class C1 extends B1{  //B가 A를 상속 받았기 때문에 C는 B와A를 상속받는 결과가 됨
	public C1() {
		// 명시적으로 상위 클래스 생성자 호출 - super()메소드 이용
		super(10); //B클래스 생성자 명시적 호출 - 매개변수가 있는 생성자 호출
		System.out.println("기본 생성자 C");
		//super(200); // 상위 클래스 생성자는 무조건 첫번째 라인에서 호출해야함
	}
}




public class ConstructorTest2 {

	public static void main(String[] args) {
			C1 c1  = new C1();
			
	}
}

