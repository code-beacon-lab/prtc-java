package thisIsJava.ch07_inheritance.example;

public class P333_SmartPhone extends P332_Phone{
	public P333_SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
