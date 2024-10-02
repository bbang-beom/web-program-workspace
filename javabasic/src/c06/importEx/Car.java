package c06.importEx;

import java.util.Scanner;

import c06.com.hankook.BroadTire;
import c06.com.hankook.Tire;

//import c06.com.hankook.*;
// *: all, 모든 것
// *를 이용해서 해당 패키지에 소속된 모든 클래스를 포함(import) 시킨다.
// 쓰지 않는 클래스도 포함 되기 때문에 성능 문제로 인해 일반적으로 개별로 import해서 사용한다.

public class Car {
	Tire tire = new Tire();
	// 경우에 따라 import문과 상관없이 패키지가 포함된 클래스 전체 이름을 코드에 기술해야 할 때가 있다.
	// 패키지 이름은 다르나 클래스 이름이 같은 경우나 import문 없이 다른 패키지의 클래스를 바로 사용해야 할 경우 
	// 패키지 이름과 클래스 이름 전체를 적어주면 된다.
	c06.com.kumho.Tire kTire = new c06.com.kumho.Tire();
	Scanner scanner = new Scanner(System.in);
	BroadTire broadTire = new BroadTire();
	
	public static void main(String[] args) {
		Math.random();
	}
}
