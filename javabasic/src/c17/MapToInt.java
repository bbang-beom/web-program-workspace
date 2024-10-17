package c17;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MapToInt {
	public static void main(String[] args) {
		// 맵핑 - map
		// 맵(map)은 스트림 내 요소들을 하나씩 특정 값으로 변환해준다.
		// 이 때 값을 변환하기 위한 람다를 인자로 받는다.
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper)
		// 맵핑이란 스트림에 들어가있는 값이 input 되어서 특정 로직을 거친 후 
		// output이 되어 새로운 스트림에 담기는 것이다.
		
		// 문자열 리스트를 문자열 길이 리스트로 맵핑
		List<String> list = Arrays.asList("Box", "Robot", "Toy");
		list.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		
		// 자바에서는 foreach나 반복자 Iterator를 더 선호하는편
		// foreach문 사용
		for(String s : list) {
			System.out.println(s.length());
		}
		// Iterator 사용
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().length());
		}
	}
}
