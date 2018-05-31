package thisIsJava.ch08_interface.inClass.Countable;

public class Bird implements Countable {
	String name;
	Bird(String name) {
		this.name = name;
	}
	public void fly() {
		System.out.println("2마리 "+name+"가 날아간다.");
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 2마리 있다.");
	}
}
