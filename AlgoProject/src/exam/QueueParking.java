package exam;

import java.util.Scanner;
import datastructure.queue.MyQueueMove;

public class QueueParking {
	
	private MyQueueMove queue;
	
	public void parking(char item) {
		 if (queue.isFull()) {
	            System.out.println("주차 실패: 주차장이 가득 찼습니다.");
	            return;
	        }
	        queue.enqueue(item);             
	       
	        System.out.println(item + " 차량 주차 완료");
	    }


	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("주차장을 구성합니다");
		System.out.print("주차면을 입력하세요");
		int size = sc.nextInt();
		System.out.print(size + "대를 주차할 수 있는 주차장이 구성되었습니다");
		while(true) {
			System.out.println("메뉴");
			System.out.println("0.주차현황 / 1.자동차주차 / 2.자동차출차 / 3.만차여부 / 4.종료");
			int menuNo = sc.nextInt();
			
			
			switch(menuNo) {
			
				case 0 :
				
				case 1 :
					
				case 2 :
					
				case 3 :
					
				case 4 :
					System.out.println("종료합니다"); break
			
			}
		}
		
		
	}

}
