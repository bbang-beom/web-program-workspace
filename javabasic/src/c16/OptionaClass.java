package c16;

// Optional 클래스
// NulllPointException 예외가 발생할 수 있는 상황에서 유용하게 쓰인다.
// null로 초기화 할 인스턴스 변수가 없는 것이 가장 좋지만 
// 일반적으로 데이터베이스와 연동해서 사용하다보면 null 값이 발생할 상황이 종종 생긴다.
public class OptionaClass {
	public void showCompAddr(Friend f) {
		String addr = null;
		// 인자로 전달된 것이 null일 경우
		if(f != null) {
			Company com = f.getCmp();
			// 회사 정보가 없을 경우
			if(com != null) {				
				ContInfo info = com.getcInfo();
				// 회사의 연락처 정보가 없는 경우
				if(info!=null) {
					addr = info.getAdrs();
				}
			}
		}
		// 회사의 주소 정보가 없는 경우
		if(addr != null) {
			System.out.println(addr);
		} else {
			System.out.println("회사 주소 정보가 없습니다.");
		}
		// null 가능성에 대비하는 코드의 작성은 번거롭고 코딩 스타일도 만족스럽지 못하다.
		// 이를 해결하기 위해 Optional 클래스가 생겼다.
	}
}
