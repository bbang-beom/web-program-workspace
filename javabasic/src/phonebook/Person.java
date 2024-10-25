package phonebook;

// Model - DTO
public class Person {
	
	private String name;
	private String phone;
	private int index;
	
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
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	
}
