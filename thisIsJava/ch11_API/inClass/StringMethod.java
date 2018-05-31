package thisIsJava.ch11_API.inClass;

public class StringMethod {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		// indexOf()
		int location = subject.indexOf("프로그래밍");
		System.out.println("location의 값 : " + location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바 관련 객체");
		} else
			System.out.println("자바와 무관한 객체");
		
		
		// length()
		System.out.println("subject의 길이 : " + subject.length());
		
		
		// replace()
		String newStr = subject.replace("자바", "C#");
		System.out.println(newStr);
		
		
		// substring()
		String sub = subject.substring(3, 5);
		System.out.println(sub);
		String sub2 = subject.substring(3);
		System.out.println(sub2);
		
		//toLowerCase(), toUpperCase()
		String logo = "apple";
		String printName = logo.toUpperCase();
		System.out.println(printName);
		String common = printName.toLowerCase();
		System.out.println(common);
		
		
		//trim()
		String a = "     aa";
		String aa = a.trim();
		System.out.println(aa);
	
	}

}
