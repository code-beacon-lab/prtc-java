package thisIsJava.ch12_multithread.example;

public class P593_User2 extends Thread {
	private P592_Calculator calculator;
	
	public void setCalculator(P592_Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
