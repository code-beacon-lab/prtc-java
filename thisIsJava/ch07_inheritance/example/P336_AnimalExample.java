package thisIsJava.ch07_inheritance.example;

public class P336_AnimalExample {

	public static void main(String[] args) {
		P336_Dog dog = new P336_Dog();
		P336_Cat cat = new P336_Cat();
		dog.sound();
		cat.sound();
		System.out.println("_______");
		
		P335_Animal animal = null;
		animal = new P336_Dog();
		animal.sound();
		animal = new P336_Cat();
		animal.sound();
		System.out.println("_______");
		
		animalSound(new P336_Dog());
		animalSound(new P336_Cat());
	}
	
	public static void animalSound(P335_Animal animal) {
		animal.sound();
	}
}
