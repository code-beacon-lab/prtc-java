package thisIsJava.ch07_inheritance.example;

public abstract class P335_Animal {
	 public String kind;
	 
	 public void breathe() {
		 System.out.println("숨을 쉽니다.");
	 }
	 
	 // 추상 메소드
	 public abstract void sound();

}
