package c07;

public class Student extends People{
	// 부모 생성자 호출
	// 자바에서 자식 객체를 생성하면 부모객체가 먼저 생성되고 자식 객체가 생성된다.
	private int studentNo;
	public Student(String name, String ssn, int studentNo) {
		// super()는 부모의 생성자를 호출한다.
		super(name, ssn);
		this.studentNo = studentNo;
	}
	public static void main(String[] args) {
		Student s = new Student("김자바", "020101-0323131", 23487234);
	}
}
