package c17;

import java.util.Arrays;
import java.util.List;

public class FileStream {

	public static void main(String[] args) {
		// 스트림의 중간 연산
		// 필터링- 스트림을 구성하는 데이터 중 일부를 조건에 따라 걸러내는 연산
		// Stream<T>에 존재하는 메서드
		// Stream<T> filter(Predicate<? super T> predicate)
		// ? - 제네릭의 와일드 카드
		// ? super T - T거나 T의 하위 타입을 받을 수 있다.
		List<String> list = Arrays.asList("Toy", "Robot", "Box");
		System.out.println(list);
		// 컬렉션 인스턴스 기반 스트림 생성
		// 필터(filter)는 스트림 내 요소들을 하나씩 평가하여 걸러내는 작업
		// 인자로 받는 Perdicate는 Boolean을 리턴하는 함수형 인터페이스로 평가식이 들어간다.
		// 길이가 3이면 통과
		list.stream().filter(str -> str.length() == 3)
		.forEach(s -> System.out.println(s));
		//.filter(str -> {
		//			System.out.println("필터링);
		//			return true;
		//});
	}

}
