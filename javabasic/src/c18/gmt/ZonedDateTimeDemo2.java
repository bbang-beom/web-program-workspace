package c18.gmt;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {
	public static void main(String[] args) {
		// 한국에서 파리로 비행기 탑승
		// 한국 출발 현지 시간 2024년 10월 18일 14시 30분
		// 파리 도착 현지 시간 2024년 10월 18일 17시 25분
		// 비행에 걸린 시간
		
		// 한국 출발
		ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2024, 10, 18, 14, 30),
				ZoneId.of("Asia/Seoul"));
		System.out.println("Departure: " + departure);
		
		// 파리 도착
		ZonedDateTime arrival = ZonedDateTime.of(LocalDateTime.of(2024, 10, 18, 17, 25)
								, ZoneId.of("Europe/Paris"));
		System.out.println("Arrival: " + arrival);
		
		// 비행시간
		System.out.println(Duration.between(departure, arrival));
	}
}
