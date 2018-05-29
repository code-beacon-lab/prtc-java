package thisIsJava.ch13_exception;

public void arrayOutOfBoundsTryCatch() {
	try {
		int[] intArray = new int[5];
		System.out.println(intArray[5]);
	} catch (Exception e) {
		
	}
}