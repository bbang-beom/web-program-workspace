package task.Inheritance.Ex2;

// 6번 문제
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		// 자바는 생성자 호출 시 부모 생성자가 먼저 호출되기 때문에 Parent 생성자 부터 호출된다.
		// Parent 클래스의 this("대한민국")가 실행되어 
		// public Parent(String nation) 생성자가 먼저 호출되고
		// System.out.println("Parent(String nation) call"); 실행
		// 그 이후 public Parent(String nation) 생성자 호출되어
		// System.out.println("Parent() call");가 실행
		// 부모 생성자가 다 호출 되었으므로 자식 생성자가 호출된다.
		// 마찬가지로 Child 클래스의 this("홍길동")가 실행되어
		// public Child(String name) 생성자가 먼저 호출되고
		// System.out.println("Child(String name) call"); 실행
		// 그 이후 public Child() 생성자 호출되어
		// System.out.println("Child() call"); 실행
		// 따라서 출력 결과는
		/*
		    Parent(String nation) call
			Parent() call
			Child(String name) call
			Child() call
		 */
	}
}
