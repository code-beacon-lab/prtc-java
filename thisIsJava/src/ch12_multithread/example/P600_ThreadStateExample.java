package thisIsJava.ch12_multithread.example;

public class P600_ThreadStateExample {

	public static void main(String[] args) {
		P598_StatePrintThread statePrintThread =  new P598_StatePrintThread(new P599_TargetThread());
		statePrintThread.start();
	}

}
