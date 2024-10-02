package task.Inheritance;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) { 
		// 자바에서 자식 객체를 생성하면 부모객체가 먼저 생성되고 자식 객체가 생성되는데,
		// 부모의 생성자가 호출되지 않았다.
		super(name); // 부모의 생성자를 호출해주면 에러는 사라진다.
		this.name = name;
		this.studentNo = studentNo;
	}
}
