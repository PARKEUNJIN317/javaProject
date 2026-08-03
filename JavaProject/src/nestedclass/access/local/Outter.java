package nestedclass.access.local;

//로컬클래스에서 사용제한
public class Outter {
	public void method2(int arg1) {//매개변수
		int localVariable1 = 1; //로컬변수
		
		class Inner{//로컬클래스
			public void method() {
				// 처리 진행 시 매개변수나 로컬 변수 사용시 final인 것만 사용하자
				int result = arg1 + localVariable1;
			}
			
		}
	}

}
