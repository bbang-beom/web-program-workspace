package task.optional;

import java.util.Optional;


public class NullPointerCaseStudy {

	public static void showCompAddr(Optional <Friend> f) {
		String addr = f.flatMap(Friend::getCmp).flatMap(Company::getcInfo)
						.flatMap(ContInfo::getAdrs).orElse("information not exist");
		
		System.out.println(addr);
	}
	
	
	public static void main(String[] args) {
		Optional<ContInfo> ci = Optional.of(
				new ContInfo(Optional.ofNullable(null), Optional.of("Republic of Korea")));
		Optional<Company> cp = Optional.of(new Company("YaHo Co.", ci));
		Optional<Friend> frn = Optional.of(new Friend("LEE SU", cp));
		
		showCompAddr(frn);
	}
}
