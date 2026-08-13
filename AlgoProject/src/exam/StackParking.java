package exam;

import java.util.Scanner;

public class StackParking {
	private int stackSize;
	private int top;
	private char[] carArr;
	
	public StackParking(int stackSize) {
		this.stackSize=stackSize;
		this.top = -1;
		this.carArr = new char[stackSize];
	}
	
	//스택이 비어있는가?
		public boolean isEmpty() {
			return top == -1;
		}
		
		//스택이 가득 찼는가?
		public boolean isFull() {
			return top == stackSize-1; //전체 배열 원소수 -1이 마지막 index 값
		}
		
		//push -> 데이터 삽입
		public void push(char item) {
			if(isFull()) {
				System.out.println("Stack Full. Overflow");
			}else {
				//top을 증가한 후 데이터 저장
				carArr[++top] = item;
			}
		}
		// pop -> 데이터 삭제(top위치 데이터 반환)
		// 삭제할 데이터가 있는지 확인 : underflow
		public char pop() {
			if(isEmpty()) {
				System.out.println("StackEmpty");
				return 'E';
			}else {
				// 현재 top위치의 data 반환하고 top-1
				return carArr[top--];
			}
		}
		
		// 저장된 데이터 중 가장 최근에 저장된 데이터를 반환
		// top위치의 데이터 반환만
		// 스택이 비어있는지 확인
		 public char peek() {
			 if(isEmpty()) {
				 System.out.println("Stack Empty");
				 return 'E';
			 }else {
				 return carArr[top];
			 }
		 }
		 
		 public int nowNum() {
			
			 return top +1;
		 }
	

	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("주차장을 구성합니다");
		System.out.print("주차면을 입력하세요");
		int size = sc.nextInt();
		System.out.print(size + "대를 주차할 수 있는 주차장이 구성되었습니다");
		
		System.out.println("메뉴");
		System.out.println("0.주차현황 / 1.자동차주차 / 2.자동차출차 / 3.만차여부 / 4.종료");
		int menuNo = sc.nextInt();
		
		
		switch(menuNo) {
		case 1 :
			System.out.println("현재 "+  +)
		}
	}

}
