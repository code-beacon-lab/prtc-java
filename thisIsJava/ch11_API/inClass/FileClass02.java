package thisIsJava.ch11_API.inClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileClass02 {

	public static void main(String[] args) {
		File rfile = new File("D:\\test\\test.txt");
		File wfile = new File("D:\\test\\test_new.txt");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(rfile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(wfile));
			
			String s;
			while((s=reader.readLine()) != null) {
				writer.write(s+"-새로 쓰여진 파일");
			}
			reader.close();
			writer.close();
			rfile.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("새로 쓰기 완료");
	}

}
