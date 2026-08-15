package exam;

import java.util.Scanner;

public class StackParking {
	private int stackSize;
	private int top;
	private int[] carArr;
	
	public StackParking(int stackSize) {
		this.stackSize=stackSize;
		this.top = -1;
		this.carArr = new int[stackSize];
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
		public void push(int item) {
			if(isFull()) {
				System.out.println("만차입니다. 주차 공간이 없습니다.");
			}else {
				//top을 증가한 후 데이터 저장
				carArr[++top] = item;
				System.out.println("주차 완료했습니다.");
			}
		}
		// pop -> 데이터 삭제(top위치 데이터 반환)
		// 삭제할 데이터가 있는지 확인 : underflow
		public int pop() {
			if(isEmpty()) {
				System.out.println("주차장이 비어있습니다.");
				return 'E';
			}else {
				// 현재 top위치의 data 반환하고 top-1
				System.out.println("출차 완료했습니다.");
				return carArr[top--];
			
			}
		}
		
		// 저장된 데이터 중 가장 최근에 저장된 데이터를 반환
		// top위치의 데이터 반환만
		// 스택이 비어있는지 확인
		 public int peek() {
			 if(isEmpty()) {
				 System.out.println("주차장이 비었습니다");
				 return 'E';
			 }else {
				 return carArr[top];
			 }
		 }
		 
		 public int nowNum() {
			
			 return top +1;
		 }
		 
		 public int size() {
			 //stack의 data수 return
			 return top +1;
		 }
	

	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stackSize;
		
		while(true) {
			System.out.println("주차장을 구성합니다");
			System.out.print("주차면을 입력하세요");
			stackSize = sc.nextInt();
			System.out.print(stackSize + "대를 주차할 수 있는 주차장이 구성되었습니다");
			StackParking p = new StackParking(stackSize);
			
			System.out.println("메뉴");
			System.out.println("0.주차현황 / 1.자동차주차 / 2.자동차출차 / 3.만차여부 / 4.종료");
			int menuNo = sc.nextInt();
			
			
			switch(menuNo) {
			case 0 :
				System.out.println("현재 "+ p.size() +"대 주차 되어있습니다.");
				
				if(p.isFull()) {
					System.out.println("주차 할 수 없습니다");
					
				}else {
					System.out.println((stackSize -p.size()) +"대 주차 가능합니다.");
				}
				break;
				
			case 1 :
				System.out.print("차번호를 입력해주세요");
				int carNo = sc.nextInt();
				p.push(carNo);
				break;
				
			case 2 :
				p.pop();
				break;
				
			case 3 :
				if(p.isFull()) {
					System.out.println("현재 만차입니다");
					
				}else {
					System.out.println("주차 공간이 남았습니다.");
				}
				break;
				
			case 4 :
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
	}

}
