package thisIsJava.ch10_exception.example;

public class NumberFormat {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a1000";
		
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		System.out.println(val1);
		System.out.println(val2);
		
//		int result = val1 + val2;
		int result = val1 + val2;
		System.out.println(result);

	}

}
