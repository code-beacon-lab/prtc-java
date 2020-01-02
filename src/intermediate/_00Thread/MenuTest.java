package intermediate._00Thread;

public class MenuTest {
	static boolean open;
	
	public static void main(String[] args) {
		MenuTest mt = new MenuTest();
		Thread b = new Time(mt);
		b.start();
		Thread a = new Menu();
		a.start();
	}
}
