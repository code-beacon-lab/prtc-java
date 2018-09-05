package thisIsJava.ch15_collectionFramework.example;

import java.util.ArrayList;
import java.util.List;

public class P728_ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		(제네릭은 번거로운 타입 변환을 제거하는 용도 
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("myBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		
		System.out.println("************");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("************");
		
//		for(int i=0; i<list.size(); i++) {
//			String str = list.get(i);
//			System.out.println(i + " : "+str);
//		}
//		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("myBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : "+str);
		}

	}

}