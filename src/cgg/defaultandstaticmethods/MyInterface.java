package cgg.defaultandstaticmethods;

import java.util.Collections;
import java.util.List;

public interface MyInterface {

		//default method
		default public List<Student> sortStudents(List<Student> stuList)
		{
			Collections.sort(stuList);
			
			return stuList;
		}
		
		//static method
		static public void greet(String name) {
			System.out.println("Welcome  :"+name);
		}
		//abstract method
		public abstract int getMaxNum(List<Integer> intList);
		
		
}
