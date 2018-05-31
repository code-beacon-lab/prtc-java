package thisIsJava.ch08_interface.inClass.abstractContable;

public class Bird extends Countable {
	String name = "독수리";
	Bird(String owner, int num) {
		super(owner, num);
	}

	Bird(String owner) {
		super(owner);
	}
	
	@Override
	void count() {
		System.out.println(this.owner + "의 " + this.name + "이(가) " + this.num +"마리 있습니다.");	
	}
	
	void fly() {
		
	}
}
