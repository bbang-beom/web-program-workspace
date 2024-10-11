package c10.wrap;

// Wrapper(포장) 클래스
// 자바 기본 타입(byte, char, short, int, long, float, double, boolean)의 값을 갖는 객체를 생성할 수 있다.
// 기본 타입의 값을 내부에 두고 포장하기 때문에 포장(wrapper) 객체라 한다.
// 컬렉션 프레임워크에서 기본 타입 값을 객체로 생성해서 관리할 때 주로 사용한다.
// 포장 클래스
// Byte, Character, Short, Integer, Long, Float, Double, Boolean
public class WrapperClass {
	public static void main(String[] args) {
		// 박싱(Boxing)과 언박싱(Unboxing)
		// 기본 타입의 값을 포장 객체로 만드는 과정을 박싱이라 하고,
		// 포장 객체에서 기본 타입의 값을 얻어내는 과정을 언박싱이라 한다.
		Integer i = new Integer(100);
		Double d = new Double(10.5);
		Boolean b = new Boolean(false);
		
		// 각 포장 클래스 마다 가지고 있는 정적 valueOf() 메서드를 사용할 수 있다.
		Integer i1 = Integer.valueOf(1000);
		Integer i2 = Integer.valueOf("1000");
		// 다시 기본 타입의 값을 얻기위해(언박싱) 각 포장 클래스마다 가지고 있는 
		// '기본타입이름 + value()' 메서드를 사용한다.
		int int1 = i.intValue();
		double double1 = d.doubleValue();
		boolean boolean1 = b.booleanValue();
		
		// 포장 클래스 타입에 기본 값을 대입하면 자동 박싱이 된다.
		Integer i3 = 100;
		int int3 = i3;
		int int4 = i3 + 100;
		
		// 문자열을 기본 타입 값으로 변환
		// 포장 클래스 대부분 'parse+기본타입이름'으로 되어있는 정적(static) 메서드가 있다.
		// 이 메서드는 문자열을 매개 값으로 받아 기본 타입으로 변환한다.
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		// 포장 값 비교
		// 포장 객체는 내부의 값을 비교하기 위해 ==와 != 연산자를 사용하지 않는 것이 좋다.
		// ==, != 연산자는 내부의 값을 비교하는 것이 아닌 객체의 참조를 비교하기 때문이다.
		// 언박싱한 값을 얻어 비교 하거나 equals()메서드 내부 값을 비교하는 것이 좋다.
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2);
	}
}
