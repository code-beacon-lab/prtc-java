package thisIsJava.ch07_inheritance.example;

public class P328_InstanceofExample {
	public static void method1(P327_Parent parent) {
		if(parent instanceof P327_Child) {
			P327_Child child = (P327_Child) parent;
			System.out.println("method1 - Child로 변환");
		} else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}

	public static void method2(P327_Parent parent) {
		P327_Child child = (P327_Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		P327_Parent parentA = new P327_Child();
		method1(parentA);
		method2(parentA);
		
		P327_Parent parentB = new P327_Parent();
		method1(parentB);
		method2(parentB);
		
	}
}
