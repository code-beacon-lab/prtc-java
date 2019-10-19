package _00interface;

public class Dog implements AnimalInterface {

	@Override
	public void bark() {
		System.out.println("wal wal");
	}

	@Override
	public void walk() {
		System.out.println("jauk buck");
	}

}
