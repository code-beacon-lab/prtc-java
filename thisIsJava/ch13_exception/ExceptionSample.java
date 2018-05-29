package thisIsJava.ch13_exception;

public class ExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSample sample = new ExceptionSample();
		sample.arrayOutOfBounds();
	}
	public void arrayOutOfBounds() {
		int[] intArray = new int[5];
		System.out.println(intArray[5]);
	}
}
