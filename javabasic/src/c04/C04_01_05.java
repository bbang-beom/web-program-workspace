package c04;

public class C04_01_05 {

	public static void main(String[] args) {
		// 주사위를 굴려서 나올 수 있는 1, 2, 3, 4, 5, 6 중에서 
		// 하나의 수를 무작위로 뽑아서 출력하는 프로그램
		
		//정수 난수를 얻는다
		double d1 = Math.random();
		// Math.random()메서드는 0.0과 1.0 사이에 속하는 double 타입 난수 하나 리턴
		// 0.0 <= Math.random() < 1.0
		System.out.println(d1);
		
		// 1~10 사이의 수 중 하나를 얻기 위해 각 변에 10을 곱한다.
		// 0.0 * 10 <= Math.random() < 1.0 * 10
		
		// 각 변을 int 타입으로 강테 타입 변환하면 정수값 리턴
		// 0.0 * 10 <= (int)Math.random() < 1.0 * 10 -> 0~9 사이의 정수 리턴
		// 각 변에 1을 더하면 1~10 사이의 정수 중 하나 리턴
		//0.0 * 10 + 1 <= (int)Math.random() < 1.0 * 10 + 1
		int n = 10, start = 1;
		// start부터 시작하는 n개의 정수 중 임의의 정수를 얻는 실행문
		int num = (int)(Math.random()*n) + start;
		
		// 주사위 번호 하나를 뽑기 위해 1부터 시작하는 6개 정수
		int dice = (int)(Math.random()*6) + 1;
		if(dice == 1) {
			System.out.println("주사위 1");
		} else if(dice == 2) {
			System.out.println("주사위 2");
		} else if(dice == 3) {
			System.out.println("주사위 3");
		} else if(dice == 4) {
			System.out.println("주사위 4");
		} else if(dice == 5) {
			System.out.println("주사위 5");
		} else {
			System.out.println("주사위 6");
		}
	}

}
