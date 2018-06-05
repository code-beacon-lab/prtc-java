package shoping;

public class CellPhone extends Product {
	String ISP;
	
	public CellPhone(String name, int price, String ISP) {
		this.pName = name;
		this.price = price;
		this.ISP = ISP;
	}
	@Override
	public void printExtra() {
	//	System.out.println("item : " + pName);
	//	System.out.println("price : " + price);
		System.out.println("ISP : " + ISP);
		
	}
	
}
