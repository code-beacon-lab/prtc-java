package shoping;

public class ShopLauncher {

	public static void main(String[] args) {
		IShop shop = new MyShop();
		shop.setTitle("Myshop");
		shop.genUser();
		shop.genProduct();
		shop.start();
		
		
	}

}
