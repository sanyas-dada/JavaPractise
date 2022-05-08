
public abstract class Employee {
	abstract int getsalary();
}
class Developer extends Employee{
	private int salary;
	public Developer(int s) {
		salary = s;
	}
	int getsalary() {
		return salary;
	}
}
class Driver extends Employee{
	private int salary;
	public Driver (int t) {
		salary = t;
	}
	int getsalary(){
		return salary;
	}
}

class sanyas{
public static void main(String[] args) {
	Developer d1 = new Developer(5000);
	Driver d2 = new Driver(3000);
	int a = d1.getsalary();
	int b = d2.getsalary();
	System.out.println("salary of developer : " + a);
	System.out.println("salary of Driver : " + b);
  }	
}
