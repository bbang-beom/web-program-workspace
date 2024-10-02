package task.Inheritance.Ex2;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국"); // Parent(String nation)을 사용한 중복 코딩 제거
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
