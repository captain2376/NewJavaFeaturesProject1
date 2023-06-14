package cgg.methodreference;

import java.util.ArrayList;

public class CustomReference {
//CREATE AN INTERFACE CALLED PERSONMANGAER AS FUNCTIONAL INTERFACE
//write a method abstract getpersoninfo method in interface
	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("abc",34));
		persons.add(new Person("pqr",14));
		persons.add(new Person("xyz",24));
		persons.add(new Person("klm",42));
		persons.add(new Person("rty",35));
		persons.add(new Person("jkl",22));
		persons.add(new Person("uvw",24));
		
		/*
		 * PersonManager pm=()->new Person();
		 * System.out.println(pm.getPerson().getPersonInfo());
		 */
		//now replace above lambda with constructor reference
		PersonManager pm=Person::new;
		 System.out.println(pm.getPerson().getPersonInfo());

	}

}
