package thisIsJava.ch07_inheritance.inClass.reservation;

public class WalkUpTicket extends Ticket {
	boolean useCredit;
	
	int walkupTicketPriceByTerm (boolean useCredit) {
		if(useCredit) { 
			this.price *= 1.05;
		}
		return this.price;
	}
	
	@Override
	void notice() {
		System.out.println("*** 티켓을 현장 구매하셨습니다. ***");
		System.out.println("당신의 티켓 번호 : NO."+ticketNo);
		System.out.println("티켓 구매가 : "+price+"원\n(정가 : 10,000원)\n\n" );
	}
	
	void buyWalkupTicket(boolean useCredit) {
		getTicketNo();
		walkupTicketPriceByTerm(useCredit);
		notice();
	}
}
