package _00Thread;

public class Menu extends Thread {

	public Menu() {
		this.print();
	}
	
	private void print () {
		while(true) {
			System.out.println("menu's print");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
