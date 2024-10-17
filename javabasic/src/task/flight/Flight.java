package task.flight;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Flight {

	public static void main(String[] args) {
		ZonedDateTime department = ZonedDateTime.of(
						LocalDateTime.of(2025, 02, 26, 12, 25), ZoneId.of("Asia/Seoul"));
		System.out.println("출발 시각: " + department);
		ZonedDateTime arrival = ZonedDateTime.of(
				LocalDateTime.of(2025, 02, 26, 18, 05), ZoneId.of("Europe/London"));
		System.out.println("도착 시각: " + arrival);

		System.out.println("비행 시간: " + Duration.between(department, arrival)
							.toHours() + "시간");
	}

}
