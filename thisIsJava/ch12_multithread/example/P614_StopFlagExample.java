package thisIsJava.ch12_multithread.example;

public class P614_StopFlagExample {

	public static void main(String[] args) {
		P615_PrintThread1 printThread = new P615_PrintThread1();
		printThread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			printThread.setStop(true);
		}
		printThread.setStop(true);
	}

}
