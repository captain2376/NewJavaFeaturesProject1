package cgg.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZondDateTimeDemo {
	public static void main(String[] args) {
		
		ZonedDateTime currTime = ZonedDateTime.now();
		ZonedDateTime parisTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime aTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("India time"+currTime);
		System.out.println("Paris zone time"+parisTime);
		System.out.println("America time"+aTime);
		ZonedDateTime AmericaTime = ZonedDateTime.of(2020, 12, 30, 12, 34, 55, 768876323, ZoneId.of("America/Chicago"));
		System.out.println("AmericaTime :"+AmericaTime);
	}
}
