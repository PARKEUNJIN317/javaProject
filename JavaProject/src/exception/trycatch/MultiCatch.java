package exception.trycatch;

public class MultiCatch {

	public static void main(String[] args) {
		// try~catch 블럭에서 여러개의 catch블럭을 구성할 수 있음
		int[] arr = {1,2,3};
		
		try {
			System.out.println(arr[5]);//예외 발생
			System.out.println(Integer.parseInt("100")); //예외 발생되면 아래 남아있는 try문장 실행되지 않는다
			System.out.println(arr[2]);//오류없음
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다");
			
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
			
		}finally {
			System.out.println("다시 실행");
		}
		
		//두개 이상의 exception을 처리하기 위해 catch를 여러번 구성할 수 도 있고
		//한개의 catch에 여러개의 exception 대입가능
		try {
			System.out.println(arr[5]);//예외 발생
			System.out.println(Integer.parseInt("100")); //예외 발생되면 아래 남아있는 try문장 실행되지 않는다
			System.out.println(arr[2]);//오류없음
			
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("예외발생");
		
		}finally {
			System.out.println("다시 실행");
		}

	}

}
