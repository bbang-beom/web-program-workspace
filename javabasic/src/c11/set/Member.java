package c11.set;

import java.util.HashSet;
import java.util.Set;

public class Member {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 인스턴스가 달라도 이름과 나이가 동일하다면 동일한 객체로 간주하여 
	// 중복 저장하지 않도록 하기 위해서hashCode()와 equals()메서드를 재정의한다.
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		// name과 age의 값이 같으면 true
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age == age);
		} else
			return false;
	}
	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		Member m1 = new Member();
		m1.setName("홍길동");
		m1.setAge(30);
		set.add(m1);
		Member m2 = new Member();
		m2.setName("홍길동");
		m2.setAge(30);
		set.add(m2);
		System.out.println("총 객체 수: " + set.size());
		if(set.add(m2)) {
			System.out.println("저장 완료");
		} else {
			System.out.println("중복 불가");
		}
		System.out.println(m1.getName());
		System.out.println(m2.getName());
		System.out.println(m1.getName().hashCode());
		System.out.println(m2.getName().hashCode());
	}
}
