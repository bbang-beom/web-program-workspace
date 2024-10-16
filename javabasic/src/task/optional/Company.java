package task.optional;

import java.util.Optional;

public class Company {
	private String cName;
	private Optional<ContInfo> cInfo;
	
	public Company(String cName, Optional<ContInfo> cInfo) {
		this.cName = cName;
		this.cInfo = cInfo;
	}

	public String getcName() { 
		return cName; 
	}

	public void setcInfo(Optional<ContInfo> cInfo) {
		this.cInfo = cInfo;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Optional<ContInfo> getcInfo() {
		return cInfo; 
	}
}
