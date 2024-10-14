package c11.map;

import java.util.HashMap;
import java.util.Map;

// Ex) 사용자 정의 객체인 Student를 키로 하고 점수를 값으로 저장하는 HashMap
public class Student {
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	// 학번과 이름이 동일한 Student를 동등 키로 간주하기 위해 
	// Student 클래스에는 hashCode()와 equals()메서드를 재정의한다.

	@Override
	public int hashCode() {
		return name.hashCode() + sno;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sno == student.sno && name.equals(student.name));
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(1, "김자바"), 95);
		map.put(new Student(2, "이자바"), 100);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println(map.get(new Student(2, "이자바"))); // 100
		// 학번과 이름이 동일한 Student를 키로 저장할 때
		// 키 값이 중복이면 값만 변경한다.
		map.put(new Student(2, "이자바"), 80);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println(map.get(new Student(2, "이자바"))); // 80 
		
	}
}
