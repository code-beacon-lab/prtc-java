package thisIsJava.ch15_collectionFramework.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExmaple {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("student1", 100);
		map.put("student2", 90);
		map.put("student3", 60);
		map.put("student4", 50);
		map.put("student5", 80);
		map.put("student6", 30);
		
		System.out.println(map.size());
		System.out.println(map.get("student1"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key+" : "+value);
		}
	}
}
