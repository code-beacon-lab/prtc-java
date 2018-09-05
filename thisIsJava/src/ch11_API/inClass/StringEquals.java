package thisIsJava.ch11_API.inClass;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("이름");
		String str2 = "이름";
		
		if(str1 == str2) {
			System.out.println("같은 객체");
		} else
			System.out.println("다른 객체");
		
		if(str1.equals(str2)) {
			System.out.println("같은 값");
		} else
			System.out.println("다른 값");
		
	}

}
