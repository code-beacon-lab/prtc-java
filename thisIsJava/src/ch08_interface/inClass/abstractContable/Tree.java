package thisIsJava.ch08_interface.inClass.abstractContable;

public class Tree extends Countable {
	String name = "사과나무";
	
	Tree(String owner, int num) {
		super(owner, num);
	}
	
	Tree(String owner) {
		super(owner);
	}

	@Override
	void count() {
		System.out.println(this.owner + "의 " + this.name + "이(가) " + this.num +"그루 있습니다.");		
	}
	
	void ripen() {
		
	}

}
