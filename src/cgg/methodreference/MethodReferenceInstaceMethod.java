package cgg.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceInstaceMethod {

	public static void main(String[] args) {
		
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("abc",34));
		persons.add(new Person("pqr",14));
		persons.add(new Person("xyz",24));
		persons.add(new Person("klm",42));
		persons.add(new Person("rty",35));
		persons.add(new Person("jkl",22));
		persons.add(new Person("uvw",24));
		
		//instance method has no input so it will be converted into static method
		
		List<String> personName=MethodReferenceInstaceMethod.getPersonName(persons,Person::getName);
		//f.apply(p) will make Person::getName will be callef
		//List<String> personName=MethodReferenceInstaceMethod.getPersonName(persons,p->p.getName());
		//using lambda

		System.out.println("-----------------------------------------");
		personName.forEach(System.out::println);
	}

	private static List<String> getPersonName(ArrayList<Person> persons,Function<Person,String> f) {
		// TODO Auto-generated method stub
		List<String> result=new ArrayList<String>();
		persons.forEach(p->result.add(f.apply(p)));
		return result;
	}
}
