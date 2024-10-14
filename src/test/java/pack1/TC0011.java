package pack1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TC0011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant CurrentTime=Instant.now();
		LocalDate now =LocalDate.now();
		
		System.out.println("current time is:"+CurrentTime);
		System.out.println("Today:"+now);
		System.out.println("tommorow:"+now.plusDays(1));
		System.out.println("yesterday:"+now.minusDays(1));
		System.out.println("Last month:"+now.minusMonths(1));
		System.out.println("Is leap:"+now.isLeapYear());
		System.out.println("move 30th day of the month:"+now.withDayOfMonth(30));
		ZonedDateTime CT =ZonedDateTime.now();
		ZonedDateTime CT_paris=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("current time:"+CT);
		System.out.println("paris time:"+CT_paris);
		System.out.println("tommorow_paris:"+CT_paris.plusDays(1));
		System.out.println("yesterday_paris:"+CT_paris.minusDays(1));
		System.out.println("Last month_paris:"+CT_paris.minusMonths(1));
		//System.out.println("Is leap:"+now.isLeapYear());
		System.out.println("move 30th day of the month_paris:"+CT_paris.withDayOfMonth(30));

	}

}
