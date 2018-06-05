package shoping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	// 회원 정보 등록을 위한 배열 선언
	User users[] = new User[2];
	
	// 상품 정보 등록을 위한 배열 선언
	Product products[] = new Product[4];
	
	// 상품 추가를 위한 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	
	Scanner sc = new Scanner(System.in);
	
	int selUser; //select user
	
	String title; // name of shoping mall
	
	@Override
	public void setTitle(String title) {
		this.title = title;
		
	}

	@Override
	public void genUser() {
		User user = new User("사용자1", PayType.CARD);
		users[0] = user;
		user = new User("사용자2", PayType.CASH);
		users[1] = user;
	}

	@Override
	public void genProduct() {
		CellPhone cp = new CellPhone("갤럭시 S9", 10000000, "SKT");
		products[0] = cp;
		cp = new CellPhone("애플 아이폰x", 98000000, "KT");
		products[1] = cp;
		SmartTV st = new SmartTV("삼성 3D Smart TV", 5000000, "4K");
		products[2] = st;
		st = new SmartTV("LG Smart TV", 2500000, "Full HD");
		products[3] = st;
		//		for(int i=0; i<product.length; i++) {
//			if (i<2) {
//				CellPhone cell = new CellPhone(product[i].pName, product[i].price, sc.nextLine());
//				System.out.println("[" + i +"]상품명");
//				cell.printDetail();
//				cell.printExtra();
//			} else {
//				SmartTV tv = new SmartTV(product[i].pName, product[i].price, sc.nextLine());
//				System.out.print("[" + i +"]상품명 : ");
//				tv.printDetail();
//				tv.printExtra();
//			}
//		}
//		System.out.println("[h] 메인화면");
//		System.out.println("[c] 체크아웃");
	}

	@Override
	public void start() {
		System.out.println(this.title + " : Main - Account");
		System.out.println("==============================");
		for(int i=0; i<users.length; i++) {
			System.out.println("["+i+"]" + users[i].getName()+" "+ users[i].getPayType());	
		}
	/*	int i = 0;
	 * 	for(user u : users) {
	 * 		System.out.println("["+i+"]" + u.getName()+" "+ u.getPayType());
	 * 		i++;
	 * 	}
	 */
		System.out.println("[X] 종료 \n선택 : ");
		String sel = sc.next();
		System.out.println("##"+sel+"선택 ##");
//		if (sel.equals("0")) {
//			System.out.println(users[0].getName());
//		} else if (sel.equals("1")) {
//			System.out.println(users[1].getName());;
//		} else if (sel.equals("X")) {
//			System.out.println("bye");
//		}
		

		switch(sel) {
			case "X" :
				System.exit(0);
				break;
			default :
				selUser = Integer.parseInt(sel);
				productList();
		}
	}
	
	public void productList() {
		System.out.println(this.title + " : Product List - Selct");
		System.out.println("==============================");
		int i = 0;
		for(Product p : products) {
			System.out.print("["+i+"]");
			p.printDetail();
			p.printExtra(); // 이걸 바로 product에 연달아 넣어도 됌.
			i++;
	 	}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃\n선택 : ");
	
		String sel = sc.next();
		System.out.println("## "+sel+"선택 ##");
		
		switch(sel) {
			case "h" :
				start();
				break;
			case "c" :
				checkOut();
				break;
			default :
				int selPd = Integer.parseInt(sel);
				cart.add(products[selPd]);
				//sum += products[selPd].price;
				productList();
		}
	}
	
//	int selPd;
//	int sum;
	
	public void checkOut() {
		System.out.println(this.title + " : Checkout");
		System.out.println("==============================");
		int sum=0;
		for (int i=0; i<cart.size(); i++) {
			System.out.println(cart.get(i).pName);
			sum += cart.get(i).price;
		}
		
//		for(Product p : cart) {
//			System.out.println(p.pName + p.price);
//			sum += p.price;
//		}
		
		System.out.println("총 가격은 : "+sum+" 입니다.");
		System.out.println(users[selUser].getName()+"님의 " + "결제 수단은  "+ users[selUser].getPayType()+"입니다.");
		System.out.println("[p] 이전, [q] 결제 완료");
		
		
		String sel = sc.next();
		switch(sel) {
		case "p" :
			productList();
			break;
		case "q" :
			System.out.println("결제가 완료되었습니다. 종료합니다.");
			System.exit(0);
			break;
		default :
			checkOut();
		}
	}

}
