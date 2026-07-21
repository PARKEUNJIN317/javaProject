package variable;

public class CastingExample {

	public static void main(String[] args) {
		// 강제 타입 변환
		int intValue = 44032;
		char charValue = (char)intValue; // 강제 형변환 기호 : (타입)
		System.out.println(charValue);
		
		intValue = 103029770;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);

	}

}
