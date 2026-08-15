package datastructure.stack.generic;

import java.util.EmptyStackException;

import datastructure.stack.Stack;

//generic타입의 클래스로 구성하고 객체 생성시 타입 결정
public class StackGeneric <E>{

	private int stackSize; //스택 크기
	private int top; // 스택포인터
	private Object[] stackArr; //스택 -> 모든 타입 처리 가능하도록  Object타입으로 구현 -> generic으로 형변환
	
	//생성자 : 스택초기화
		// 배열 index는 0부터 시작하므로 top은 -1로 초기값 설정
		public StackGeneric(int stackSize) {
			this.stackSize=stackSize;
			this.top = -1;
			this.stackArr = new Object[stackSize];
		}
		
		//스택 기능구현
		
		//스택이 비어있는가?
		public boolean isEmpty() {
			return top == -1;
		}
		
		//스택이 가득 찼는가?
		public boolean isFull() {
			return top == stackSize-1; //전체 배열 원소수 -1이 마지막 index 값
		}
		
		//push 되는 데이터 타입 generic
		public void push(E item) {
			if(isFull()) {
				System.out.println("Stack Full. Overflow");
			}else {
				//Object type 배열에 저장 -> generic타입이므로 나중에 item의 타입은 결정됨
				//Object는 최상위 클래스이므로 어떤 타입도 저장 가능
				stackArr[++top] = item;
			}
		}
		
		// pop -> 데이터 삭제(top위치 데이터 반환)
		// 삭제할 데이터가 있는지 확인 : underflow
		public E pop() {
			if(isEmpty()) {
				System.out.println("StackEmpty");
				//제네릭 타입을 반환해야 하는 경우 예외상황이면 예외를 던지는 방법을 많이 사용함
				throw new EmptyStackException();
			}else {
				// Object타입을 E타입으로 형변환 (E)
				@SuppressWarnings("unchecked")
				E item = (E) stackArr[top--];
				return item;
			}
		}
		
		 public E peek() {
			 if(isEmpty()) {
				 System.out.println("Stack Empty");
				 throw new EmptyStackException();
			 }else {
				 @SuppressWarnings("unchecked")
				 E item = (E) stackArr[top];
				return item;
			 }
		 }
		 
		 
		 // 스택을 비움
		 public void clear() {
			 // top을 -1로 초기화
			 top = -1;
		 }
		 
		 // 스택 내 저장된 모든 데이터 출력
		 // dump 
		 public void showStack() {
			 if(isEmpty()) {
				 System.out.println("Stack Empty");
			 }else {
				 System.out.print("Statck items : ");
				 for(int i=0; i<=top; i++) {
					 System.out.print(i + ":" + stackArr[i] + " ");
				 }
				 System.out.println("\ntop : " + top);
			 }
		 }
		 
		 ///////////////////////////////////////////
		 ///연습문제
		 ///
		 
		 public int size() {
			 //stack의 data수 return
			 return top +1;
		 }
		 																																																																																																																		
		 public int getCapacity() {
			 //전체 stack 용량 return
			 return stackSize;
		 }
		 
		 
		 public static boolean isBr(String str) {
			 Stack s = new Stack(str.length());
			 
			 for(int i=0;i<str.length(); i++) {
				 char ch = str.charAt(i);
				 
				 if(ch == '(' || ch =='{' || ch =='[') {
					 s.push(ch);
				 }
				 else if(ch ==')'||ch=='}'||ch==']') {
					 if(s.isEmpty()) {
						 return false;
					 }
					 char open = s.pop();
					 
					 if(ch ==')' && open != '(') return false;
					 if(ch =='}' && open != '{') return false;
					 if(ch ==']' && open != '[') return false;
				 }
			 }
			 
			 return s.isEmpty();
			 
		 }
}
