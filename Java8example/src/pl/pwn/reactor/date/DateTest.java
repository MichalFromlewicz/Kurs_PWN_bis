package pl.pwn.reactor.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

	public static void main(String[] args) throws InterruptedException {
		
		// Pobranie aktualnej daty
		LocalDate.now();
		System.out.println("Data bez czasu i strefy czasowej: "+ LocalDate.now());
		System.out.println("Tylkoczas: " + LocalTime.now());
		System.out.println("Data i czas bez strefy czasowej: "+ LocalDateTime.now());
		System.out.println("Data i czas ze strefa czasow¹: " + ZonedDateTime.now());
		System.out.println("Data i czas ze strefa czasow¹ Warszawa: " + ZonedDateTime.now(ZoneId.of("Europe/Warsaw")));

		LocalDateTime czas = LocalDateTime.of(1999, 10, 10, 4, 5);
		System.out.println("Rok: " + czas.getYear());
		
		
		LocalDateTime now = LocalDateTime.now();
		LocalDate lDate = now.toLocalDate();
		
		LocalTime start = LocalTime.now();
		Thread.sleep(600);
		LocalTime end = LocalTime.now();
		Duration timeGap = Duration.between(start, end);
		System.out.println("ro¿nica czasu " + timeGap.getNano()+" ns");
		
		LocalDateTime czas1 = LocalDateTime.now();
		System.out.println("Przed:  " + czas1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatDateTime = czas1.format(formatter);
		System.out.println("Po: " + formatDateTime);
		
	}

}
