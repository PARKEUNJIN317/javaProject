package api.pattern;

import java.util.regex.Pattern;

public class PatternEx {
	
	public static void main(String[] args) {
		String data = "010-123-1234";
		//전화번호는 02또는 010으로 시작하고 구분자-가 있고 가운데 번호(숫자)는 3자리 또는4자리가 올 수 있고 마지막 번호는 4자리
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		
		//Pattern클래스 static메서트 Pattern.matxhes(정규표현식,매칭할데이터)
		//true/false반환
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치 합니다");
		}else {
			System.out.println("정규식과 일치 하지않습니다");
		}
		
		//이메일확인
		//이메일은 영문으로 되어있어야 하고 @기호가 반드시 포함되어야함
		//@기호 앞에는 영문 한글자이상, .은 @기호 뒤에 있어야 함 @와.사이에는 영문1문자 이상
		// 이메일은 .가 두번이상 나올 수 있다
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		data = "angel@naver.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치 합니다");
		}else {
			System.out.println("정규식과 일치 하지않습니다");
		}
		
	}
}
