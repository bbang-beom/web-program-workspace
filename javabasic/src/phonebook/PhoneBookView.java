package phonebook;

import java.util.List;
import java.util.Scanner;

// View - Console
public class PhoneBookView {
	private Scanner scanner = new Scanner(System.in);
	
	// 메뉴
	// 종료: return 에서 어떤 값을 받아서 종료하는 메서드를 만들지 / 그냥 종료하는 메서드를 사용할지 
	// 생성: 
	public int getMenu() {
		System.out.println("전화번호부");
		System.out.println("0.종료 | 1. 추가");
		System.out.print("메뉴 선택: ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		return choice;
	}
	// 프로그램 종료
	public void exit() {
		System.out.println("프로그램 종료");
	}
	// 추가
	public Person addPerson() {
		System.out.println("전화번호부 추가");
		System.out.print("이름 입력: ");
		String name = scanner.nextLine();
		System.out.print("전화번호 입력: ");
		String phoneNumber = scanner.nextLine();
		Person p = new Person();
		p.setName(name);
		p.setPhone(phoneNumber);
		return p;
	}
	// 읽기
	public void printPersons(List<Person> perseons) {
		for(Person p : perseons) {
			System.out.println(p);
		}
	}
	// 이름 입력
	public String getName() {
		System.out.print("이름 입력: ");
		String name = scanner.nextLine();
		return name;
	}
	// 수정
	public Person editPerson(Person p) {
		System.out.println("연락처 수정");
		System.out.println("검색한 연락처");
		System.out.println(p);
		return addPerson();
	}
	// 연락처 하나만 읽기
	public void printPerson(Person p) {
		System.out.println(p);
	}
}
