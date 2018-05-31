package thisIsJava.ch08_interface.example;

public class P368_CarExample {

	public static void main(String[] args) {
		P368_Car car = new P368_Car();
		
		car.run();
		System.out.println("");
		car.frontLeft = new P367_KumhoTire();
		car.run();
	}

}
