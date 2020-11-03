package Section1_Basic._00Inheritance.method;

import java.lang.reflect.Method;

public class SomeController extends SomeParentController {
	public static void main(String[] args) {
		SomeController s = new SomeController();
		s.shouting();
		s.printMethodList();
	}
	
	public void shouting() {
		System.out.println("super.makeSomeNoise() : " + super.makeSomeNoise());
		System.out.println("this.makeSomeNoise() : " + this.makeSomeNoise());
		System.out.println("makeSomeNoise() : " + makeSomeNoise());
		
		// 자식 객체의 메소드에서 부모 객체의 메소드를 객체 생성 없이 사용할 수 있다.
		makeSomeNoise(); // -> 이 부분은 이 객체가 생성될 때,
	}

	// 오버라이드를 명시하지 않아도 오버라이딩 된다.
	@Override
	public StringBuffer makeSomeNoise() {
		return new StringBuffer("child noise");
	}
	
	public void printMethodList() {
		Method[] methods = getClass().getMethods(); // this.getClass().getMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
