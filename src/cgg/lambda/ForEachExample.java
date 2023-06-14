package cgg.lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

		public static void main(String[] args) {
			List<Person> people = Arrays.asList(
					new Person("Sri","Hari",20),
					new Person("Latha","Sri",34),
					new Person("Priya","Varma",23),
					new Person("Kali","Gan",23));
			System.out.println("Extenal iterators runs sequentially::iterating using for loop");
			System.out.println();
			for (int i = 0; i < people.size(); i++) {
				
				System.out.println(people.get(i));
			}
			System.out.println("----------------------------------");
			
			System.out.println("Extenal iterators:: Iterating using for in/foreach loop");
			System.out.println();
			for (Person person : people) {
				System.out.println(person);
			}
			System.out.println("------------------------------------");
			//internal iterators
			System.out.println("internal iterators controlled by jvm: Iterating using lambda for each method:");
			System.out.println();
			people.forEach(p->System.out.println(p));
			System.out.println("------------------------");
			System.out.println(" internal iterators controlled by jvm: runs parallel:: method reference where ever you give a lambda you can give a method reference also");
			people.forEach(System.out::println);
		}
}
