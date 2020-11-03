package Section01_Basic.Chapter01_Variable.Item01;

public class VariableTest {
	public static void main(String[] args) {
		VariableTest va = new VariableTest();
		String tem = "a";
		va.change(tem);
		System.out.println(tem);
		
	}
	
	public void change(String str) {
		System.out.println(str);
		str = "b";
	}
}
