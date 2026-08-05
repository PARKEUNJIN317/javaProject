package collection.list;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// 제너릭 타입이 아닌 ArrayList
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("홍길동");
		ar.add(5.77);
		ar.add("자바");
		
		//list.get(index) : 해당 index원소의 값을 반환
		//list.size() : list원소 수 반환
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println();
		//list.get(index,값) 
		//가장 첫칸에 삽입 -> 나머지 칸은 모두 한칸씩 뒤로 이동(연산시간이 길 수 있음)
		ar.add(0,"변경");
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println();
		//list.remove(index) : index원소값 삭제, 이동 연산
		ar.remove(1);
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println();
		//list.contains(값) : list에 해당 값의 항목이 있는지 확인
		if(!ar.contains("홍길동")) {
			ar.add("홍길동");
		}
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

}
