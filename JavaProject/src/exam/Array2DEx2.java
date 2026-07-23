package exam;

public class Array2DEx2 {

	public static void main(String[] args) {
		int ko=0, en=0, math=0;
		int[] sum =new int[5];
		float[] avg = new float[5];
		int[][] arr = { 
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		System.out.println("번호 국어 영어 수학 총점 평균 \t");
		System.out.println("=====================================");
		for(int i=0; i<arr.length; i++) {
			ko += arr[i][0];
			en += arr[i][1];
			math += arr[i][2];
			
			for(int j=0; j<arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
			avg[i] = (float)(sum[i]/3.0);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"  ");
			for(int j=0; j<arr[i].length; j++ ) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.print(sum[i]+"\t"+ avg[i]);
			System.out.println();
			
		}
		System.out.println("=====================================");
		System.out.println("총점 : "+ ko+" "+ en+" " + math);
		

	}

}
