package thisIsJava.ch07_inheritance.inClass.employ;

public class Employee {
	private String name;
	private int salary;
	private int bonus;
	private int stockoption;
	
	public Employee(String name, int salary) {
		setName(name);
		setSalary(salary);
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getStockoption() {
		return stockoption;
	}
	public void setStockoption(int stockoption) {
		this.stockoption = stockoption;
	}
	
//	String comma(int num) {
//		String commaObj = Integer.toString(num);
//		while
//	}
	
	
	void info () {
		String sal = Integer.toString(getSalary());
		
		System.out.println("---------------");
		System.out.println("이름 : "+getName());
		System.out.println("급여 : "+sal.charAt(0)+","+sal.charAt(1)+sal.charAt(2)+sal.charAt(3)+
				","+sal.charAt(4)+sal.charAt(5)+sal.charAt(6)+"원"); // 원
		System.out.println("상여 : "+getBonus()+"원"); // 원
		System.out.println("스톡옵션 : "+getStockoption() +"주"); // 주
		System.out.println("---------------");
	}
	void raiseSalary() {
		double salary = getSalary()*1.1;
		setSalary((int) salary);
		info();
	}
}
