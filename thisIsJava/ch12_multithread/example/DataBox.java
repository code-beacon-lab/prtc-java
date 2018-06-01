package thisIsJava.ch12_multithread.example;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {
			}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터 : " + returnValue);
		data = null;
		return returnValue;
	}
	
	public synchronized String setData(String data) {
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {
			}
		}
		this.data = data;
		System.out.println("ProduceThread가 읽은 데이터 : " + data);
		return data;
	}
}
