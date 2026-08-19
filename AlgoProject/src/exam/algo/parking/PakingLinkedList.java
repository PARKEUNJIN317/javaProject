package exam.algo.parking;

import java.util.Scanner;



public class PakingLinkedList {

	private ListNode head; 
	private int maxParking;
	
	//생성자
	public PakingLinkedList(int maxParking) {
		head=null;
		this.maxParking = maxParking;
	}
	
	//Node 삽입(마지막에 삽입)
	public void insertNode(String data) {
		if(isFull()) {
			System.out.println("만차입니다. 주차할 수 없습니다.");
			return;
		}
		ListNode newNode = new ListNode(data);
		
		if(head==null) { //List에 노드가 없는 경우
			this.head = newNode;
		}else {//List에 노드가 1개 이상 있는 경우-마지막 노드를 찾아서 연결
			//시작노드 주소인 head의 참조주소를 임시변수에 저장
			ListNode tempNode = head;
			while(tempNode.link != null) {
				tempNode=tempNode.link;
			}
			//마지막 노드 찾았으면 link에 새로운 노드 참조하도록 연결
			tempNode.link = newNode;
		}
	}
	
	//노드 중간에 새로운 노드 삽입
	//preNode->preNode 다음노드 주소가 newNode가 참조해야하는 주소
	public void insertNode(ListNode preNode, String data) {
		ListNode newNode = new ListNode(data);
		//preNode.link = newNode; //preNode.link newNode 주소로  update된 상태에서
		newNode.link = preNode.link; //preNode.link를 newNode.link로 저장하면 나머지 리스트는 연결 불가능
		preNode.link = newNode;
	}
	
	
	public void insertNode(int position, String data) {
		if(isFull()) {
			System.out.println("만차입니다. 주차할 수 없습니다.");
			return;
		}
		ListNode newNode = new ListNode(data);
		
		if(position <= 0 || head == null) {
			newNode.link = head;
			head = newNode;
			return;
		}
		
		ListNode preNode = head;
		int idex = 0;
		while(idex < position - 1 && preNode.link != null) {
			preNode = preNode.link;
			idex++;
		}
		
		insertNode(preNode, data);
	}
	
	/////////////////////////////////////////////////
	///Node 삭제
	
	//1. 중간 노드 삭제(전달된 data와 값이 동일한 node 삭제)
	//전달된 data와 값이 동일한 node중 첫번째 node 삭제
	public void deleteNode(String data) {
		ListNode preNode = head; //head참조하는 첫번째 노드의 주소
		ListNode tempNode = head.link; //첫번째 노드의 link필드의 값이 두번째 node
		
		//찾는 data가 첫번째 노드에서 찾아지는 경우
		if(data.equals(preNode.getData())) {
			head=preNode.link;//head는 두번째 node 참조
			preNode.link=null;
		}else {//두번째(tempNode) 노드부터 data가 찾아질때까지 node 이동
			while(tempNode!=null) {
				if(data.equals(tempNode.getData())){
					//데이터가 일치하는 node를 찾은 경우
					if(tempNode.link==null) { //마지막 노드에서 데이터가 일치한 경우
						preNode.link = null;//preNode는 tempNode 이전 node
					}else { // 찾은 노드가 마지막 노드가 아니면
						//preNode : 삭제 노드의 이전 노드, tempNode : 삭제할 노드
						preNode.link = tempNode.link ;
						tempNode.link = null;
						
					}
					break;
				}else {//데이터가 일치하지 않은 경우
					preNode = tempNode;
					tempNode = tempNode.link;
					
				}
			}
		}
		
	}
	
