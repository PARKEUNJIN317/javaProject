package sort;

import java.util.Arrays;

public class RedixBasicMain {

	private static final int MAX_COUNT = 15;
	public static void main(String[] args) {
		int[] arr = new int[MAX_COUNT];
		for(int i=0; i<MAX_COUNT; i++) {
			//0~MAX_COUNT 범위 내의 난수를 생성
			arr[i] = (int)(Math.random()*MAX_COUNT);
		}
		
		System.out.println("원본 배열 : " + Arrays.toString(arr));
		System.out.println();
		//RedixSort.sort(arr);
		int[] redixSort = arr.clone(); //원본 유지 위해 복사본 생성
		RedixSort.sort(redixSort);
		System.out.println("RedixSort 정렬 : " + Arrays.toString(redixSort));
		System.out.println();

	}

}
