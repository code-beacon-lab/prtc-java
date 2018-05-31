package thisIsJava.ch10_exception.inClass;

public class Zero {
	public static void main(String[] args) { 
		try {
			System.out.println(5/0);	
		} catch (ArithmeticException e) {
			System.out.println(0+"으로 나눌 수 없습니다.");
		}
		
	}
}
