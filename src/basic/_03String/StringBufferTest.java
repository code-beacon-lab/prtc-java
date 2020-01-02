package basic._03String;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer strr = new StringBuffer();
		strr.append("http://localhost:8083/student/lecture/2019014120/qna/12312");
		
		String str = strr.toString();
		String[] pie = str.split("/");
		for(int i=0; i<pie.length; i++) {
			System.out.println(i+" : "+pie[i]);
		}
	}
}
