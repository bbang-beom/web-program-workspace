package c11;

import java.util.ArrayList;
import java.util.List;

//컬렉션 프레임워크
// 배열은 기본 타입 뿐만 아니라 클래스 타입의 배열도 만들 수 있기 때문에 객체 저장소로 사용될 수 있다.
// 하지만 배열은 선언 시 정한 크기를 변경할 수 없고, 항목을 저장, 삭제하는 메서드가 없기 때문에 직접 index를 사용해야 한다.
// 이런 불편함 때문에 자바는 컬렉션 프레임워크를 제공한다.
// 자바는 자료구조를 사용해서 객체들을 효율적으로 추가, 삭제, 검색 할 수 있도록 
// 인터페이스와 구현 클래스를 java.util 패키지에 제공한다. 이들을 모두 컬렉션 프레임워크라 부른다. 
// 컬렉션 프레임워크의 주요 인터페이스로는 List, Set, Map이 있다. 

public class Collection {
	// List 컬렉션
	// List 컬렉션은 배열과 비슷하게 객체를 인스턴스로 관리한다. 
	// 배열과의 차이는 저장 용량이 자동으로 증가하며, 객체가 저장할 때 자동 인덱스가 부연된다는 차이가 있다.
	// 또, 추가, 삭제, 검색을 위한 다양한 메서드들이 제공된다.
	// 동일한 객체를 중복하여 저장할 수 있고, null도 저장 가능하다
	// List 컬렉션에는 ArrayList. LinkedList, Vector(1.3버전 이후로는 쓰지 않음)등이 있다.
	
	// ArrayList<E> 참조변수이름 = new ArrayList()<E>;
	// List 인터페이스의 메서드
	// boolean add(E e): 주어진 객체를 맨 끝에 추가한다.
	// E get(int index): 주어진 index에 저장된 객체를 리턴한다.
	// 메서드의 매개 변수 타입과 리턴 타입에 E라는 타입 파라미터는 저장되는 객체의 타입을  
	// List 컬렉션을 생성할 때 결정하라는 뜻이다.
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		// List<String>으로 list 변수를 선언하였다. 
		// List 컬렉션에 String 타입 객체를 저장하겠다는 뜻이다.
		// 따라서, add()메서드의 매개 값은 문자열이 되고 get() 메서드의 리턴 값은 문자열이 된다.
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		String s1 = list.get(0);
		
		//foreach문 사용
		for(String s:list) {
			System.out.println(s);
		}
	}
	
}
