package c11.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map 컬렉션
// Map 컬렉션은 키(key)와 값(value)로 구성된 Map.Entry 객체를 저장하는 구조
// Entry는 Map인터페이스 내부에 선언된 중첩 인터페이스이고, 키와 값은 모두 객체이다.
// 키는 중복 저장이 불가능하지만 값은 중복 저장이 가능하다.
// 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체된다.
// Map 컬렉션에는 HashMap, Hashtable, LinkedHashMap, Properies, TreeMap등이 있다.
// Map 인터페이스의 메서드
// 메서드 | 설명
// V put(K key, V value) |  주어진 키로 값을 저장한다.
// boolean containsKey(Object Key) | 주어진 키가 있는지 확인한다.
// boolean containsValue(Object value) | 주어진 값이 있는지 확인한다.
// Set<Map.Entry<K, V>> entrySet()) | 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴한다.
// V get(Object key) | 주어진 키가 있는 값을 리턴한다.
// boolean isEmpty() |  컬렉션이 비어있는지 확인한다.
// Set<K> keySet() | 모든 키를 Set 객체에 담아서 리턴한다.
// int size() | 저장된 키의 총 개수를 리턴한다.
// V remove(Object key) | 주어진 키와 일치하는 Map.Entry를 삭제하고 값을 리턴
public class HashMapExample {
	public static void main(String[] args) {
		// HashMap
		// HashMap은 Map 인터페이스를 구현한 대표적인 Map컬렉션
		// Map 컬렉션 생성
		// Map<String, Integer>로 선언하면 키 객체는 String 타입, 값 객체는 Integer 타입으로 한다.
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("김자바", 25);
		map.put("이자바", 26);
		map.put("박자바", 27);
		System.out.println("총 Entry 수: " + map.size());
		// "이자바" 키가 같기 때문에 값이 대체
		map.put("이자바", 28);
		System.out.println("총 Entry 수: " + map.size());
		// 객체 찾기
		System.out.println("이자바 키의 값: " + map.get("이자바"));
		// 저장된 객체 전체 객체를 대상으로 하나씩 얻고싶은 경우
		// 1. 첫번째: keySey()메서드로 모든 키를 Set 컬렉션으로 얻은 다음,
		// 반복자를 통해 키를 하나씩 얻고 get()메서드를 통해 값을 얻는 방법
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println("키: " + key);
			System.out.println("값: " + map.get(key));
		}
		// 2.두 번째: enytrySet()메서드로 모든 MMap.entry를 Set컬렉션으로 얻은 다음,
		// 반복자를 통해 Map.Entry를 하나씩 얻고 getKey()와 getValue() 메서드를 이용해
		// 키와 값을 얻는 방법
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		// 객체 삭제
		map.remove("이자바");
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}
