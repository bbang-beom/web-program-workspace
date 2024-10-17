package c18;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo2 {
	public static void main(String[] args) {
		// 오늘
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		// 올해 크리스마스
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmas: " + xmas);
		// 크리스마스까지 앞으로 얼마나 남았는지
		Period left = Period.between(today, xmas);
		System.out.println("Xmas까지: " + left.getMonths() + "개월 " + left.getDays() + "일 남음");
	}
}
