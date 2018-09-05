package thisIsJava.ch10_exception.example;

public class P423_NullPointerExceptionExample {

	public static void main(String[] args) {
		try {
		String data = null;
		System.out.println(data.toString());
		System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println("예외 발생");
		}
	}

}
