package c17.mapping;

import java.util.Arrays;
import java.util.List;

// 맵핑에 대한 추가 정리
public class StreamOfStream {
	public static void main(String[] args) {
		// Stream<T>의 flatMap 메서드
		// 맵핑한 결과가 1: * 형태로 반환된다.
		List<String> list = Arrays.asList("MY_AGE", "YOUR_LIFE");
		
		// _로 구분하여 새로운 리스트 생성
		list.stream().flatMap(s -> Arrays.stream(s.split("_")))
			.forEach(s -> System.out.println(s));
	}
}
