package phonebook;

public class PhoneBookController {
	PhoneBookView pbv = new PhoneBookView();
	PhoneBookService pbs = new PhoneBookService();
	
	public void runApp() {
		while(true) {
			// 메뉴
			int choice = pbv.getMenu();
			switch (choice) {
			// 종료
			case 0:
				pbv.exit();
				return;
			// 추가	
			case 1:
				Person p = pbv.addPerson();
				pbs.addPerson(p);
				break;
			// 읽기	
			case 2:
				pbv.printPersons(pbs.getPersons());
				break;
				
			// 검색	
			case 3:
				String name = pbv.getName();
				Person person = pbs.serchPerson(name);
				pbv.printPerson(person);
				break;
				// 연락처 수정(이름 검색)	
			case 4:
				String editName = pbv.getName();
				Person editPerson = pbs.serchPerson(editName);
				Person editedPerson = pbv.editPerson(editPerson);
				pbs.getPersons().set(editPerson.getIndex(), editedPerson);
				break;
				// 삭제	
			case 5:
				String deleteName = pbv.getName();
				Person deletePerson = pbs.serchPerson(deleteName);
				pbs.getPersons().remove(deletePerson.getIndex());
				break;
			default:
				break;
			}
		}
	}
	
	// 테스트
	public void setTestData() {
		Person p1 = new Person();
		p1.setName("테스트1");
		p1.setPhone("테스트 번호1");
		Person p2 = new Person();
		p2.setName("테스트2");
		p2.setPhone("테스트 번호2");
		Person p3 = new Person();
		p3.setName("테스트3");
		p3.setPhone("테스트 번호3");
		pbs.addPerson(p1);
		pbs.addPerson(p2);
		pbs.addPerson(p3);
	}
}
