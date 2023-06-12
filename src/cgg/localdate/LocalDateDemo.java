package cgg.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("todays date: "+today);
		//convert number into date
		LocalDate setDate = LocalDate.of(2014, 6, 2);
		LocalDate ofDate = LocalDate.of(2001, Month.JUNE, 1);
		System.out.println("Bday : "+ofDate);
		System.out.println("formation day : "+setDate);
		//plus date
		System.out.println("tomorrow's date: "+today.plusDays(1));
		//minus date
		System.out.println("last month :"+today.minusMonths(1));
		//is method
		System.out.println("is leap year : "+today.isLeapYear());
		//with method
		System.out.println("Move to the 30th day of the month : "+today.withDayOfMonth(30));
		System.out.println("Move to the  day of the year : "+today.withDayOfYear(160));
	}

}
