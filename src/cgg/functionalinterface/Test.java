package cgg.functionalinterface;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		//createThreadUsingAnonymousClass();
		//createThreadUsingLambda();
		createCustomLambda();
	}

	private static void createCustomLambda() {

		//MyInterface i=()->System.out.println("testing lambda");
		//MyInterface i=name->System.out::println;
		
		//defining lambda
		//MyInterface i=name->System.out.println("Welcom to "+name);
		//invoking lambda
		//i.meth1("CGG");
		//method reference
		 List<String> names = new ArrayList<String>();
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");

	        // Using a lambda expression
	        names.forEach(name -> System.out.println(name));
	        // Using a method reference
	        names.forEach(System.out::println);
		
		MyInterface i=System.out::println;
		
		//invoking lambda
		i.meth1("Sindhu");
	}

	private static void createThreadUsingLambda() {
		Runnable r=()->System.out.println("My Runnabele");
		
		Thread t=new Thread(r);
		t.start();
	}

//	private static void createThreadUsingAnonymousClass() {
//		//anonymous class
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("I am thread my task is executing...");
//				
//			}
//			
//		};
//		Thread thread = new Thread(r);
//		thread.start();
//	}
}
