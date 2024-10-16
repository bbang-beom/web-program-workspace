package c16.use;

import java.util.Optional;

import c16.Company;
import c16.ContInfo;
import c16.Friend;

public class OptionalClassUse {
	// null 값이 발생할 때 처리하는 메서드의 Optional을 사용하여 개선된 결과
	public void showCompAddr(Optional<Friend> f) {
		String addr = f.map(Friend::getCmp).map(Company::getcInfo)
						.map(ContInfo::getAdrs).orElse("Not Exist");
		System.out.println(addr);
	}
	
	public static void main(String[] args) {
		ContInfo ci = new ContInfo("123-456-789", "Republic of Korea");
		Company cp = new Company("YaHo Cp., Ltd", ci);
		Friend frn = new Friend("KIM JAVA", cp);
		OptionalClassUse ocu = new OptionalClassUse();
		ocu.showCompAddr(Optional.of(frn));
	}
}
