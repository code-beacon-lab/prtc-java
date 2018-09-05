package thisIsJava.ch12_multithread.example;

public class DeamonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
		}
		System.out.println("Exit main method.");
	}

}
