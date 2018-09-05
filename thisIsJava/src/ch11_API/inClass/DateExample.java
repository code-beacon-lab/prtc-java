package thisIsJava.ch11_API.inClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM dd hh mm ss");
		String strnow = sdf.format(now);
		System.out.println(strnow);
	}

}
