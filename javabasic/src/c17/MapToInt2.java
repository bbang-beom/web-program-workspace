package c17;

import java.util.Arrays;
import java.util.List;

public class MapToInt2 {

	public static void main(String[] args) {
		// 맵핑
		// IntStream mapToInt(ToIntFuction<T> mapper)
		// LongStream mapToLong(ToLongFuction<T> mapper)
		// DoubleStream mapToDouble(ToDoubleFuction<T> mapper)
		
		List<String> list = Arrays.asList("Box", "Robot", "Simple");
		list.stream().mapToInt(s -> s.length()).forEach(n -> System.out.println(n + "\t"));
	}

}
