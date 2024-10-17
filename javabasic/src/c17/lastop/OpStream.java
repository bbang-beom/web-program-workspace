package c17.lastop;

import java.util.stream.IntStream;

// 스트림의 최종 연산
// sum(): 전체 합 반환
// count(): 전체 갯수 반환
// average(): 전체 평균 반환
// min(): 가장 작은 요소 반환
// max(): 가장 큰 요소 반환
public class OpStream {
	public static void main(String[] args) {
		int sum = IntStream.of(1, 3, 5, 7, 9).sum();
		// 합
		System.out.println(sum);
		// max
		IntStream.of(1, 3, 4, 7, 9).max()
				.ifPresent(max -> System.out.println("max:" + max));
		// forEach - 매개 변수에 스트림 요소들을 순차적으로 대입하며 반복 실행
		IntStream.of(1, 3, 4, 7, 9).forEach(n -> System.out.println(n));
		
	}
}
