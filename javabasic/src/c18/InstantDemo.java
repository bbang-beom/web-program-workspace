package c18;

import java.time.Duration;
import java.time.Instant;

// 시각과 날짜의 처리
// 시각과 날짜 관련 코드의 작성
public class InstantDemo {
	public static void main(String[] args) {
		// 시간이 얼마나 걸렸는지 파악하기 위해 Instant 클래스 사용
		// 시간: 특정 시각에서 특정 시각까지의 사이
		// 시각: 시간의 어느 한 지점
		// 현재 시각의 정보
		Instant start = Instant.now();
		System.out.println(start);
		// getEpochSecond(): 1970-01-01 00:00:00을 기준으로 지난 시간을 초단위로 계산한 값 리턴
		System.out.println("시작: " + start.getEpochSecond());
		// 현재 시각의 정보		
		Instant end = Instant.now();
		System.out.println("끝: " + end.getEpochSecond());
		// 두 시각의 차이
		Duration between = Duration.between(start, end);
		System.out.println("밀리 초 단위 차: " + between.toMillis());
	}
}
