package advanced._00Serialization;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Run {
	public static void main(String[] args) throws IOException {
		Member member = new Member("티에이","ta9@ta9.co.kr",25);
		byte[] serializedMember;
		try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			try(ObjectOutputStream oos = new ObjectOutputStream(baos)) {
				oos.writeObject(member);
				serializedMember = baos.toByteArray();
			}
		}
		
		System.out.println(Base64.getEncoder().encodeToString(serializedMember));
	}
}
