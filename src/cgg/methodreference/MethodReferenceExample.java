package cgg.methodreference;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodReferenceExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		// new way of creating thread it wil give executor service
		// Runnable r=()->System.out.println("My Task is running");
		// work with method reference instead of runnable lambda funstion
		
		//method reference example myrun is a method ,::-scope resolution
		Runnable r=MethodReferenceExample::myRun;
		executorService.execute(r);

	}

	private static void myRun() {
		System.out.println("My TAsk is running");
	}
}
