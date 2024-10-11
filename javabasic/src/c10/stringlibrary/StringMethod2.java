package c10.stringlibrary;

public class StringMethod2 {
	// String 클래스 2
	// 문자열 찾기(indexOf())
	// indexOf() 메서드는 매개 값으로 주어진 문자열이 시작되는 index를 리턴, 없으면 -1
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("프로그래밍");
		System.out.println(index);
		// indexOf() 메서드는 if문 조건식에서 특정 문자열이 포함되어 있는지에 따라 
		// 실행 코드를 제어할 때 주로 사용한다.
		if(subject.indexOf("자바")!= 1) {
			System.out.println("자바 관련 자료");
		} else {
			System.out.println("자바와 관련 없음");
		}
		// 문자열 길이(length())
		// length() 메서드는 문자열의 길이(문자의 수)를 리턴한다.
		// 문자열의 길이는 공백도 포함한다.
		subject = "자바 프로그래밍";
		int length = subject.length();
		System.out.println(length);
		String ssn = "1234561234561";
		length = ssn.length();
		if(length == 13) {
			System.out.println("자리수 일치");
		}else {
			System.out.println("자리수 불일치");
		}
		// replace() 메서드는 첫 번째 매개값인 문자열을 찾아 
		// 두 번째 매개 값인 문자열로 대치한 새로운 문자열을 생성하고 리턴한다.
		String str = "what the hell";
		String newStr = str.replace("hell", "heaven");
		System.out.println(newStr);
		
		// 문자열 잘라내기(subString())
		// subString() 메서드는 주어진 인덱스에서 문자열을 추출한다. 
		// substring()메서드는 매개값의 수에 따라 두 가지 형태로 사용된다.(메서드 오버로딩)
		// substring(int beginIndex, int endIndex)는 주어진 시작과 끝 인덱스 사이 문자열을 추출하고,
		// substring(int beginIndex)는 주어진 인덱스부터 끝까지 문자열을 추출한다.
		ssn = "123123-1234567";
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		// 알파벳 대문자 <-> 소문자 변경(toLowerCase(), toUpperCase())
		// toLowerCase() 메서드는 문자열을 모두 소문자로 바꾼 새로운 문자열 리턴
		// toUpperCase() 메서드는 문자열을 모두 대문자로 바꾼 새로운 문자열 리턴
		// 이는 영어로 된 문자열을 대소문자 관계없이 비교할 때 주로 사용
		str = "java programming";
		String upperStr = str.toUpperCase();
		System.out.println(upperStr);
		String lowerStr = str.toLowerCase();
		System.out.println(lowerStr);
		System.out.println(str.toLowerCase().equals(upperStr.toLowerCase())); // true
		// equalsIgnoreCase()로 대체가능(대소문자 관계없이 비교)
		System.out.println(str.equalsIgnoreCase(upperStr));
		// 문자열 앞뒤 공백 제거(trim())
		// trim() 메서드는 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성하고 리턴한다.
		String spaceStr = "   자바 프로그래밍   ";
		String nStr = spaceStr.trim();
		System.out.println(nStr);
		
		String tel1 = "   02";
		String tel2 = "123   ";
		String tel3 = "   1234    ";
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
		
		String spaceAll = "          ";
		if(spaceAll.trim().length() <= 0) {
			System.out.println("문자열이 없음");
		}
		// 문자열 변환(valueOf())
		// valueOf() 메서드는 기본 타입의 값을 문자열로 변환한다.
		// String 클래스에는 매개 변수의 타입별로 valuOf()메서드가 오버로딩 되어있다.
		String trans1 = String.valueOf(10);
		String trans2 = String.valueOf(10.5);
		String trans3 = String.valueOf(true);
		System.out.println(trans1);
		System.out.println(trans2);
		System.out.println(trans3);
		
	}
}
