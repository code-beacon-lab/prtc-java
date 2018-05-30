package thisIsJava.ch07_inheritance.inClass.employ;

public class Executive extends Manager {
	Executive(String name, int salary) {
		super(name, salary);
	}
	
	@Override
	void raiseSalary() {
		double salary = getSalary()*1.3;
		setSalary((int) salary);
		setBonus(1000000);
		setStockoption(100);
		info();
	}
}
