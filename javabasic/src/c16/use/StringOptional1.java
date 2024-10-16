package c16.use;

import java.util.Optional;

// Optional 클래스의 기본적인 사용 방법1
// public final class Optional<T> extends Object {
// private final T value; -> 참조 변수를 통해 저장하는 일종의 래퍼 클래스
public class StringOptional1 {
	public static void main(String[] args) {
		// of는 null을 허용하지 않는다.
		Optional<String> os1 = Optional.of(new String("Toy1"));
		// ofNuallble은 null을 허용
		Optional<String> os2 = Optional.ofNullable(new String("Toy2"));
		// isPresent() 메서드
		// Optional 객체가 값을 가지고 있다면 true, 아니면 false
		if(os1.isPresent())
			// get() 메서드
			// Optional안에 있는 값을 접근할 때 사용
			System.out.println(os1.get());
		
		if(os2.isPresent())
			System.out.println(os2.get());
		
		// ifPresent() - Optional 객체가 값을 가지고 있으면 실행 아니면 실행하지 않음
		// 매개변수가 함수형 인터페이스
		//람다식 버전
		os1.ifPresent(s -> System.out.println(s));
		//메서드 참조 버전gfvtr43
		os1.ifPresent(System.out::println);
		
		// Optional클래스를 사용하면  if~else문을 대신해서 간편하게 사용할 수 있다.
		
	}
}
