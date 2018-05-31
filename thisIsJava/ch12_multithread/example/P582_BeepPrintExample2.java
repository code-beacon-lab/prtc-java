package thisIsJava.ch12_multithread.example;

//import java.awt.Toolkit;

public class P582_BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beepTask = new P582_BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);}
			catch (Exception e) {}
		}
		
		// Runnale 익명 객체 이용
		/*Thread thread = new Thread(new Runnable()) {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					System.out.println("띵");
					try { Thread.sleep(500);}
					catch (Exception e) {}
				}
			}
		};*/
	}

}
