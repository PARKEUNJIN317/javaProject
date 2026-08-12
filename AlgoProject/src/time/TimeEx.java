package time;

public class TimeEx {

	public static void main(String[] args) {
		// 알고리즘의 성능 : 공간자원, 시간자원 사용량에 따라 달라짐
		// 시간자원 : 수행시간대신 시간복잡도를 사용(수행횟수를 의미 보통 반복문으로 정해짐)
		// 입력 n을 기준으로 몇번 수행하는가?
		int[] A = {1,2,3,4,5,6,7,8,9,10};
		int count = 0;
		
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum += A[i];
			
			count++;
		}
		
		System.out.println("실행횟수 : " + count);
		// 실행횟수 : 10
		// 배열이 입력이므로 입력크기 10 -> 수행횟수 10
		// 시간복잡도 T(10) -> 10  T(20) -> 20
		// T(n) -> n
		TimeEx2.calcTime();
		
	}
	
	class TimeEx2{
		public static void calcTime() {
			int[] A = {1,2,3,4,5,6,7,8,9,10};
			int count = 0;
			
			int sum = 0;
			for(int i=0; i<10; i++) {
				for(int j=0; i<10; j++) {
					sum += A[i];
					count++;
				}
			}
		
			System.out.println("실행횟수 : " + count);
			// 시간복잡도 : T(10) -> 100
			// 시간복잡도 : T(n) -> n*n
		}
	}

}
