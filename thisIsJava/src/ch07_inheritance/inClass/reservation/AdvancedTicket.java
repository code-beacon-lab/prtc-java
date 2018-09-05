package thisIsJava.ch07_inheritance.inClass.reservation;

public class AdvancedTicket extends Ticket {
	public AdvancedTicket () {
		super();
	}
		
	int advancedTicketPriceByDay (int beforeDay) {
		if (beforeDay>=30) {
			this.price *= 0.5;
		} else if (beforeDay>=10) {
			this.price *= 0.8;
		} else {
			this.price *= 0.9;
		}
		return this.price;
	}
	
	int calcadvanceTicketPrice() {
		return 0;
	}
	
	@Override
	void notice() {
		System.out.println("*** 사전예약 티켓을 구매하셨습니다. ***");
		System.out.println("당신의 티켓 번호 : NO."+ticketNo);
		System.out.println("티켓 구매가 : "+price+"원\n(정가 : 10,000원)\n\n" );
	}
	
	void buyAdvanceTicket(int beforeDay) {
		getTicketNo();
		advancedTicketPriceByDay(beforeDay);
		notice();
	}
}
