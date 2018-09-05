package thisIsJava.ch10_exception.example;

public class P424_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		try {
			int[] arr = new int[1];
			System.out.println(arr[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("not bad");
			System.out.println();
		}
	}

}
