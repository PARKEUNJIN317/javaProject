package exam;

import java.util.Scanner;

import datastructure.stack.Stack;
public class StackEx1 {
	
	public static void main(String[] args) {
		// 괄호가 포함된 수식을 입력받아 해당 수식의 괄호가 올바른지 확인하는 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("괄호가 포함된 수식을 입력하세요");
		 String str = sc.nextLine();
		 
		 boolean result = Stack.isBr(str);
		 System.out.println(result);

	}

}
