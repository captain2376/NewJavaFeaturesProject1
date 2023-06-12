package cgg.labdatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class lab1_13 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String purchaseDate=scanner.nextLine();
			LocalDate date = LocalDate.parse(purchaseDate);
			System.out.println("enter warranty period");
			System.out.println("months");
			int month=scanner.nextInt();
			System.out.println("years :");
			int year=scanner.nextInt();
			date=date.plusMonths(month);
			date=date.plusYears(year);
			System.out.println("warranty expiry date :"+date);
		}
		

	}

}
