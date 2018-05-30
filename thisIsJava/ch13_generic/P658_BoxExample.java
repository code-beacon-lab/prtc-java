package thisIsJava.ch13_generic;

public class P658_BoxExample {
	public static void main(String[] args) {
		P658_Box box = new P658_Box();
		box.set("홍길동"); // String -> Object
		String name = (String) box.get(); // Object -> String
		
		box.set(new P658_Apple()); // Apple -> Object
		P658_Apple apple = (P658_Apple) box.get(); // Object -> Apple
	}
}
