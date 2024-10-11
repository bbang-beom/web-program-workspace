package c11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		
		// 프로그램의 기본 기능: CRUD
		// C - create: 생성
		Person p1 = new Person();
		p1.setName("김자바");
		Person p2 = new Person();
		p2.setName("이자바");
		Person p3 = new Person();
		p3.setName("박자바");
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		// R - read: 읽기
		for(Person p:persons) {
			System.out.println(p);
		}
		// U - update: 수정
		// 1번 index의 name 수정
		persons.get(1).setName("최자바");
		System.out.println("1번 index" + persons.get(1));
		// D - delete: 삭제
		// 2번 index 삭제
		persons.remove(2);
//		persons.remove("박자바"); // 값으로도 가능
	}
	
}
