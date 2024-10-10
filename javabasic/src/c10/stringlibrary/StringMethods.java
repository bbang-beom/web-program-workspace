package c10.stringlibrary;

import java.io.UnsupportedEncodingException;

// String 클래스
// 문자열을 생성, 추출, 비교, 찾기, 분리, 변환 등을 제공하는 메서드를 가진 클래스
public class StringMethods {
	public static void main(String[] args) {
		// String 생성자
		// 자바의 문자열은 java.lang 패키지의 String 클래스의 인스턴스로 관리한다.
		// 소스 상에서 문자열 리터럴은 String 객체로 자동 생성되지만, 
		// String 클래스의 생성자를 이용해 직접 String 객체를 생성할 수도 있다.
		
		// 바이트 배열을 문자열로 변환
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String byteStr = new String(bytes);
		System.out.println(byteStr);
		String byteStr2 = new String(bytes, 6, 4);
		System.out.println(byteStr2);
		
		// String 메서드
		// 문자 추출(charAt())
		// charAt() 메서드는 매개값으로 주어진 index의 문자를 리턴
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(3);
		System.out.println(charValue);
		
		// 주민등록번호 성별 구분
		String ssn = "123456-1230123";
		char gender = ssn.charAt(7);
		if(gender == '1' || gender == '3') {
			System.out.println("남자");
		}else if(gender == '2' || gender == '4'){
			System.out.println("여자");
		}
		
		// 문자열 비교(equals())
		// 자바는 문자열 리터럴이 동일하다면 동일한 String 객체를 참조하게 되어있다.
		// 하지만 new 연산자로 생성하면 다른 String 객체를 참조한다. 
		// 때문에 변수에 저장된 주소를 비교하는 == 연산자는 잘못된 결과를 내는 경우가 있다.
		// 그래서, 기본 타입 변수와 달리 String문자열을 비교할 때는 == 연산자 사용하지 않고 
		// equals() 메서드를 사용한다.
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2); // true
		String s3 = new String("Java");
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // true
		
		// 바이트 배열로 변환(getBytes())
		// 네트워크로 문자열을 전송하거나, 문자열을 암호화 할 때 바이트 배열로 변환하는 경우가 있다. 
		// 문자열을 바이트 배열로 변환하는 메서드는 두가지가 있다.
		// getBytes();
		// getBytes(Charset charset);
		// charset 특정 문자셋으로 인코딩된 바이트 배열을 얻으려면 인코딩을 매개변수에 넣어주면 된다.
		try {
			byte[] byteArray1 = "문자열".getBytes("EUC-KR");
			byte[] byteArray2 = "문자열".getBytes("UTF-8");
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// 어떤 문자셋을 넣어주느냐에 따라 배열 크기가 달라진다.
		// EUC-KR은 알파벳은 1바이트, 한글은 2바이트로 변환하고,
		// UTF-8은 알파벳은 1바이트, 한글은 3바이트로 변환한다.
		// 바이트 배열로 변환
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		String str1 = new String(bytes1);
		System.out.println(str1);
	}
}
