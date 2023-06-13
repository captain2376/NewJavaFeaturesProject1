package cgg.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExample {

	public static void main(String[] args) {
		// defining lambda or implementing interface

//		lambdaWithZeroParam();
//		anonymousClassZeroParam();
//		System.out.println("-----------------------------------");
//		lambdaWithOneParam();
//		System.out.println("-----------------------------------");
//		LambdaWithMultiParam();
//		System.out.println("-----------------------------------");
//		lambdaWithParamAndReturnType();
//		System.out.println("-----------------------------------");
//		lamdaToAddNumbers();
//		System.out.println("-----------------------------------");
//		lambdaToGetStringLength();
//		System.out.println("-----------------------------------");
//		
//		MyInterface7 i7=a1->a1*2;
//		System.out.println("Double of given number :"+ i7.doubleNum(2));
//		System.out.println("-----------------------------------");
//		lambdaToSafeDivide();
//		System.out.println("-----------------------------------");
//		lamdaWithInterfaceAsArgument();
		////--------------------------------
		////COMPARATOR
		////-------------------------------
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Rabs","abs@gmail.com",897979.99));
		empList.add(new Employee("Tusar","sar@gmail.com",989879.99));
		empList.add(new Employee("Fijui","jui@gmail.com",777779.99));
		empList.add(new Employee("Ghar","har@gmail.com",767579.99));
		System.out.println("List befor sorting: ");
		for (Employee e : empList) {
			System.out.println(e);
		}
		System.out.println("-----------------");
		//Collections.sort(empList, new EmpComparator());
		Collections.sort(empList,new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
	});
		
		
		for (Employee e : empList) {
			System.out.println(e);
		}
		System.out.println("------------------");
	Collections.sort(empList,new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary()- o2.getSalary());
			}
	});
	for (Employee e : empList) {
		System.out.println(e);
	}
	
//USING LAMBDA EXPERSSIONNS
	System.out.println("--------------------");
	Collections.sort(empList, (e1,e2)->(int)(e1.getName().compareTo(e2.getName())));
	Collections.sort(empList, (e1,e2)->(int)(e2.getSalary()-e1.getSalary()));
	System.out.println("LIST AFTER SORTING :");
	for (Employee e : empList) {
		System.out.println(e);
	}
	
	}

	
	
//////------------------------------------------------

	
	private static void lamdaWithInterfaceAsArgument() {
		// this method take interface as argument
		
		Foo f=()->System.out.println("inteface as an argument");
		doPerform(f);
	}


	
	private static void doPerform(Foo f) {
		// this method takes Foo f as argument and implements its methods
		f.perform();
	}

	private static void lambdaToSafeDivide() {
		// multiple return statements and an operation so{} for lambda function
		MyInterface8 i8=(a1,a2)->{
			if(a2==0)
				return 0;
			return (a1/a2);
		};
		System.out.println("safe divide :"+i8.safedivide(4, 2));
		System.out.println("safe divide :"+i8.safedivide(4, 0));
	}

	private static void lambdaToGetStringLength() {
		MyInterface6 i6=s->s.length();
		System.out.println("Length of string is :"+i6.Stringlength("Sindhuja"));
	}

	private static void lamdaToAddNumbers() {
		MyInterface5 i5=(a1,a2)->a1+a2;
		System.out.println(i5.addmethod(3, 4));
		
	}

	private static void lambdaWithParamAndReturnType() {
		
		MyInterface4 i4=(a1,a2)->a1>a2;
		
		System.out.println(i4.test(3, 2));
		System.out.println(i4.test(3, 22));

	}

	private static void LambdaWithMultiParam() {
		
		MyInterface3 i3=(n,a)->{
			System.out.println("Your name is  "+n);
			System.out.println("You are "+a+" years old");
		};
		i3.method3("Sindhu", 22);
	}

	private static void lambdaWithOneParam() {
		
		MyInterface2 i2=name->System.out.println("..HELLO...  "+name);
		i2.method2("Sindhuja");
	}

	private static void anonymousClassZeroParam() {
	//anonymous function
		
		MyInterface1 i1=new MyInterface1() {

			@Override
			public void method1() {
				System.out.println("Anonymous Class..........");
				
			}
			
		};
		i1.method1();
	}

	private static void lambdaWithZeroParam() {
		MyInterface1 i1=()->System.out.println("Lambda with zero parameters");
		
		//calling lambds
		i1.method1();
	}

}
