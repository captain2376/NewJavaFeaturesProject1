package cgg.methodreference;

public class Person {

	private String Name;
	
	private int age;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + age + "]";
	}

	public String getPersonInfo() {
		return "HELLO PERSON";
	}
}
