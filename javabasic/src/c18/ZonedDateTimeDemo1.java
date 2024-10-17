package c18;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo1 {
	public static void main(String[] args) {
		// 시간대를 반영한 ZonedDateTime 클래스
		// 이 곳의 현재 날짜와 시각
		ZonedDateTime here = ZonedDateTime.now();
		System.out.println(here);
		
		// 파리의 현재 시각을 출력
		ZonedDateTime parisNow = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(parisNow);
		// 동일한 날짜와 시각의 파리
		// of(날짜와 시각 정보, ZonedID)
		ZonedDateTime paris = ZonedDateTime.of(
				here.toLocalDateTime(), ZoneId.of("Europe/Paris"));
		System.out.println(paris);
		// 이 곳과 파리의 시차
		Duration diff = Duration.between(here, paris);
		System.out.println(diff);
	}
}
