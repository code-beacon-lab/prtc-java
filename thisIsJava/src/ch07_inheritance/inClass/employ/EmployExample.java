package thisIsJava.ch07_inheritance.inClass.employ;

public class EmployExample {

	public static void main(String[] args) {
		Employee phil = new Employee("phil", 2500000);
		Manager jay = new Manager("jay", 5500000);
		Executive luke = new Executive("luke", 10000000);
		
		phil.raiseSalary();
		jay.raiseSalary();
		luke.raiseSalary();
		System.out.println();
	}

}
