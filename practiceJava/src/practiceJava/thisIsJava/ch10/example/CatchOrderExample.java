package practiceJava.thisIsJava.ch10.example;

public class CatchOrderExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행할 매개 값이 부족합니다.");
		}

	}

}
