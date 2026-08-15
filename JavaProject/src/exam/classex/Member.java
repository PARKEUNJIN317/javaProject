package exam.classex;

import java.util.Scanner;

public class Member {

	private String id;
	private String name;
	private int age;
	private String phoneNo;
	private String address;
	
	public Member(String id, String name, int age, String phoneNo, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	public Member() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.print("아이디 입력 : ");
		this.id = sc.nextLine();
		System.out.print("성명 입력 : ");
		this.name = sc.nextLine();
		System.out.print("나이 입력 : ");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.print("전화번호 입력 : ");
		this.phoneNo = sc.nextLine();
		System.out.print("주소 입력 : ");
		this.address = sc.nextLine();
	}
	

	
	public void showMember() {
	
		System.out.println("---------- 회원 정보 출력 -------------");
		System.out.println("ID : " + id);
		System.out.println("성명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phoneNo);
		System.out.println("주소 : " + address);
	}
	
}
