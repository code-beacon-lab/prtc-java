package thisIsJava.ch07_inheritance.example;

public class P333_PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		P333_SmartPhone smartphone = new P333_SmartPhone("Gildong-Hong");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

	}

}
