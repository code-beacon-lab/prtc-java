package thisIsJava.ch07_inheritance.example;

public class P336_Dog extends P335_Animal {
	public P336_Dog() {
		this.kind = "mammal";
	}
	
	@Override
	public void sound() {
		System.out.println("bau-bau");
	}

}
