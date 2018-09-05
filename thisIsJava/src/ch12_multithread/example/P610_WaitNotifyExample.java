package thisIsJava.ch12_multithread.example;

public class P610_WaitNotifyExample {

	public static void main(String[] args) {
		P609_WorkObject sharedObject = new P609_WorkObject();
		
		P609_ThreadA threadA = new P609_ThreadA(sharedObject);
		P610_ThreadB threadB = new P610_ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();

	}

}
