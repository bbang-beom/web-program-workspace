package c06.dto;

// DTO, VO, Entity
public class Person {
	private String name;
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("김자바1");
		p1.setPhone("010-1234-5678");
		Person p2 = new Person();
		p2.setName("김자바2");
		p2.setPhone("010-1234-5678-2");
		Person p3 = new Person();
		p3.setName("김자바3");
		p3.setPhone("010-1234-5678-3");
		
		Person[] pArr = new Person[100];
		pArr[0] = p1;
		pArr[1] = p2;
		pArr[2] = p3;
		for(int i = 0; i < 3; i++) {
			System.out.println(pArr[i].toString());
		}
	}
	
}