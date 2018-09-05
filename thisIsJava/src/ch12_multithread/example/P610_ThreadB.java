package thisIsJava.ch12_multithread.example;

public class P610_ThreadB extends Thread {
	private P609_WorkObject workObject;
	
	public P610_ThreadB(P609_WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}
