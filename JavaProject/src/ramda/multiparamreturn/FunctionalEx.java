package ramda.multiparamreturn;

public class FunctionalEx {

	public static void main(String[] args) {
		// 함수형 인터페이스 구현객체 구성(람다식)
		MyFunctionalInterface fi;
		//매개변수 있고, 반환문 있는 추상메서드 구현하는 람다식
		fi = (x,y)->{
			int result = x+y;
			return result;
		};
		fi.method(5,6);
		
		//매개변수 타입 생략가능
		fi = (x,y)->{ 
			return x+y;
		};
		fi.method(5,6);
		
		// 람다식 실행 블럭이 return한줄 문장이면 중괄호 생략가능
		//매개변수가 2개이상인 경우 소괄호 필요
		fi = (x,y)-> x+y;
		
		fi.method(5,6);
	}

}
