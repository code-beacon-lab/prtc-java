package thisIsJava.ch08_interface.example;

public class Television implements RemoteControl{
	public int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	System.out.println("Current TV volume : " + this.volume);	
	}
}
