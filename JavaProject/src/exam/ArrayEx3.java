package exam;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[10]; 
		int[] count = new int[10];
	
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
			System.out.print(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			count[num] += 1;  
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"의 개수 : "+ count[i]);
		}
		

	}

}
