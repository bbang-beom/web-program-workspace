package c05;

public class C05_01_02 {

	public static void main(String[] args) {
		// new 연산자로 배열 생성
		int[] arr1 = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] :" + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] :" + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] :" + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] :" + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] :" + arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] :" + arr3[i]);
		}
	}
	
}
