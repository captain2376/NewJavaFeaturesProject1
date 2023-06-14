package cgg.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ConstructorReference {

	public static void main(String[] args) {
		//instance method without arguments		
		List<Integer> numbers=Arrays.asList(1,2,4,52,32,3);
		numbers.forEach(System.out::println);
		//constructor reference
		System.out.println("---------------------------");
		//static method reference
		List<Double> findSquareRoots=ConstructorReference.findSquareRoot(numbers,Double::new);
		//using lambda
		//List<Double> findSquareRoots=ConstructorReference.findSquareRoot(numbers,x->Double(x);
		//Double is the return type of interfaces
		findSquareRoots.forEach(System.out::println);
	}

	private static List<Double> findSquareRoot(List<Integer> numbers, Function<Integer,Double> f) {
		// TODO Auto-generated method stub
		ArrayList<Double> result = new ArrayList<Double>();
		numbers.forEach(x->result.add(Math.sqrt(f.apply(x))));
		//lambda is taking x -interfer and calculating squar root and adding to result list.
		//but x is not given directly f.apply is converting int to double and now x is double to which sqre root is done
		return result;
	}

}
