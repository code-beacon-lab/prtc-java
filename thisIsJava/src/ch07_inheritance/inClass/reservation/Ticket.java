package thisIsJava.ch07_inheritance.inClass.reservation;

import java.util.Scanner;

public class Ticket {
	//static final int originprice = 10000;
	String[] ticketrange = new String[10]; // 100 장 한정 판매의 경우 // 이걸 연결리스트에 넣는 방법
	String ticketNo;
	int price = 10000;
	
	String getTicketNo() {
		int ticket = (int) (Math.random()*10000);
		String ticketString = Integer.toString(ticket);
		
		for(int i=0; i<ticketrange.length; i++) {	
			if (ticketrange[i]==null) {
				ticketrange[i] = ticketString;
			} else if(ticketrange[9]!=null) {
				System.out.println("티켓이 모두 판매되어 구매할 수 없습니다. 감사합니다.");
				return "구매불가";
			} else {
				continue;
			}
		}
		
		
		if (ticket<1000 && ticket>=100) {
			ticketNo = "0" + ticketString;
		} else if (ticket<100 && ticket>=10) {
			ticketNo = "00" + ticketString;
		} else if (ticket<10) {
			ticketNo = "000" + ticketString;
		} else {
			ticketNo = ticketString;
		}
		// 중복 제거 필요
		return ticketNo;
	}
	
	void notice() {
		System.out.println("당신의 티켓 번호 : NO."+ticketNo);
		System.out.println("티켓 구매가 : "+price+"원\n//정가는 10,000원 입니다" );
	}
	
	void buyTicket() {
		getTicketNo();
		notice();
	}
	
	static void manual() {
		System.out.println("-------------------");
		System.out.println("사전 구매 시, 가격이 어떻고,");
		System.out.println("신용카드 사용 시, 가산이 어떻고,");
		System.out.println("-------------------\n\n");
	}
	
	static void app() {
		Scanner sc = new Scanner(System.in);
		do {
			AdvancedTicket advanceTicket = new AdvancedTicket();
			WalkUpTicket walkupTicket = new WalkUpTicket();
			System.out.println("----------------------------------");
			System.out.println("***   티켓 구매 방법을 선택해 주세요.    ***");
			System.out.println("1. 사전 구매 | 2. 현장 구매  | 3. 규정 /약관");
			System.out.println("----------------------------------");
		
			try {
				int selectNum = sc.nextInt();
				if (selectNum==1) {
					System.out.println("사전 구매를 선택하셨습니다.");
					System.out.println("몇 일 전 구매를 원하십니까?\n>");
					int beforeDay=sc.nextInt();
					advanceTicket.buyAdvanceTicket(beforeDay);
				
				} else if(selectNum==2) {
					System.out.println("현장 구매를 선택하셨습니다.");
					System.out.println("신용카드를 사용 하십니까?(Y/N)\n>");
					String anwser = sc.next();
					if (anwser.equals("Y")) {
						walkupTicket.buyWalkupTicket(true);	
					} else if (anwser.equals("N")) {
						walkupTicket.buyWalkupTicket(false);
					} else {
						System.out.println("Y 또는 N 만 입력 가능합니다.(대소문자 구분)");
					}
					
				} else if(selectNum==3) {
					Ticket.manual();
				}
			} catch(Exception e) {
				System.out.println("숫자만 입력이 가능합니다.");
				break;
			}
		} while(true);
	}
	
}
