package thisIsJava.ch08_interface.inClass.phone;

public interface MobliePhone extends Phone {
	void receiveMessage();
	void sendMessage(String to, String text);
}
