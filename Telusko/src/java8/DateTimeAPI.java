package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeAPI {
public static void main(String[] args) {
	LocalDate d=LocalDate.now();
	LocalDate d1=LocalDate.of(1989,Month.OCTOBER,10);
	LocalTime t=LocalTime.now();
	LocalTime t1=LocalTime.of(12,35,10,999);
	
	System.out.println(t);
	System.out.println(d);
	
}
}
