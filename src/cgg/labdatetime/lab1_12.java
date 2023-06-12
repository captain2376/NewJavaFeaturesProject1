package cgg.labdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class lab1_12 {

	public static void main(String[] args) {
		System.out.print("Enter start date: ");
		try (Scanner scanner = new Scanner(System.in)) {
			String dateString = scanner.nextLine();
			LocalDate start = LocalDate.parse(dateString);
			System.out.print("Enter end date: ");
			String endString=scanner.nextLine();
			LocalDate end = LocalDate.parse(endString);
			System.out.println("start :"+start);
			System.out.println("end :"+end);
			Period period = start.until(end);
			System.out.println("days : "+period.getDays()+"Months :"+period.getMonths()+"Years :"+period.getYears());
		}
		
		
		
	}

}
