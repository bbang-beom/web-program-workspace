package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookService {
	private List<Person> persons = new ArrayList<Person>();
	
	public List<Person> getPersons() {
		return persons;
	}
	
	
	// 리스트 추가
	public void addPerson(Person p) {
		persons.add(p);
	}
	
	// 이름 검색
	public Person serchPerson(String name) {
		Person person = null;
		for(int i = 0; i < persons.size(); i++) {
			if(persons.get(i).getName().contains(name)) {
				persons.get(i).setIndex(i);
				person = persons.get(i);
			}
		}
		return person;
	}
}
