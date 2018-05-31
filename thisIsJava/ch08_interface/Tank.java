package thisIsJava.ch08_interface;

public class Tank implements Car, Cannon{
	@Override
	public void fire() {
		System.out.println("탱크가 대포를 발사합니다.");
		
	}

	@Override
	public void work() {
		System.out.println("탱크가 정찰 합니다.");
		
	}
	

}
