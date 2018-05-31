package thisIsJava.ch12_multithread.example;

public class P604_YieldExample {

	public static void main(String[] args) {
		P605_ThreadA threadA = new P605_ThreadA();
		P606_ThreadB threadB = new P606_ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = false;
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = true;
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
		
		

	}

}
