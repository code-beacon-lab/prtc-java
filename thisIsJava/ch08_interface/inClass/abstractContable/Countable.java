package thisIsJava.ch08_interface.inClass.abstractContable;

public abstract class Countable {
	protected String owner;
	protected int num;
	Countable (String owner) {
		this.owner = owner;
	}
	Countable (String owner, int num) {
		this.owner = owner;
		this.num = num;
	}
	abstract void count();
}
