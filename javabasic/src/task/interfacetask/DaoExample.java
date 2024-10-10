package task.interfacetask;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}
}

class OracleDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");

	}
	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");

	}
	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");

	}
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");

	}
}

class MysqlDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("Mysql DB에서 삽입");

	}
	@Override
	public void update() {
		System.out.println("Mysql DB에서 수정");

	}
	@Override
	public void delete() {
		System.out.println("Mysql DB에서 삭제");

	}
}

class task1 {
	// 인터페이스 타입 변환에 대한 설명
	// 구현 객체는 인터페이스 타입으로 자동 변환된다. (O)
	// 부모 클래스가 인터페이스를 구현하면 자식 클래스로부터 생성된 객체는 인터페이스 타입으로 자동 변환할 수 없다. (X) 자식 클래스 객체도 변환 가능하다.
	// 인터페이스 변수에 대입된 객체를 원래 구현 클래스 타입으로 변환하는 것을 강제 타입 변환이라고 한다. (O)
	// 메서드의 매개변수 타입이 인터페이스이면 매개값으로 모든 구현 객체를 대입하면 자동 타입 변환이 된다. (O)
}

class task2 {
	// 다형성에 대한 설명
	// 다형성을 구현하기 위한 조건은 메서드 재정의와 타입 변환이다. (O)
	// 클래스 상속과 인터페이스는 모두 메서드 재정의와 타입 변환 기능이 제공되므로, 
	// 어떤 방법을 사용하든 다형성 구현이 가능하다.(O)
	// 매개 변수의 타입이 클래스라면 해당 클래스로 생성된 객체만 대입이 가능하다. (X) 자식 클래스의 객체도 대입이 가능하다.
	// 매개 변수의 타입이 인터페이스라면 모든 구현 객체가 대입이 가능하다. (O)
}
