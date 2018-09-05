package thisIsJava.ch11_API.inClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileClass03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("저장 키 : q");
		try {
			String path = "D:\\test\\"+name;
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
						String s;
			while(!(s=reader.readLine()).equals("q")) {
				writer.write(s+"\r\n");
			}
			reader.close();
			writer.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("program quit");
		System.out.println(name + "saved");
		
	}

}
