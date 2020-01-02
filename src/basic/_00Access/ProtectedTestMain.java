package basic._00Access;

public class ProtectedTestMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		ProtectedTest pt = new ProtectedTest();
		pt.name = "your name";
		System.out.println(pt.name);
		ProtectedTest pt2= (ProtectedTest) pt.clone();
		System.out.println(pt2==pt);
		pt.name = "my name";
		System.out.println(pt.name);
		System.out.println(pt2.name);
	}

}
