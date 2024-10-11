package c11;

import java.util.ArrayList;
import java.util.List;

// 
public class ArrayListClass {

	public static void main(String[] args) {
		// ArrayList 객체를생성
		// List<E> list = new ArrayList<E>;
		// E: 타입 파라미터
		// ArrayList를 생성하기 위해 저장할 객체 타입을 E 타입 파라미터 자리에 표기하고 기본 생성자를 호출한다.
		List<String> list3 = new ArrayList<String>();
		List<Integer> list1 = new ArrayList<Integer>();
		// ArrayList의 E 타입 파라미터를 생략하면 왼쪽 List에 지정된 타입이 지정된다.
		List<ArrayListClass> list2 = new ArrayList<>();
		
		// 기본 생성자로 ArrayList 객체를 생성하면 내부에 10개의 객체를 저장할 수 있는 초기용량을 가진다.
		// 저장되는 객체 수가 늘어나면 자동으로 용량은 증가한다.
		
		// ArrayList에 객체를 추가하면 0번 index로부터 차례대로 저장된다.
		// ArrayList에서 특정 index의 객체를 제거하면 바로 뒤 index부터 마지막 index까지 모두 1씩 당겨진다.
		// ArrayList에서 특정 index의 객체를 추가하면 바로 뒤 index부터 마지막 index까지 모두 1씩 밀려진다.
		// 이런 동작 때문에 저장된 객체 수가 많고, 특정 index에 객체를 추가하거나 제거하는 일이 자주 일어난다면
		// ArrayList보다 LinkedList를 사용하는 것이 좋다.
		// 하지만 index를 이용하여 객체를 찾거나 마지막에 객체를 추가하는 경우에는
		//  ArrayList가 더 좋은 성능을 보인다.
		
		// String 객체를 저장하는 ArrayList
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
//		void add(int index, E element) - 주어진 index에 객체 추가
		list.add(2,"Database");
		list.add("iBATIS");
		
		// index로 객체 반환
		System.out.println(list.get(2));
		
		// 저장된 총 객체 수 얻기ㅣ
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		// 일반 for문으로 루핑
		for(int i = 0; i < list.size(); i++) {		
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		// index 값으로 삭제
		list.remove(2); //Database 삭제
		list.remove(2); //Servlet/JSP 삭제
		// 값으로 삭제
		list.remove("iBATIS"); //iBATIS 삭제
		
		for(String s:list) {
			System.out.println(s);
		}
		
	}

}
