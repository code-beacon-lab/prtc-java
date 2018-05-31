package thisIsJava.ch08_interface.inClass.phone;

public class GalaxyS8 {
	
	public static void main(String[] args) {
		SmartPhone galaxy = new SmartPhone();
		galaxy.sendCall("Mike");	
		galaxy.receiveCall();
		galaxy.musicOn();
		galaxy.musicOff();
		galaxy.receiveMessage();
		galaxy.sendMessage("Minho", "What's up!");
		System.out.println(galaxy.plus(3, 5));
		
	}
	
}
