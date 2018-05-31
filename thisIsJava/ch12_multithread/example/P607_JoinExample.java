package thisIsJava.ch12_multithread.example;

public class P607_JoinExample {

	public static void main(String[] args) {
		P607_SumThread sumThread = new P607_SumThread();
		sumThread.start();
		
//		try {
//			sumThread.join();
//		} catch (InterruptedException e) {
//		}
//		
		System.out.println("1~100합 : " + sumThread.getSum());

	}

}
