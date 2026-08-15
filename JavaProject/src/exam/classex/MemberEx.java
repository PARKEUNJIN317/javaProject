package exam.classex;

import java.util.Scanner;

public class MemberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member hkd = new Member("hkd", "홍길동", 30, "010-1234-5678", "서울시 강남구 대치동");
		hkd.showMember();
		Member lml = new Member();
		lml.showMember();


	}

}
