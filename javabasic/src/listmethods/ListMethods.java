package listmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// 컬렉션의 유용한 메서드
public class ListMethods {
	public static void main(String[] args) {
		// List<E>를 구현한 컬렉션 클래스들은 저장된 인스턴스를 정렬된 상태로 유지하지 않는다.
		// 대신에 정렬을 해야 한다면 다음 메서드를 사용할 수 있다.
		// public static E void sort(List<E> list)
		// Collections 클래스에 정의되어 있는 제네릭 메서드
		// Arrays.asList 메서드
		// 리스트로 변환해야 하는 배열이 있는 경우 Arrays.asList()를 사용한다.
		// asList()메서드는 가변 개수의 인수를 갖도록 되어있다.
		// 배열을 전달하는 대신 개별 요소를 전달할 수도 있다.
		// Array.asList는 new ArrayList()를 대신해서 간편하게 만들어주는 메서드이다.
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
		
		// 정렬 이전 출력
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// 정렬
		Collections.sort(list);
		// 정렬 이후 출력 - 문자의 정렬은 사전 순으로 정렬
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 검색, 찾기
		// public static int binarySearch(List<E> listt, T key)
		// list에서 key를 찾아 그 index 값을 반환, 못 찾으면 음의 정수 반환
		
		// 검색을 하기 전 정렬이 먼저이다.
		// binarySearch() 메서드는 리소스를 절약하기 위해 정렬이 되어 있다고 가정하고 오름차순으로 검색을 하다가
		// 찾으려는 타겟의 범위가 초과되면 멈춘다.
		int index = Collections.binarySearch(list, "Box");
		System.out.println(list.get(index));
		int index1 = Collections.binarySearch(list, "Toy");
		System.out.println(list.get(index1));
		
		// 복사
		// 얕은 복사(copy)
		list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
		List<String> copiedList = list;
		// 깊은 복사(deep copy)
		// public static <T> void copy(List<T> dest, List<T> src)
		List<String> deepcopiedList = new ArrayList<String>();
		Collections.copy(list, deepcopiedList);
		for(String s: deepcopiedList) {
			System.out.println(s);
		}
		// Create lists for source and destination
		List<Integer> source = Arrays.asList(1, 2, 3, 4);
		List<Integer> dest = Arrays.asList(5, 6, 7, 8, 9, 10);
		Collections.copy(dest, source);
		// Print the List
		for(Integer i : dest) {
			System.out.print(i + " ");
		}
		
	}
}
