package cgg.localtime;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime time= LocalTime.now();
		System.out.println("Time : "+time);
		//convert time into local time
		LocalTime of=LocalTime.of(5, 12, 30);
		System.out.println("Time of :"+of);
		System.out.println("Next hour: "+time.plusHours(1));
		System.out.println("Last hour: "+time.minusHours(2));
		System.out.println("is method :"+time.isAfter(of));
		System.out.println("with :"+time.withMinute(50));
		
	}

}
