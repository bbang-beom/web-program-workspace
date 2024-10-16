package c16.use;

import java.util.Optional;

public class OptionalMap {

	public static void main(String[] args) {
		// map 메서드의 소개
		// public <U> Optional<U> map(Function<?, ?> mapper)
		// map 메서드는 apply 메서드가 변환하는 대상을 Optional 인스턴스에 담아서 반환한다.
		// 매핑- 특정 값을 다른 값에 대응시키는 과정
		Optional<String> os1 = Optional.of("Optional String");
		Optional<String> os2 = os1.map(s -> s.toUpperCase());
		System.out.println(os2.get());
		
		Optional<String> os3 = os1.map(s->s.replace(' ', '_')).map(s->s.toLowerCase());
		System.out.println(os3.get());
	}

}
