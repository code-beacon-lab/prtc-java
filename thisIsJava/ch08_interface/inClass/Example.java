package thisIsJava.ch08_interface.inClass;

public class Example {

	public static void main(String[] args) {
		ImplementC imp1 = new ImplementC();
		
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = imp1;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
