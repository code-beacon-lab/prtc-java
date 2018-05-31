package thisIsJava.ch12_multithread.example;

public class P607_SumThread extends Thread {
	private long sum;
	
	public void run() {
		for(int i=0; i<=100 ; i++) {
			sum +=i;
		}
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
}
