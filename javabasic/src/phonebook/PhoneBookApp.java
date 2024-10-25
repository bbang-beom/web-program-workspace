package phonebook;



public class PhoneBookApp {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("테스트이름");
		p1.setPhone("테스트전화번호");
		System.out.println(p1);
		
		// MVC패턴 CRUD 기능
		// 메뉴 출력
		PhoneBookController pbc = new PhoneBookController();
//		pbc.runApp();
		// 테스트 데이터 입력
		pbc.setTestData();
		pbc.runApp();
	}
}
