package intermediate._00Thread;

public class Time extends Thread {
	boolean open;
	
	public Time(MenuTest mt) {
		
	}

	@Override
	public void run() {
		// 메뉴가 돌아가면서
		// 불린 값을 바꾸는 스레드를 실행하고
		// 메뉴 안에서 특정 메뉴는 불린의 참 거짓 여부를 판단해 실행
		// 가격을 변동
		
		while(true) {
			open = !open;
			System.out.println(open);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
