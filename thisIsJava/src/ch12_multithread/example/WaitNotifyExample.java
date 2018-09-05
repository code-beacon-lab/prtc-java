package thisIsJava.ch12_multithread.example;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsummerThread ConsummerThread = new ConsummerThread(dataBox);
		
		producerThread.start();
		ConsummerThread.start();
	}

}
