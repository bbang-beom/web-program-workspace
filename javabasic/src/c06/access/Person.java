package c06.access;

// 무결성
// 데이터에는 제약사항이 존재한다.
// 제약사항에 맞게 결점이 없는 상태를 데이터 무결성이라 한다.

public class Person {
	private String name;
	private int age;
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이는 음수일 수 없다.");
		}
		this.age = age;
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		// 외부에서 음수로 변경하면 클래스 변수의 무결성이 깨진다.
//		p1.age = -10;
		// 메서드를 통해 필드를 변경하는 방법으로 매개값을 검증해서 유효한 값만 객체의 필드로 저장할 수 있다. 
		// 이는 setter의 또다른 역할이다.
	}
}
