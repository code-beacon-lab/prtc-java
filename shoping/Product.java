package shoping;
// Define product
public abstract class Product {
	// field
	String pName;
	int price;
	
	// concrete
	public void printDetail() {
		System.out.print("item : " + pName + ", ");
		System.out.print("price : " + price + ", ");
	}
	
	public abstract void printExtra();
}
