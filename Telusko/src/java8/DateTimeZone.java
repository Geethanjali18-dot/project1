package java8;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeZone {
public static void main(String[] args) {
	LocalTime t=LocalTime.now(ZoneId.of("GMT"));
	LocalDateTime t1=LocalDateTime.now(ZoneId.of("GMT"));
	System.out.println(t);
	System.out.println(t1);
	
	Instant i=Instant.now();
	System.out.println(i);
	
	for(String s:ZoneId.getAvailableZoneIds())
	{
		System.out.println(s);
	}
}
}
