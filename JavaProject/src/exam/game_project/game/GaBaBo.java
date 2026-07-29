package exam.game_project.game;

import java.util.Scanner;

public class GaBaBo {
	Scanner sc = new Scanner(System.in);
	int userNum;
	int comNum;
	
	public void GaBaBo() {
		System.out.println("가위바위보 게임");
		System.out.println("가위바위보 게임 : 1.가위, 2.바위, 3.보");
		System.out.println("========================================");
		System.out.println("번호입력 : ");
		userNum = sc.nextInt();
		
		
	}

}
