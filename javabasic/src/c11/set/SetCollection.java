package c11.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set 컬렉션
// List 컬렉션은 객체의 저장 순서를 유지하지만, Set 컬렉션은 저장 순서가 유지되지 않는다.
// 또, 객체를 중복해서 저장할 수 없고, null도 하나만 저장할 수 있다.
// Set 컬렉션은 순서와 상관없고 중복이 허용되지 않기 때문에 수학의 집합과 비슷하다.
// Set 컬렉션은 HashSet, LinkedHashSet, TreeSet등이 있다.
// index로 관리하지 않기 때문에 index를 매개 값으로 갖는 메서드가 없다.

// Set 인터페이스의 메서드
// 메서드 | 설명
// boolean add(E e) | 주어진 객체를 저장한다. 객체가 성공적으로 저장되면 true 중복되면 false 리턴
// boolean contains(Object o) | 주어진 객체가 저장되어 있는지 조사한다.
// boolean isEmpty() |  컬렉션이 비어있는지 조사한다.
//Iterator (E) iterator() | 저장된 객체를 한번씩 가져오는 반복자 리턴
// int size() | 저장되어 있는 전체 객체 수를 리턴 
// void clear() | 저장된 모든 객체를 삭제
// boolean remove(Object o) | 주어진 객체를 삭제
public class SetCollection {
	public static void main(String[] args) {
		// 메서드의 매개 변수 타입과 E라는 타입 파라미터는 저장되는 객체의 타입을 Set 컬렉션을 생성할 때 결정한다.
		// Set<String> 으로 set 변수 선언 -> 저장되는 객체를 String으로 한다.
		Set<String> set = new HashSet<>();
		// 따라서 add()와 reamove() 메서드의 매개 값은 문자열이 된다.
		set.add("Java");
		set.add("JavaScript");
		set.add("Html");
		set.add("Oracle");
		set.add("React");
		set.add("Spring");
		// Set 컬렉션은 index로 객체를 검색해서 가져오는 메서드가 없다.
		// 대신, 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자(Iterator)를 제공한다.
		// 반복자는  Iterator인터페이스를 구현한 객체로 iterator()메서드를 호출하면 얻을 수 있다.
		for(String s:set) {
			System.out.println(s);
		}
		// foreach보다 더 세부적인 코딩을 위해 iterator로 반복한다.
		// java.util.Iterator로 임포트
		Iterator<String> iterator = set.iterator();
		// Iterator 인터페이스에 선언된 메서드
		// 리턴타입 | 메서드 | 설명
		// boolean | hasNext() | 가져올 객체가 있으면 true 없으면 false
		// E | newt() | 컬렉션에서 하나의 객체를 가져온다.
		// void | remove() | Set 컬렉션에서 객체를 제거한다.
		
		// Iterator에서 하나의 객체를 가져올 때는 next() 메서드를 사용한다.
		// hasNext()메서드는 가져올 객체가 있으면 true 없으면 false
		while(iterator.hasNext()) {
			String str = iterator.next();
		}
		
		// Set 컬렉션에서 Iterator의 next()메서드로 가져온 객체를 제거하려면 remove() 메서드를 호출한다.
		// Iterator의 메서드지만, 실제 Set컬렉션에서 객체가 제거됨을 유의하자.
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("Java")) {
				iterator.remove();
			}
		}
		System.out.println("-----");
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		// HashSet
		// HashSet은 Set인터페이스의 구현 클래스이다.
		// Set<E> - 타입 파리미터 E에 컬렉션에 저장할 객체 타입을 지정한다.
		Set<Integer> set1 = new HashSet<>(); // Integer
		Set<String> set2 = new HashSet<>(); // String

		// HashSet은 객체들을 순서 없이 저장하고 동일한 객체는 중복 저장하지 않는다.
		// HashSet이 판단하는 동일한 객체란 같은 인스턴스 만을 뜻하지 않는다.
		// HashSet은 객체를 저장하기 전 객체의 hashCode()메서드를 호출해 해시코드를 얻어, 
		// 저장되어 있는 객체들의 해시코드와 비교한다.
		// 만약 동일한 해시코득가 있다면 equals()메서드로 객체를 비교하여 true가 나오면 동일한 객체로 판단하고 중복 저장하지 않는다.
		
		// 문자열을 HashSet 에 저장할 경우 String  클래스가 hashcode()와 equals() 메서드를 재정의 해서 
		// 같은 문자열을 갖는 String 객체는 동등한 객체로 간주되고 
		// 다른 문자열을 갖는 String 객체는  다른 객체로 간주된다.
	}
}
