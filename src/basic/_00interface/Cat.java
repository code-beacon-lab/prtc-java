package basic._00interface;

public class Cat implements AnimalInterface {
	protected String name;
	@Override
	public void bark() {
		System.out.println("niyao");
	}

	@Override
	public void walk() {
		System.out.println("chooung chooung");
	}

}
