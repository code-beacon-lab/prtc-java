package thisIsJava.ch11_API.inClass;

public class StringCharAt {

	public static void main(String[] args) {
		String ssn = "180531-456789";
		char gender = ssn.charAt(7);
		switch(gender) {
			case '1':
				System.out.println("남자입니다.");
				break;
			case '2':
				System.out.println("남자입니다.");
				break;
			case '3':
				System.out.println("남자입니다.");
				break;
			case '4':
				System.out.println("남자입니다.");
				break;
		}
	}

}
