package cgg.functionalinterface;

@FunctionalInterface
public interface MyInterface {

	//void meth1();
	void meth1(String name);
	boolean equals(Object o);
	//The interface can also declare the abstract methods from the java.lang.Object class,but still the interface can be
	//called as a functional interface
	
}