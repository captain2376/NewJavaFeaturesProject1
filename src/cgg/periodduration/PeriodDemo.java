package cgg.periodduration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2014, 06, 02);
		LocalDate end = LocalDate.now();
		
		Period period = start.until(end);
		
		System.out.println("Days :" +period.get(ChronoUnit.DAYS));
		System.out.println("Days :" +period.get(ChronoUnit.MONTHS));
		System.out.println("Days :" +period.get(ChronoUnit.YEARS));
		
		System.out.println("------------------------------------------");
		LocalDate intialDate = LocalDate.now();
		LocalDate finalDate = intialDate.plus(Period.ofDays(5));
		Period between = Period.between(intialDate, finalDate);
		System.out.println(between.getDays()+" days ");
		
		System.out.println("------------------------");
		long between2 = ChronoUnit.DAYS.between(intialDate, finalDate);
		System.out.println(between2+" days");
		System.out.println("-------------------------------");
		
		LocalDate today = LocalDate.now();
		LocalDate bday = LocalDate.of(1999, 01, 26);
		Period p = Period.between(bday,today);
		long p1 = ChronoUnit.DAYS.between( bday,today);
		System.out.println("You are "+p.getYears()+" years"+p.getMonths()+" months"+p.getDays()+" days old()."+p1 +" Total Days");
		
		System.out.println();
		System.out.println("---------to calculate next birthday--------");
		//to calculate next bday
		System.out.println();
		LocalDate nextbday = bday.withYear(today.getYear());
		//if your bday has occured this year already add 1 to the year
		if (nextbday.isBefore(today)||nextbday.isEqual(today)) {
			nextbday=nextbday.plusYears(1);
		}
		Period p2 = Period.between( today,nextbday);
		long p3 = ChronoUnit.DAYS.between( today,nextbday);
		
		System.out.println("There are "+p2.getMonths() +"months , and" +p.getDays()+"days until your next bday"+"Total :"+p3+" days");
		
		System.out.println("-------------------------------------------------");
		
		LocalTime initialTime = LocalTime.of(6, 30, 0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		//plus method wants temporal:Duration.of
		long seconds = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println("seconds : "+seconds);
		
		//with chronounit
		long between3 = ChronoUnit.SECONDS.between(initialTime, finalTime);
		System.out.println(between3 +" :seconds");
		/////////////////////////////////////////
		
		//DATE AND TIME FORMATTING
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.format(formatter));
		
		//format time
		
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime.format(timeFormatter));
		
		//custom foramatter
		System.out.println("---------------------");
		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String tex="12/02/2001";
		LocalDate d = LocalDate.parse(tex, customFormat);
		System.out.println(d);
		
		System.out.println("---------------------------");
		DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofPattern("HH-mm-ss");
		String Time="12-40-30";
		LocalTime time2 = LocalTime.parse(Time, timeFormatter2);
		//LocalTime newTime = LocalTime.parse(Time,timeFormatter2);
		System.out.println(time2);
	}

}
