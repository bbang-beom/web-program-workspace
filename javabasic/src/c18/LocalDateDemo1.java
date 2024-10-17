package c18;

import java.time.LocalDate;

// LocalDate 클래스: 시각 정보가 생략된 날짜 정보를 표현하기 위한 클래스
public class LocalDateDemo1 {
	public static void main(String[] args) {
		// 오늘
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		// 특정 날짜를 LocalDate의 인스턴스로 만들기
		// 올해의 크리스마스
//		LocalDate xmas = LocalDate.of(2024, 12, 25);
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmas: " + xmas);
		
		// LocalDate가 가지고 있는 메서드
		// minusYears(long l)
		// minusMonths(long l)
		// minusDatys(long l)
		
		// 올해의 크리스마스 이브
		LocalDate eve = xmas.minusDays(1);
		System.out.println("Xmas eve: " + eve);
	}
}
