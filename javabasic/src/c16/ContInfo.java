package c16;

// 호사 정보에 해당하는 연락처와 주소
public class ContInfo {
	// null일 수 있음
	String phone;
	String adrs;
	public ContInfo(String phone, String adrs) {
		this.phone = phone;
		this.adrs = adrs;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdrs() {
		return adrs;
	}
	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}
	
}
