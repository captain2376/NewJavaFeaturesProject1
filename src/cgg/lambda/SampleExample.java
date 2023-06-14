package cgg.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SampleExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Sri", "Hari", 20), new Person("Latha", "Sri", 34),
				new Person("Priya", "Varma", 23), new Person("Kali", "Gan", 23), new Person("Leonal", "Pals", 22));
		// step1:sort the list by lastname

		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// step2:create a method that prints all the element in the list

		System.out.println("Printing all persons:");
		//printAll(people);
		//printing all persons using condition ,it is always true so every elemt is seleceted//lambda always returns true
		printConditionally(people,p->true);

		// step3: create a method that prints all persons with last name beginning with
		// "s"
		System.out.println("-----------------------------------------");
		System.out.println("Prints all persons with last name beginning with \"s\"");
		System.out.println();
		//beginWithS(people);
		printConditionally(people,p->p.getLastName().startsWith("S"));
		//first argument os people list,and second argument is lambda to evaluate test abstract method
		System.out.println();
		System.out.println("Print the names of people beginning with \"L\"");
		printConditionally(people,p->p.getFirstName().startsWith("L"));
		System.out.println("-----------------------------------------");
		System.out.println("----------using consumer and class------");
		//using consumer and accept method to print all
		printCondition(people,p->true,System.out::println);
		
	}

	/*
	 * private static void printAll(List<Person> persons) { for (Person p : persons)
	 * { System.out.println(p); } }
	 */

	/*
	 * private static void beginWithS(List<Person> persons) { for (Person p :
	 * persons) { if (p.getLastName().startsWith("S")) { System.out.println(p); } }
	 * }
	 */
	//using predicate
	//it is used to filter
	//to perform an action we need to use Consumer-single typedate,biconsumer for two typesof data 
	//so we will add consumer to this method
	private static void printConditionally(List<Person> persons,Predicate<Person> predicate) {
		for (Person person : persons) {
			if(predicate.test(person)) {
				System.out.println(person);
			}
		}
	}
	private static void printCondition(List<Person> persons,Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person person : persons) {
			if(predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}
}
