package c16.use;

import java.util.Optional;

// Optional 클래스의 FlatMap메서드
// map은 람다식이 반환하는 값을 Optional로 래핑해 반환하는 반면
// flatMap은 그냥 그대로 반환한다. 래핑이 필요하다면 직접 Optional로 감싸야한다.
// Optional에서 원래 자료형으로 돌아갈 때 flatMap을 사용한다.
public class FlatMapMethod {
	public static void main(String[] args) {
		Optional<String> os1 = Optional.of("Optional String");
		Optional<String> os2 = os1.map(s->s.toUpperCase());
		System.out.println(os2.get());
		
		Optional<String> os3 = os1.flatMap(s -> Optional.of(s.toLowerCase()));
		
	}
}
