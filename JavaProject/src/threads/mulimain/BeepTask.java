package threads.mulimain;

import java.awt.Toolkit;

//Runnable인터페이스 run추상메서드 하나가 포함되어있음
//재정의할때 스레드가 동작할 코드를 포함시킴
public class BeepTask implements Runnable{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
