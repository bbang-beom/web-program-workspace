package task.flight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MonsterHunter {
	
	public static void main(String[] args) {
		ZonedDateTime NARealese = ZonedDateTime.of(LocalDateTime.of(2025, 02, 27, 00, 00),
				ZoneId.of("America/New_York"));
		System.out.println("북미 출시: " + NARealese);
		
		ZonedDateTime here = ZonedDateTime.of(NARealese.toLocalDateTime(),
				ZoneId.of("Asia/Seoul"));
		System.out.println("한국 출시: " + here);
	}
}
