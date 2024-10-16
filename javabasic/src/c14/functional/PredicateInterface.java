package c14.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// 정의되어 있는 함수형 인터페이스
// 람다식을 사용할 때 함수형 인터페이스가 필요하다.
// 미리 정의되어 있는 함수형 인터페이스 제공
public class PredicateInterface {
	// Predicate<T> -> boolean test(T t)
	// 전달 인자를 근거로 참, 거짓을 반환
	// 매개변수로 정수형 리스트를 받아서 리스트 안에 있는 모든 수를 더해서 리턴
	public int sum(List<Integer> list) {
		int s = 0;
		for(int n: list) {
			s += n;
		}
		return s;
	}
	
	public int sum1(Predicate<Integer> p, List<Integer> list) {
		int s = 0;
		for(int n: list) {
			if(p.test(n)) s += n;
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		PredicateInterface pi = new PredicateInterface();
		List<Integer> list = Arrays.asList(1, 5, 7, 9, 11, 12);
		int s;
		s = pi.sum(list);
		System.out.println("리스트 전체 수의 합: " + s);
		
		// 짝수 합
		s = pi.sum1(n -> n % 2 == 0, list);
		System.out.println("짝수 합: " + s);
		
		// 홀수 합
		s = pi.sum1(n -> n % 2 != 0, list);
		System.out.println("홀수 합: " + s);
		
		// 10 최소 공배수의 합, 2개만 합
		
		// Predicate<T>를 구체화하고 다양화 한 인터페이스
		// IntPredicate boolean test(int value)
		// LongPredicate boolean test(long value)
		// DoublePredicate boolean test(double value)
		// BiPredicate<T, U> boolean test(T t, U u)
	}
}
