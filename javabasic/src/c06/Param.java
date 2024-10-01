package c06;

public class Param {
	// 매개변수의 개수를 모를 경우 
	// 메서드의 매개변수는 개수가 이미 정해져있는 것이 일반적이지만
	// 메서드를 선언할 때 매개변수의 개수를 알 수 없는 경우도 있다.
	
	// 매개변수를 배열 타입으로 선언
	void sum1(int[] values) {
		for(int v: values) {
			System.out.println(v);
		}
	}
	
	// 매개 변수를 배열 타입으로 선언하면 메서드를 호출하기 전에 배열을 생성해야하는 불편한 점이 있다. 
	// 이때문에 배열을 생성하지 않고 값의 목록만 넘겨주는 방법도 있다.
	//매개변수를 ...을 사용해서 선언하게 되면 메서드 호출 시 넘겨준 값의 수에 따라 
	// 자동으로 배열이 생성되고 매개 값으로 사용된다.
	void sum2(int ...values) {
		for(int v:values) {
			System.out.println(v);
		}
	}
	public static void main(String[] args) {
		Param p = new Param();
		int[] values = {1, 2, 3};
		p.sum1(values);
		p.sum1(new int[]{1, 2, 3});
		
		// ...로 선언된 매개변수의 값은 다음과 같이 메서드 호출 시 쉼표로 나열해주면 된다
		p.sum2(1, 2, 3);
		p.sum2(values);
		p.sum2(new int[]{1, 2, 3});
	}
}
