package thisIsJava.ch08_interface.inClass.phone;

public class SmartPhone extends PDA implements MobliePhone, MP3{
	@Override
	public void receiveCall() {
		System.out.println("** 전화를 받습니다.\n");
		
	}

	@Override
	public void sendCall(String to) {
		System.out.println("** "+to+"에게 전화를 겁니다.\n");
		
	}

	@Override
	public void receiveMessage() {
		System.out.println("** 메세지를 확인합니다.\n");
		
	}

	@Override
	public void sendMessage(String to, String text) {
		System.out.println("** 메세지를 보냅니다.");
		System.out.println("to. "+to);
		System.out.println(text+"\n");
		
	}

	@Override
	public void musicOn() {
		System.out.println("음악 재생을 시작합니다.\n");
		
	}

	@Override
	public void musicOff() {
		System.out.println("음악 재생을 종료합니다.\n");
		
	}

}
