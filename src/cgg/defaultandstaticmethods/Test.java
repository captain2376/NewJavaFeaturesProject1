package cgg.defaultandstaticmethods;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		MyInterface myInterface=new MyClass();
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		arrayList.add(new Student("zose",20));
		arrayList.add(new Student("Subhash",20));
		arrayList.add(new Student("varun",22));
		//list of objects
		List<Student> sortStudents = myInterface.sortStudents(arrayList);
		
		for (Student student : sortStudents) {
			System.out.println(student);
		}
		System.out.println("-------------------");
		MyInterface.greet("CGG");
		//new list
		
		System.out.println("-------------------");
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(1212);
		arrayList2.add(12131);
		arrayList2.add(97943);
		arrayList2.add(98329);
		int maxNum = myInterface.getMaxNum(arrayList2);
		System.out.println("Max NUM is: "+maxNum);
		
	}

}
