package basic._00Array;

public class ObjectArrayTest {
	public static void main(String[] args) {
		ObjectArray[] oaArr = new ObjectArray[10];
		for(int i=0; i<oaArr.length; i++) {
			System.out.println(oaArr[i].getName()); // -> java.lang.NullPointerException
			// oaArr[i].setName("a"); // -> java.lang.NullPointerException
			// oaArr[i] = new ObjectArray(); // 객체를 생성해야만 메모리에 올라감.
		}
	}
}
