package c07.casting;

// 강제 타입 변환(casting)
// 부모 클래스의 타입을 자식 클래스의 타입으로 변환하는 것
// 자식 클래스의 타입이 부모 클래스의 타입으로 자동 타입 변환 후 
// 다시 자식 타입으로 변환할 때 상제 타입 변환을 사용할 수 있다.
// 자식타입 변수 = (자식타입)부모타입;
public class ForceCasting extends ForceCastingParents{
	
	public static void main(String[] args) {
		// 자식 타입 클래스가 부모 타입으로 자동 타입 변환하면 
		// 부모 클래스에 선언된 필드와 메서드만 사용 가능하다는 제약사항이 존재한다.
		// 자식 타입 클래스에 선언된 필드와 메서드를 꼭 사용해야 한다면 
		// 강제 타입 변환을 통해 다시 자식 타입으로 변환한 다음 필드와 메서드를 사용해야 한다.
		ForceCastingParents fcp = new ForceCasting();
		ForceCasting fc = (ForceCasting)fcp;
		// 객체 타입 확인
		ForceCastingParents fcp1 = new ForceCastingParents();
//		ForceCasting fc1 = (ForceCasting)fcp1; // 변환 불가
		
		// 부모 변수가 참조하는 객체가 부모 클래스 객체인지 자식 클래스 객체인지 확인하는 방법
		// instanceof: 인스턴스가 어떤 클래스의 인스턴스인지 확인
		// boolean result = 좌항(객체 또는 인스턴스) instanceof 우항(타입);
		// 좌항의 객체가 우항의 인스턴스면 true 아니면 false
		if(fcp1 instanceof ForceCasting) {
			ForceCasting fc1 = (ForceCasting)fcp1;
		}
		System.out.println("다음 코드");
		ForceCasting fc2 = new ForceCasting();
		fc2.checkCast(new ForceCasting());
		fc2.checkCast(new ForceCastingParents());
	}
	
	public void checkCast(ForceCastingParents fcp) {
		if(fcp instanceof ForceCasting) {
			ForceCasting fc = (ForceCasting)fcp;
			System.out.println("변환 성공");
		}else {
			System.out.println("변환 불가");
		}
	}
}
