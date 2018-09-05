package thisIsJava.ch08_interface.example;

public class RemoteController {

	public static void main(String[] args) {
		RemoteControl rc; //인터페이스 타입변수 rc
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);

		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		RemoteControl.changeBattery();
	}

}
