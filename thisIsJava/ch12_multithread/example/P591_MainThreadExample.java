package thisIsJava.ch12_multithread.example;

public class P591_MainThreadExample {

	public static void main(String[] args) {
		P592_Calculator calculator = new P592_Calculator();
		P592_User1 user1 = new P592_User1();
		user1.setCalculator(calculator);
		user1.start();
		
		P593_User2 user2 = new P593_User2();
		user2.setCalculator(calculator);
		user2.start();
	}

}
