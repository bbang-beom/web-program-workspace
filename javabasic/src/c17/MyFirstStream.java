package c17;

import java.util.Arrays;
import java.util.stream.IntStream;

// 스트림 Streams
// 자바 8에서 추가한 스트림(Streams)은 람다를 활용할 수 있는 기술 중 하나
// 자바 8 이전에는 배열 또는 컬렉션 인스턴스를 for 또는 foreach를 통해 하나씩 꺼내서 다루었다. 
// 이 방식은 로직이 복잡해질수록 코드의 양이 많아져 여러 로직이 섞이고, 
// 메서드를 나눌 경우 루프를 여러번 반복하게 되는 일이 발생했다.
// 스트림은 배열 또는 컬렉션 인스턴스에 메서드 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있다.
// 또, 람다를 이용해서 코드의 양을 줄이고 간결하게 표현할 수 있다.
// 즉, 배열과 컬렉션을 함수형으로 처리할 수 있는 것이다.
public class MyFirstStream {
	public static void main(String[] args) {
		// 스트림 사용
		int[] arr = {1, 2, 3, 4, 5};
		// 배열 arr로 부터 스트림 생성
		IntStream stm = Arrays.stream(arr);
		// 중간 연산 진행
		// 홀수인 경우만 스트림으로 리턴
		IntStream stm2 = stm.filter(n -> n % 2 == 1);
		// 최종 연산 진행
		// 최종 연산을 생략하면 아무 결과도 얻지 못한다.
		int sum = stm2.sum();
		System.out.println(sum);
		// 메서드 체이닝
		sum = Arrays.stream(arr).filter(n -> n % 2 == 1).sum();
		System.out.println(sum);
		// // 배열을 사용하면
//		int[] arr1 = new int[5];        
//		int index = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if((arr[i] % 2) == 1) {
//				arr1[index++] = arr[i];
//			}
//		}
//		for(int i : arr1) {
//			System.out.println(i);
//		}
	}
}
