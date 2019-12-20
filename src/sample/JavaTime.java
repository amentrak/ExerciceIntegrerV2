import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTime {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		System.out.println("today.toString() ------> " + today.toString());
		
		LocalDateTime todaytime = LocalDateTime.now();
		
		System.out.println("todaytime.toString() --> " + todaytime.toString());
		
		// conversion from LocalDate to String with a formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatDateTime = todaytime.format(formatter);
		
		System.out.println("formatDateTime --------> " + formatDateTime);
		
		
		System.out.println("todaytime.plusDays(3) -> " + todaytime.plusDays(3));
		System.out.println("todaytime.plusDays(3) -> " + todaytime.plusDays(3).format(formatter));
		
		Period intervalPeriod = Period.between(today, today.plusDays(3));
		
		System.out.println("Difference of days : " + intervalPeriod.getDays());
		
		Duration duration = Duration.between(todaytime, todaytime.plusDays(3));
		
		System.out.println("duration.getSeconds() ------------> " + duration.getSeconds());
		System.out.println("duration.get(ChronoUnit.SECONDS) -> " + duration.get(ChronoUnit.SECONDS));
		
		System.out.println("Difference in hours   : " + duration.toHours() + " hours.");
		System.out.println("Difference in minutes : " + duration.toMinutes() + " minutes.");
		System.out.println("Difference in seconds : " + duration.toSeconds() + " seconds.");

		LocalDateTime nowMinus3Days = todaytime.minusDays(3);
		LocalDateTime nowMinus15Hours = todaytime.minusHours(15);
		LocalDateTime nowMinus15HoursAnd49Minutes = todaytime.minusHours(15).minusMinutes(49);
		System.out.println("todaytime.minusDays(3) -> " + nowMinus3Days.format(formatter));
		System.out.println("todaytime.minusHours(15) -> " + nowMinus15Hours.format(formatter));
		System.out.println("todaytime.minusHours(15).minusMinutes(49) -> " + nowMinus15HoursAnd49Minutes.format(formatter));

		Duration elapsedTime = Duration.between(todaytime, nowMinus15HoursAnd49Minutes);
		System.out.println("Elapsed time in hours : " + elapsedTime.toHours());
		System.out.println("Elapsed time in minutes : " + elapsedTime.toMinutes());

	}
}

