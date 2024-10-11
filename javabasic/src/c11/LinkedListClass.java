package c11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// LinkedList
// LinkedList는 List구현 클래스이므로 ArrayList와 사용 방법은 같으나 내부 구조는 매우 다르다.
//ArrayList는 내부 배열에 객체를 저장해서 관리하지만, LinkedList는 인접 참조를 링크해서 체인처럼 관리한다.
// LinkedList에서 특정 index의 객체를 제거하거나 삽입하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다.
// 따라서, 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList보다 LinkedList가 더 좋은 성능을 발휘한다.
public class LinkedListClass {
	public static void main(String[] args) {
		// Linkedist 생성
		// 저장할 객체 타입을 <> 타입 파라미터로 표기한다.
		List<String> list1 = new LinkedList<>();
		LinkedList<Double> list2 = new LinkedList<>();
		
		// ArrayList와 LinkedList의  실행 성능 비교
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 끝에서부터 순차적으로 추가 또는 삭제하는 경우 ArrayList가 빠르지만
		// 중간에 추가, 삭제하는 경우는 LinkedList가 더 빠르다.
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			l1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간:" + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			l2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간:" + (endTime - startTime) + "ns");
		// 구분         | 순차적으로 추가/삭제     | 중간에 추가/삭제             | 검색
		// ArrayList   | 빠르다               | 느리다                    | 빠르다
		// LinkedList  |  느리다              | 빠르다                    |  느리다 
	}
}
