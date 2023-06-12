package cgg.localdatetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Local Date time :"+dateTime);
		LocalDateTime of = LocalDateTime.of(2012, Month.JUNE, 20, 2, 30);
		System.out.println("of time :"+of);
		System.out.println("plus 4 weeks:"+dateTime.plusWeeks(4));
		System.out.println("minus 1 year :"+dateTime.minusYears(1));
		System.out.println("is leap year"+dateTime.isAfter(of));
		System.out.println("4 hrs after time");
	}

}
