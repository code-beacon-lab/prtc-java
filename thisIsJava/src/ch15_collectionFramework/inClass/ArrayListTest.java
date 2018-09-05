package thisIsJava.ch15_collectionFramework.inClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
//		List<String> list1 = Arrays.asList("Stephan","Danial","Lebron", "Durant","Thomson");
		List<String> list1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1)+"번째 이름을 입력하세요.(공백없이)");
			list1.add(sc.next());
		}
		
		int max=0;
		String maxName = null;
		System.out.println("5명의 이름");
		System.out.println();
		
//		for(int i=0; i<list1.size(); i++) {
//			System.out.println((i+1)+ "번 "+ list1.get(i));
//			if(list1.get(i).length()>max) {
//				max = list1.get(i).length();
//				maxName = list1.get(i);
//			}
//		}
		
		int long1 = 0;
		
		for(int i=1; i<list1.size(); i++) {
			System.out.println((i+1)+ "번 "+ list1.get(i));
			if(list1.get(i).length()>list1.get(i+1).length()) {
				long1 = i;
			}
		}
		
		System.out.println();
		System.out.println("가장 긴 이름은 " + maxName+"이며, "+ max + "글자");
		
	}
}
