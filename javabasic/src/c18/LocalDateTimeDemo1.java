package c18;

import java.time.LocalDateTime;

// LocalDateTime 클래스
// LocalDateTime은 시각 정보와 날짜 정보를 동시에 나타낸다.
public class LocalDateTimeDemo1 {
	public static void main(String[] args) {
		// 현재 날짜와 시각
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		// 영국 바이어와 22시간 35분 뒤 화상 미팅 예정
		LocalDateTime mt = dt.plusHours(22).plusMinutes(35);
		
		// 영구 바이어와 화상 미팅 날짜와 시각
		System.out.println(mt);
	}
}
