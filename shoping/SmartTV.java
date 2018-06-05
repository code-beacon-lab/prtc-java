package shoping;

public class SmartTV extends Product {
	String pixel;
	
	public SmartTV (String name, int price, String pixel) {
		this.pName = name;
		this.price = price;
		this.pixel = pixel;
	}
	
	@Override
	public void printExtra() {
		System.out.println("pixel : " + pixel);
	}

}
