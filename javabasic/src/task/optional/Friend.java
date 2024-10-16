package task.optional;

import java.util.Optional;

public class Friend {
	private String name;
	private Optional<Company> cmp;
	
	public Friend(String name, Optional<Company> cmp) {
		this.name = name;
		this.cmp = cmp;
	}

	public String getName() { 
		return name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCmp(Optional<Company> cmp) {
		this.cmp = cmp;
	}

	public Optional<Company> getCmp() {return cmp;}
}
