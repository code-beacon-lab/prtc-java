package thisIsJava.ch12_multithread.example;

public class P607_JoinExample {

	public static void main(String[] args) {
		P607_SumThread sumThread = new P607_SumThread();
		sumThread.start();
		
		try {
			sumThread.join(); // sumThread가 종료할 때까지 메인 스레드를 일시정지
		} catch (InterruptedException e) {
		}
		
		System.out.println("1~100합 : " + sumThread.getSum());

	}

}
