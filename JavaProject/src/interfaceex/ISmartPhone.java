package interfaceex;

//interface이름은 관례적으로 대문자 I를 앞에 포함시킴. 이름의 첫글자도 대문자로 포함
//IAnimal
public interface ISmartPhone {
	//구현 클래스에서 필수 구현해야하는 메소드의 원형(선언부)을 나열
	//생성자 함수는 포함할 수 없음 - 인터페이스는 객체 인스턴스 생성 할 수 없음
	
	//구성요소 1 : 추상메소드
	public void sendCall();
	public void receivecall();
	public void sendSMS();
	public void receiveSMS();
	
	//구성요소2 : static final 상수 필드
	//구성요소3 : 디폴트메소드 : 구현한 메소드
	//구성요소4 : static 메소드 : 구현한 메소드

}
