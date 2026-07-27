package classInfo;

public class MainEx {

	public static void main(String[] args) {
		// 객체 변수 선언 및 인스턴스 생성
		Rectangle rec = new Rectangle();
		rec.input();
		rec.area();
		
		//클래스의 접근제한자 생략되어있으므로 필드 직접 접근가능
		//rec.height = 80;
		// 클래스 필드의 접근 제한자가 private이면 외부접근 불가능
	
		
		//필요한 클래스 모두 사용가능
		Car c1 = new Car();
		c1.carName ="아반떼";
		c1.carNo ="111가1234";
		c1.showCarInfo();
		
		//rec 객체에 포함된 car정보 메소드 호출
		rec.carInfo();
		

	}

}
