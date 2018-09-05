package thisIsJava.ch08_interface.example;

public class Audio implements RemoteControl{
	public int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	System.out.println("Current Audio volume : " + this.volume);	
	}
	
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Audio를 무음 처리 합니다.");
		} else {
			System.out.println("Audio를 무음 해제 합니다.");
		}
	}
}
