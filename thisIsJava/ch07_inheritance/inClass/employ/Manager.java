package thisIsJava.ch07_inheritance.inClass.employ;

public class Manager extends Employee{
	Manager(String name, int salary) {
		super(name, salary);
	}
	
	@Override
	void raiseSalary() {
		double salary = getSalary()*1.2;
		setSalary((int) salary);
		setBonus(1000000);
		info();
	}
}
