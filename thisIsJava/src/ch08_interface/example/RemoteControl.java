package thisIsJava.ch08_interface.example;

public interface RemoteControl {
	public static final int MAX_VOLUME=10;
	public static final int MIN_VOLUME=10;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
