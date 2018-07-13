package thisIsJava.ch12_multithread.example;

public class P616_InterruptExample {

	public static void main(String[] args) {
		Thread thread = new P616_PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		
		thread.interrupt();
	}

}
