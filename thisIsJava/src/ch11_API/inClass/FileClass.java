package thisIsJava.ch11_API.inClass;

import java.io.File;
import java.io.FileWriter;

public class FileClass {

	public static void main(String[] args) {
		String path = "D:\\test\\test.txt";
		File file = new File(path);
		
		try {
			FileWriter filewriter = new FileWriter(file);
			for(int i='A'; i<='Z'; i++) {
				filewriter.write(i);
			}
			filewriter.close();
			System.out.println("쓰기 완료..");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
