package thisIsJava.ch15_collectionFramework.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime(); // Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
		for(int i=0 ; i<100000 ; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("Arraylist 걸린 시간 : " + ((double)(endTime - startTime)/1000000000) + "s");
		
		startTime = System.nanoTime();
		for(int i=0 ; i<100000 ; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist 걸린 시간 : " + ((double)(endTime - startTime)/1000000000) + "s");
	}

}
