package Section1_Basic._02Condition;

import java.util.Random;

public class Aasdasd {
	public static void main(String[] args) {
		Random r = new Random();
		int numList[] = new int[5]; // 중복없는 문제 번호 만들기
		for(int k=0; k<5; k++) {
			numList[k] = r.nextInt(5);
			for(int l=0; l<k; l++) {
				if(numList[k] == numList[l])
					k--;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(numList[i]);
		}
	}
}
