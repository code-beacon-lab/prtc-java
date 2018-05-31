package thisIsJava.ch11_API.inClass;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMethod {
	public static void main(String[] args) {
		int score[] = {100,80,90};
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		System.out.println();
		
		Arrays.sort(score);
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		char test[] = {'a','b','s','w','s','a','s','d','q','s','z','f','h','c','e','ㄱ','ㄴ','ㄱ','ㅈ','ㄱ','ㅇ','ㅍ'};
		Arrays.sort(test);
		for(int i=0; i<test.length; i++) {
			System.out.print(test[i]);
		}
//		Arrays.sort(test, Collections.reverseOrder());
		for(int i=0; i<test.length; i++) {
			System.out.print(test[i]);
		}
	}
}
