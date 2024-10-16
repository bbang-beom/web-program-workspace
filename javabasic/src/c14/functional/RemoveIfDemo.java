package c14.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// removeif 메서드
// Collection<E> 인터페이스의 디폴트 메서드
// default boolean removeIf(Predeicate<E> filter)
// removeIf 메서드의 기능
// 인자로 전달된 조건의 리스트 아이템들을 삭제
public class RemoveIfDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, -2, 3, -4, 5);
		list = new ArrayList<>(list);
		
		List<Double> list2 = Arrays.asList(-1.1, 2.2, 3.3, -4.4, 5.5);
		list2 = new ArrayList<>(list2);
		
		// 삭제의 조건
		// Number: Character, Boolean을 제외한 모든 Wrapper 클래스는 Number 클래스를 상속 
		Predicate<Number> p = n -> n.doubleValue() < 0.0;
//		list.removeIf(n -> n.doubleValue() < 0.0);
		list.removeIf(p);
		list2.removeIf(p);
		System.out.println(list);
		System.out.println(list2);
	}
	
}
