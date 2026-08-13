package datastructure.stack;

public class StackMain {

	public static void main(String[] args) {
		// Stack 클래스 활용 예시
		int stackSize = 5;
		
		// Stack 객체 생성
		Stack stk = new Stack(stackSize);
		
		System.out.print("스택 초기 상태 : ");
		 stk.showStack();
		 
		 System.out.println("\npop 수행");
		 stk.pop();
		 
		 System.out.println("\na, b, c push 수행");
		 stk.push('a');
		 stk.push('b');
		 stk.push('c');
		 
		 stk.showStack();
		 
		 System.out.println("\n최상위 값 : " + stk.peek());
		 
		 System.out.println("\nd, e push 수행");
		 stk.push('d');
		 stk.push('e');
		 stk.showStack();
		 
		 System.out.println("\nf push 수행");
		 stk.push('f'); // Overflow 발생
		 
		 System.out.println("\npop 2번 수행");
		 stk.pop();
		 stk.pop();
		 stk.showStack();
		 
		 System.out.println("\nclear 수행");
		 stk.clear(); // top -> -1
		 stk.showStack();
		 
		 System.out.println("\npop 수행");
		 stk.pop();
		 
		 System.out.println("\nh push 수행");
		 stk.push('h');
		 stk.showStack();
		 
		 
		 
		 
	}

}
