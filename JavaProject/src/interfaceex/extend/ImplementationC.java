package interfaceex.extend;

//InterfaceC는 두개의 인터페이스 상속받음
//상위 인터페이스의 추상 메서드와 하위 인터페이스 추상메서드까지 모두 구현해야함(필수)
public class ImplementationC implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("CImplClass의 methodA()실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("CImplClass의 methodB()실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("CImplClass의 methodC()실행");
		
	}

}
