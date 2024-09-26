package c04;

import java.util.Scanner;

public class PsySimpleTest {

	public static void main(String[] args) {
		Scanner scnner = new Scanner(System.in);
		System.out.println("간단한 심리 테스트 입니다.");
		System.out.println("문제에 대한 보기를 고르세요");
		System.out.println("(범죄가 아닌 상황에서) 누군가 당신에게 카메라르 들이댄다면");
		System.out.println("어떻게 하실건가요?");
		System.out.println("1)멋진 포즈를 취한다.");
		System.out.println("2)주위 사람들에게 같이 찍자고 한다.");
		System.out.println("3)피한다.");
		System.out.println("4)장난스런 표정을 짓는다.");
		System.out.print("당신의 선택은: ");
		int choice = scnner.nextInt();
		if(choice == 1) {
			System.out.println("1)멋진 포즈를 취한다.");
			System.out.println("당신은 속마음을 드러내지 않으면서 거짓말을 잘하네요.");
		} else if(choice == 2) {
			System.out.println("1)멋진 포즈를 취한다.");
			System.out.println("밝은 성격이며 모임에서 호감을 주고 모두에게 친절하네요.");

		} else if(choice == 3) {
			System.out.println("3)피한다.");
			System.out.println("수줍음이 많은 성격이며 자신감이 부족하네요");

		} else if(choice == 4) {
			System.out.println("4)장난스런 표정을 짓는다.");
			System.out.println("당신은 가볍게 사귀는 것과 즐거운 만남을 좋아하네요.");
		}
	}
}
