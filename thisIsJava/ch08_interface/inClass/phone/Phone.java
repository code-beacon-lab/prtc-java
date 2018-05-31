package thisIsJava.ch08_interface.inClass.phone;

public interface Phone {
	Button button1 = new Button();
	Button button2 = new Button();
	
	void receiveCall();
	void sendCall(String to);
}
