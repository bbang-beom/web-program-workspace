package task.optional;

import java.util.Optional;

public class ContInfo {
	private Optional<String> phone;
	private Optional<String> adrs;
	
	public ContInfo(Optional<String> phone, Optional<String> adrs) {
		this.phone = phone;
		this.adrs = adrs;
	}

	public Optional<String> getPhone() {
		return phone;
	}

	public void setPhone(Optional<String> phone) {
		this.phone = phone;
	}

	public void setAdrs(Optional<String> adrs) {
		this.adrs = adrs;
	}

	public Optional<String> getAdrs() {
		return adrs;
	}
	
}
