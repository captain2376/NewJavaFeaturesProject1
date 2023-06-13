package cgg.lambda;

public class Employee {

	private String name;
	private String email;
	private double Salary;
	public Employee(String name, String email, double salary) {
		super();
		this.name = name;
		this.email = email;
		Salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", Salary=" + Salary + "]";
	}
	
}
