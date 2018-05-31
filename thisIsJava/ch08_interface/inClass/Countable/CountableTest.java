package thisIsJava.ch08_interface.inClass.Countable;

public class CountableTest {

	public static void main(String[] args) {
		Countable[] m = {
				new Bird("뻐꾸기"),
				new Bird("독수리"),
				new Tree("사과나무"),
				new Tree("밤나무")
		};
		
	
		
		for(Countable e : m) {
			e.count();
		}
		
		for(int i=0; i<m.length ; i++) {
			if(m[i] instanceof Bird) {// 타입에 따라 fly또는 ripen 메서드를 호출
				Bird printt = (Bird) m[i];
				printt.fly();
				// ((Bird)m[i]).fly();
				
			} else {
				Tree printt = (Tree) m[i];
				printt.ripen();
				// ((Tree)m[i]).fly();
			}
		}
	}
	
	
	// 뻐꾸기가 2마리 있다.
	// 독수리가 2마리 있다.
	// 사과나무가 5그루 있다.
	// 밤나무가 5그루 있다.
	
	// 2마리 뻐꾸기가 날아간다.
	// 2마리 독수리가 날아간다.
	// 사과나무에 열매가 잘 익었다.
	// 밤나무에 열매가 잘 익었다.
}
