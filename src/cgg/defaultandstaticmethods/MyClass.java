package cgg.defaultandstaticmethods;

import java.util.Collections;
import java.util.List;

public class MyClass implements MyInterface {

	@Override
	public int getMaxNum(List<Integer> intList) {
		Integer max = Collections.max(intList);

		return max;
	}

	@Override
	public List<Student> sortStudents(List<Student> stuList) {

		return null;
	}
	

	static public void greet(String name) {
		System.out.println("hello");
	}

}
