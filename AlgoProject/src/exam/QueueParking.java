package exam;

import java.util.Scanner;

public class QueueParking {
	
	private int queueSize;
	private int front; // 첫번째 요소 앞
	private int rear; //마지막 요소
	private int num ; // 현재 데이터 수
	private int[] queue; //큐 본체
	
	//생성자에서 초기화
	public QueueParking(int queueSize) {
		this.front =this.rear=-1;
		this.num = 0;
		this.queueSize = queueSize;
		queue = new int[queueSize];
	}
	
	//front와 rear의 값이 동일하면 데이터가 없는 상태
	public boolean isEmpty() {
		if(front == rear) {
			front = rear = -1;
		}
		return front == rear;
	}
	//rear포인터가 큐의 마지막 인덱스와 동일하고 데이터 수가 queueSize와 동일하면 Full
	public boolean isFull() {
		return (rear ==queueSize-1 && num ==queueSize);
	}
	
	//큐에 데이터 삽입
	public void enqueue(int item) {
		if(isFull()) {//마지막에 저장된 데이터가 큐의 마지막 원소로 저장되면 full
			//front에서 삭제 후 비었어도 검증하지 않음
			System.out.println("만차입니다. 주차할 수 없습니다.");
		}else if(rear == queueSize-1 && num !=0 ) {// 이동이 필요한 경우
			// 배열 copy로 이동을 구현 -> System.arrayCopy(소스, 소스의시작인덱스, 대상, 대상의 시작인덱스, copy할 원소수)
			// a배열에서 a배열로 copy가능
			System.arraycopy(queue, front+1, queue, 0, num);
			System.out.println("주차 완료");
			front = -1; // 이동한 큐는 0번 인덱스부터 값을 채웠음
			rear = num-1;// 이동한 큐의 원소는 기존 배열의 데이터 수이므로 데이터수 -1 인덱스
			queue[++rear] = item;
			num++;
			
		}else { //rear != queueSize-1 -> rear포인터 뒤에 공간이 있음
			queue[++rear] = item;
			num++;
		}
	}
	
	//큐에서 데이터 삭제
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("주차장이 비어있습니다");
			return 'E';
		}else {
			System.out.println("출차 완료");
			num--;
			front++;
			return queue[front]; //queue의 front포인터는 삭제할 데이터의 앞 index를 참조하고 있습니다
		}
	}
	
	//큐의 첫번째 데이터 추출 (저장된지 가장 오래된 data)
	public int peek() {
		if(isEmpty()) {
			System.out.println("주차장이 비어있습니다");
			return 'E';
		}else {
			return queue[front+1]; //front포인터 변경되면 안됨
		}
	}
	
	//큐 초기화
	public void clear() {
		front = rear = -1;
		System.out.println("clear");
	}
	
	//큐에 저장된 데이터의 수 반환
	public int size() {
		return num;
	}
	
	//큐에 저장된 모든 데이터를 출력
	public void showQueue() {
		if(isEmpty()) {
			System.out.println("주차장이 비었습니다.");
			
		}else {
			System.out.print("주차장 주차 차량 : ");
			for(int i=front+1;i<=rear;i++) {
				System.out.print(i + ":" + queue[i] + " ");
			}
			System.out.println();
		}
	}
	
	

	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("주차장을 구성합니다");
			System.out.print("주차면을 입력하세요");
			int queueSize = sc.nextInt();
			QueueParking q = new QueueParking(queueSize);
			
			System.out.print(queueSize + "대를 주차할 수 있는 주차장이 구성되었습니다");
			while(true) {
				System.out.println("메뉴");
				System.out.println("0.주차현황 / 1.자동차주차 / 2.자동차출차 / 3.만차여부 / 4.종료");
				int menuNo = sc.nextInt();
				
				
				switch(menuNo) {
				
					case 0 :
						q.showQueue();
						System.out.println((queueSize - q.size())+ "대 주차 가능합니다");
						break;
						
					case 1 :
						System.out.print("차량번호를 입력하세요");
						int carNo = sc.nextInt();
						q.enqueue(carNo);
						break;
						
					case 2 :
						q.dequeue();
						break;
						
					case 3 :
						if(q.isFull()) {
							System.out.println("현재 만차입니다");
							
						}else {
							System.out.println("주차 공간이 남았습니다.");
						}
						break;
						
					case 4 :
						System.out.println("종료합니다"); break;
				
				}
		
		
		}
		
		
	}

}
