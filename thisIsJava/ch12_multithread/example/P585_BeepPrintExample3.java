package thisIsJava.ch12_multithread.example;

public class P585_BeepPrintExample3 {

	public static void main(String[] args) {
		Thread thread = new P584_BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
			catch(Exception e) {}
	
		}

	}

}
