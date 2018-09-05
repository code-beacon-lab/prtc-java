package thisIsJava.ch13_generic.example;

public class P662_BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = P661_Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box<String> box2 = P661_Util.boxing("홍길동");
		String strValue = box2.get();

	}

}
