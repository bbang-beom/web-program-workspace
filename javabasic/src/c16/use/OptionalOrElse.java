package c16.use;

import java.util.Optional;

public class OptionalOrElse {
	public static void main(String[] args) {
		// Optional의 orElse메서드
		// null일 경우 orElse의 매개변수로 전달된 인스턴스가 대신 반환
//		Optional<String> os1 = Optional.ofNullable(null);
		Optional<String> os1 = Optional.empty();
		Optional<String> os2 = Optional.of("Java");
		String str1 = os1.map(s->s.toString()).orElse("Empty");
		String str2 = os2.map(s->s.toString()).orElse("Empty");
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
