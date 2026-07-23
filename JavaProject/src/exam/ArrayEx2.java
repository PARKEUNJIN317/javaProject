package exam;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int count=0;
	
		while(count<6) {
			int num = (int)(Math.random() * 45)+1;
			
			for(int i=0; i<count; i++) {
				if(lotto[i] == num) {
					break;
				}	
			}
			if(lotto[count] != num) {
				lotto[count] = num;
				count++;
			}
		}
		System.out.print("로또 번호 : ");
		for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

	}

}
