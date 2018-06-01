package thisIsJava.ch12_multithread.example;

public class P609_ThreadA extends Thread {
	private P609_WorkObject workObject;
	
	public P609_ThreadA(P609_WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}
