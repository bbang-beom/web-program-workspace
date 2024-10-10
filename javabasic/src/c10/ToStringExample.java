package c10;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		// Object 클래스의 하위 클래스는 toString() 메서드를 오버라이딩하여 정보를 리턴하도록 되어있다.
		// java.util 패키지의 Date 클래스는 toString() 메서드를 재정의하여 현재 시스템의 날짜와 시간 정보를 리턴한다.
		Date date = new Date();
		System.out.println(date.toString());
		
		//String 클래스는 toString()메서드를 재정의해서 저장하고 있는 문자열을 리턴
		String str = "문자열";
		System.out.println(str.toString());
	}
}
