package cgg.labdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class lab1_11 {

	public static void main(String[] args) {
		
		 System.out.print("Enter date: ");
		 try (Scanner scanner = new Scanner(System.in)) {
			String dateString = scanner.nextLine();
			 LocalDate start = LocalDate.parse(dateString);
			 System.out.println(start);
			 LocalDate end = LocalDate.now();
			 Period period = start.until(end);
			 System.out.println(period.getDays());
			 System.out.println(period.getMonths());
			 System.out.println(period.getYears());
		}

	}

}
