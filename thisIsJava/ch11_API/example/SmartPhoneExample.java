package thisIsJava.ch11_API.example;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone); // class type�� string���� ���?

	}

}
