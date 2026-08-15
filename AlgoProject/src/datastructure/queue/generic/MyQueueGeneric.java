package datastructure.queue.generic;

import java.util.EmptyStackException;

public class MyQueueGeneric <E>{

	private int queueSize;
	private int front; // 첫번째 요소 앞
	private int rear; //마지막 요소
	private int num ; // 현재 데이터 수
	private Object[] queue; //큐 본체
	
	//생성자에서 초기화
	public MyQueueGeneric(int queueSize) {
		this.front =this.rear=-1;
		this.num = 0;
		this.queueSize = queueSize;
		queue = new Object[queueSize];
	}
	
	public boolean isEmpty() {
		if(front == rear) {
			front = rear = -1;
		}
		return front == rear;
	}
	//rear포인터가 큐의 마지막 인덱스와 동일하면 full상태
	public boolean isFull() {
		return (rear ==queueSize-1);
	}
	
	//큐에 데이터 삽입
	public void enqueue(E item) {
		if(isFull()) {//마지막에 저장된 데이터가 큐의 마지막 원소로 저장되면 full
			//front에서 삭제 후 비었어도 검증하지 않음
			System.out.println("삽입 실패, Queue Full");
		}else {
			queue[++rear] = item;
			num++;
		}
	}
	
	//큐에서 데이터 삭제
	public E dequeue() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다");
			throw new EmptyStackException();
		}else {
			num--;
			front++;
			@SuppressWarnings("unchecked")
			E item = (E) queue[front];
			return item; //queue의 front포인터는 삭제할 데이터의 앞 index를 참조하고 있습니다
		}
	}
	
	public E peek() {
		if(isEmpty()) {
			System.out.println("peek 실패 Empty");
			throw new EmptyStackException();
		}else {
			@SuppressWarnings("unchecked")
			E item = (E) queue[front+1];
			return item; //front포인터 변경되면 안됨
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
			System.out.println("Queue Empty");
		}else {
			System.out.print("Queue items : ");
			for(int i=front+1;i<=rear;i++) {
				System.out.print(i + ":" + queue[i] + " ");
			}
			System.out.println();
		}
	}
	
	public int contains(String value) {
		if(isEmpty()) {
			System.out.println("Queue Empty");
		}else {
			for(int i=front+1; i<=rear; i++) {
				if(queue[i] == value) {
					return i;
				}
			}
			
		}
		return -1; //해당 value가 queue에 없음
	}
	
}
