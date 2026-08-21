package exam;

import java.util.Scanner;

import datastructure.stack.Stack;
public class StackEx1 {
	
	public static void main(String[] args) {
		/*
		 * 수식의 괄호 매칭 점검 프로그램
		 * 모든 괄호는 왼쪽 괄호가 나오고 오른쪽 괄호가 나옴
		 * 괄호는 가장 늦게 열린 괄호가 가장 먼저 닫힘
		 * ({[]})
		 * 점검1 : stack이 empty인데 }]) 만나서 pop을 호출 - 왼쪽 괄호 없음
		 * 점검2 : 수식의 괄호 검증이 끝났는데 스택이 비어있지 않은 경우 - 오른쪽 괄호가 없는 경우
		 * 점검3 : 스택에서 pop한 결과가 현재 보고 있는 오른쪽 괄호의 왼쪽 괄호가 아닐 경우 - 괄호 짝이 안맞는 경우
		 * 
		 */
		
		
		// 괄호가 포함된 수식을 입력받아 해당 수식의 괄호가 올바른지 확인하는 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("괄호가 포함된 수식을 입력하세요");
		 String str = sc.nextLine();
		 
		 boolean result = Stack.isBr(str);
		 System.out.println(result);

	}

}