	//마지막 노드 삭제(data상관 없이 무조건 마지막 노드를 삭제)
	public void deleteNode() {
		ListNode preNode; //마지막 노드 이전 노드
		ListNode tempNode; //마지막 노드 
		
		// 노드가 없음
		if(head == null) {
			return;
		}
		//노드가 1개인 경우
		if(head.link == null) {
			head = null;
			
		}else { //노드가 두개 이상인 경우 마지막 노드를 찾아야함(마지막 노드의 link는 null)
			preNode = head;
			tempNode = head.link;
			
			while(tempNode.link != null) {
				preNode = tempNode;
				tempNode = tempNode.link;
			}
			//반복이 종료되면 마지막노드는 tempNode가 참조 마지막 이전노드는 preNode가 참조
			//preNode.link를 null로 설정해서 tempNode가 참조하는 노드의 연결을 끊는다
			preNode.link = null;
		}
	}
	
	// node 검색 : data를 전달해 해당 data가 linkedList에 있는지 확인 후 있으면 해당 노드의 참조를 반환
	public ListNode searchNode(String data) {
		ListNode tempNode = this.head; // 첫번째 노드 할당
		
		while(tempNode != null) { //다음 노드가 있는 동안 반복
			if(data.equals(tempNode.getData())) {
				//data탐색되면 탐색된 node의 참조주소가 반환됨
				return tempNode;
			}else {
				tempNode = tempNode.link; 
			}
			
		}
		return tempNode; //안찾아지면 최종 tempNode반환(이때 반환되는 값은 null)
		
	}
	//연결리스트의 모든 노드의 data 출력
	public void printList() {
		ListNode tempNode = this.head;
		
		//head부터 시작하여 마지막 노드까지 순회하면서 출력
		while(tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.link;
		}
		System.out.println();
	}
	
	public int size() {
		ListNode tempNode = this.head;
		int count = 0;

		while(tempNode != null) {
			tempNode = tempNode.link;
			count++;
		}
		return count;
	}
	
	// 연결리스트를 역순으로 재배치
	public void reverseList() {
		ListNode nextNode = head; // head가 참조하는 첫번째 node 할당
		ListNode currentNode = null;
		ListNode preNode = null;
		
		while(nextNode != null) {
			preNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.link;
			currentNode.link = preNode;
		}
		head = currentNode; //반복문을 벗어나면 currentNode는 마지막 node를 참조하게 됨
	}
	
	public boolean isFull() {
		if(size()>=maxParking) return true;
		else return false;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("주차장을 구성합니다");
		System.out.print("주차면을 입력하세요");
		int parkingSize = sc.nextInt();
		PakingLinkedList p = new PakingLinkedList(parkingSize);
		
		System.out.println( parkingSize + "대를 주차할 수 있는 주차장이 구성되었습니다");
		while(true) {
			System.out.println("메뉴");
			System.out.println("0.주차여부확인 / 1.자동차주차 / 2.자동차출차 / 3.만차여부 / 4.종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			
			switch(menuNo) {
			
				case 0 :
					p.printList();
					System.out.println(( parkingSize - p.size())+ "대 주차 가능합니다");
					break;
					
				case 1 :
					if(p.isFull()) {
						System.out.println("현재 만차입니다. 주차 할 수 없습니다.");
						
					}else {
						System.out.print("1.원하는 위치에 주차시겠습니까? / 2. 마지막 자리에 주차하시겠습니까?");
						int num = sc.nextInt();
						sc.nextLine();
						
						if(num == 1 ) {
							System.out.print("차량번호를 입력하세요");
							String carNo = sc.nextLine();
							System.out.print("주차 위치를 입력하세요(0부터" + parkingSize + "까지)");
							int position = sc.nextInt();
							sc.nextLine();
							p.insertNode(position, carNo);
						}else {
							System.out.print("차량번호를 입력하세요");
							String carNo = sc.nextLine();
							p.insertNode(carNo);
						}
					}
					break;
					
				case 2 :
					System.out.print("차량번호를 입력하세요");
					String carNo = sc.nextLine();
					p.deleteNode(carNo);
					break;
					
				case 3 :
					if(p.isFull()) {
						System.out.println("현재 만차입니다. 주차 할 수 없습니다.");
						
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
