package api.stringapi;

public class StringMethod {

	public static void main(String[] args) {
		// CharAt : 문자열의 특정위치(index)의 문자를 반환
		System.out.println("010624-1230123".charAt(7));
		if("010624-1230123".charAt(7) == '1') {
			
		}
		//getBytes() : 문자열을 byte배열로 반환
		//String.length() : 문자열 길이(문자갯수) 반환(공백문자도 하나의 문자로 포함됨)
		//Array.length() :  배열 원소수 반환
		// 문자열을 byte배열로 반환했을때 String.length()와 Array.legth()는 같을 수도 있고 다를 수도 있음
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes(); //문자열을 byte배열로 반환
		System.out.println("str 저장된 문자열의 길이는? " + str.length() + 
				"\nstr 저장 문자열의 byte배열 원소수는?"+ bytes1.length);
		
		//byte배열을 문자열로 변환
		String str2 = new String(bytes1);
		System.out.println(str2);
		
		//indexOf("시작위치를 알고자 하는 문자열") : 문자열이 객체에 포함되어져 있으면 index반환 , 포함되어있지 않으면 -1반환
		String subject = "자바 프로그래밍";
		System.out.println(subject.indexOf("프로그래밍"));
		System.out.println(subject.indexOf("프로그램"));
		
		//replace("원본문자열", "대치할 문자열") : 문자열에서 원본문자열을 찾아서 대치문자열로 대치함
		//replace가 적용된 무자열의 원본이 변환되지는 않음. 문자열에서 원본 찾아서 대치 후에 새로운 문자열로 반환
		String oldStr = "자바는 객체지향 언어 입니다. 자바는 풍부한 API를 지원 합니다";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//substring(int beginIndex, int endIndex) : 문자열에서 beginIndex부터 endIndex-1까지의 부분문자열을 반환
		//substring(int beginIndex) :  문자열에서 beginIndex부터 끝까지 문자열 추출 후 반환
		String ssn = "880815-1234567";
		System.out.println(ssn.substring(0,6)); //인덱스 0~5
		System.out.println(ssn.substring(7)); //인덱스 7~
		
		//toLowerCase(), toUpperCase()
		String str4 = "Java Programing";
		String str3 = "JAVA PROGRAMING";
		System.out.println(str4.equals(str3));
		System.out.println(str4.toLowerCase().equals(str3.toLowerCase()));
		System.out.println(str4.toUpperCase().equals(str3.toUpperCase()));
		
		//trim() : 문자열 앞뒤 공백 잘라내기
		System.out.print("    자바프로그래밍     ");System.out.print("공백확인");
		System.out.println();
		System.out.print("  자바프로그래밍   ".trim());System.out.print("공백확인");
		System.out.println();
		
		//split("구분문자열") : 문자열내에 구분 문자열을 찾아 분리후 배열에 저장 후 반환
		System.out.println("자바 프로그래밍".split(" ")); //[Ljava.lang.String;@1218025c
		
		//문자열 분리 예시
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		for(String name : names) {
			System.out.println(name);
			
		}
		//token: 분리된 문자열 단위, 특정 구분자로 분리되는 문자열의 구성요소
		//token : 의미론적으로 분리할 수 없는 최소 단위 "선생님께서 부르셨어요"
		
		//문자열 결합 연산자 : +
		//String 내부의 문자열 수정이 불가능 함
		//+연산자로 결합 후 새로운 문자열 리턴
		System.out.println("ABC"+"DEF");
	}

}
