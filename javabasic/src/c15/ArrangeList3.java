package c15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

// 2. 인스턴스 메서드 참조
public class ArrangeList3 {
	// ? - 제네릭 - 어떤 타입이든 미리 정하지 않고 호출할 때 정하겠다는 뜻
	public void sort(List<?>list) {
		Collections.reverse(list);
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
		list = new ArrayList<Integer>(list);
		ArrangeList3 al3 = new ArrangeList3();
//		Consumer<List<Integer>> c = e -> al3.sort(e);
		// accept로 전달된 것을 sort로 그대로 전달하는 상황에서 매개변수 생략이 가능하다.
		Consumer<List<Integer>> c = al3::sort;
		c.accept(list);
		System.out.println(list);
	}
}
