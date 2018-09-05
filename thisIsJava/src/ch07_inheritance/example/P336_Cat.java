package thisIsJava.ch07_inheritance.example;

public class P336_Cat extends P335_Animal {
	public P336_Cat() {
		this.kind = "mammal";
	}
	
	@Override
	public void sound() {
		System.out.println("meow");
	}
}
