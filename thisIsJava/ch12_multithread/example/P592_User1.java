package thisIsJava.ch12_multithread.example;

public class P592_User1	extends Thread {
	private P592_Calculator calculator;
	
	public void setCalculator(P592_Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
