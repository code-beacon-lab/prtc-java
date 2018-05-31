package thisIsJava.ch08_interface.example;

public class P368_Car {
	P367_Tire frontLeft = new P367_HankookTire();
	P367_Tire frontRight = new P367_HankookTire();
	P367_Tire backLeft = new P367_HankookTire();
	P367_Tire backRight = new P367_HankookTire();

	void run() {
		frontLeft.roll();
		frontRight.roll();
		backLeft.roll();
		backRight.roll();
		
	}
	
}
