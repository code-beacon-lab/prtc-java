package thisIsJava.ch15_collectionFramework.inClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("student", "학생");
		map.put("Movie", "영화");
		map.put("inheritance", "상속");
		map.put("polymorpism", "다형성");

		while (true) {
			System.out.print("알고 싶은 단어를 입력하세요 : ");
			String find = sc.nextLine();
			if(map.get(find)!=null) {
				System.out.println("입력하신 단어의 뜻은" + "\"" + map.get(find)+"\""+"입니다.\n");
			} else if(find.equals("q")) {
				System.out.println("종료합니다.");
//				break;
				return;
			}else {
				System.out.println("존재하지 않는 단어입니다. 철자를 다시 확인해주세요.");
			}

			
		}
	}

}
