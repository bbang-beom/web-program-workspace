package c16;

// 친구 정보
public class Friend {
	private String name;
	// null일 수 있음
	private Company cmp;
	
	public Friend(String name, Company cmp) {
		this.name = name;
		this.cmp = cmp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Company getCmp() {
		return cmp;
	}
	public void setCmp(Company cmp) {
		this.cmp = cmp;
	}
}
