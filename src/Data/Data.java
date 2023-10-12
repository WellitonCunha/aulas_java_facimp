package Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Data {

	public static void main(String[] args) {
		LocalDate dt = LocalDate.now();
		LocalDateTime dtt = LocalDateTime.now();
		Instant dtlondres = Instant.now();
		System.out.println("Data: "+dt);
		System.out.println("Data Hora: "+dtt);
		System.out.println("Data Londres: "+dtlondres);

	}

}
