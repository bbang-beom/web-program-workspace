package task;

import java.util.Scanner;

public class PsyTest {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		PsyTest1 psyTest1 = new PsyTest1();
		psyTest1.psyTest();
		int choice1 = scanner.nextInt();
		System.out.println();
		psyTest1.psyChoice(choice1);
		
		PsyTest2 psyTest2 = new PsyTest2();
		psyTest2.psyTest();
		scanner.nextLine();
		String choice2 = scanner.nextLine();
		System.out.println();
		psyTest2.psyChoice(choice2);
		
		PsyTest3 psyTest3 = new PsyTest3();
		psyTest3.psyTest();
		int choice3 = scanner.nextInt();
		System.out.println();
		psyTest3.psyChoice(choice3);

		PsyTest4 psyTest4 = new PsyTest4();
		psyTest4.psyTest();
		int choice4 = scanner.nextInt();
		System.out.println();
		psyTest4.psyChoice(choice4);
	}
}

class PsyTest1 {
	public void psyTest() {
		System.out.println("간단 심리 테스트 1번 문제");
		System.out.println("가을을 맞이하여 책장 정리를 했느데 책상 위에 필름이 하나 있습니다.");
		System.out.println("그 필름을 인화해봤는데 어떤 사진이 찍혀있을까요?");
		System.out.println("1) 어린이 사진");
		System.out.println("2) 도시의 야경");
		System.out.println("3) 산 풍경");
		System.out.println("4) 동물");
		System.out.print("당신의 선택은: ");
	}
	public void psyChoice(int choice) {
		if(choice == 1) {		
			System.out.println("1) 어린이 사진");
			System.out.println("눈물과 인정에 약한 스타일");
		} else if(choice == 2) {		
			System.out.println("2) 도심의 야경");
			System.out.println("인간 관계가 중요하다고 생각하며 술에 의존하는 스타일");
		} else if(choice == 3) {		
			System.out.println("3) 산 풍경");
			System.out.println("눈약간의 스트레스만 있어도 많이 불안해하는 스타일");
		}else if(choice == 4) {		
			System.out.println("4) 동물");
			System.out.println("이성으로부터 많은 호감을 얻는 스타일");
		}
		System.out.println();
	}
}

class PsyTest2 {
	public void psyTest() {
		System.out.println("간단 심리 테스트 2번 문제");
		System.out.println("당신은 지금 사막을 걷고 있습니다.");
		System.out.println("호랑이, 원숭이, 양, 소, 말과 함께 동행 중인데");
		System.out.println("한마리씩 버려두고 가야한다면 어떤 동물을 차례로 버리시겠습니까?");
		System.out.println("버리는 순서만 기억하시면 됩니다.");
		System.out.print("당신의 선택은(공백으로 순서 구분): ");

	}
	public void psyChoice(String choice) {
		System.out.println("버린 순서: " + choice);
		System.out.println("호랑이: 자존심 / 원숭이: 지식 / 양: 사람 / 소: 재산 / 말: 지식");
		System.out.println();
	}
}

class PsyTest3 {
	public void psyTest() {
		System.out.println("간단 심리 테스트 3번 문제");
		System.out.println("다음 중 좋아하는 빵을 골라보세요.");
		System.out.println("1) 바게트빵, 식빵");
		System.out.println("2) 생크림 케이크");
		System.out.println("3) 카스테라");
		System.out.println("4) 파이, 페이스트리");
		System.out.print("당신의 선택은: ");
	}
	public void psyChoice(int choice) {
		if(choice == 1) {		
			System.out.println("1) 바게트빵, 식빵");
			System.out.println("단 것을 싫어하는 당신은 서구적인 스타링");
			System.out.println("지루한 것을 싫어하기 때문에 다른 것을 찾기 위해 항상 뛰어다님");
		}else if(choice == 2) {		
			System.out.println("2) 생크림 케이크");
			System.out.println("분위기에 압도되는 로맨티스트 스타일");
			System.out.println("영화 감상 등을 취미로 하는 당신은 낭만이란걸 아는 스타일");
		}else if(choice == 3) {		
			System.out.println("3) 카스테라");
			System.out.println("항상 많은 사람들과 잘 어울리는 당신은 원만한 성격인 스타일");
			System.out.println("자기관리를 잘해서 언제나 모범이 될 가능성이 큼");
		}else if(choice == 4) {		
			System.out.println("4) 파이, 페이스트리");
			System.out.println("무궁무진한 호기심으로 도전하는 스타일");
			System.out.println("자신의 일에도 열정이 많은 사람");
		}
		System.out.println();
	}
}

class PsyTest4 {
	public void psyTest() {
		System.out.println("간단 심리 테스트 4번 문제");
		System.out.println("정원에 나무를 심는다면 어떤 나무를 심으시겠어요?");
		System.out.println("1) 예쁜 꽃이 피는 나무");
		System.out.println("2) 먹을 수 있는 열매가 열리는 나무");
		System.out.println("3) 상록수(사계절 내내 푸른 나무)");
		System.out.println("4) 낙엽수(낙엽이 지는 나무)");
		System.out.print("당신의 선택은: ");
	}
	public void psyChoice(int choice) {
		if(choice == 1) {		
			System.out.println("1) 예쁜 꽃이 피는 나무");
			System.out.println("다른 사람에게 비춰지는 자신의 모습을 중시함");
		}else if(choice == 2) {		
			System.out.println("2) 먹을 수 있는 열매가 열리는 나무");
			System.out.println("실제의 자신과 내면을 중시함");
		}else if(choice == 3) {		
			System.out.println("3) 상록수(사계절 내내 푸른 나무)");
			System.out.println("독립적이고 독보적인 자기 맘대로 하는 걸 중시함");
		}else if(choice == 4) {		
			System.out.println("4) 낙엽수(낙엽이 지는 나무)");
			System.out.println("협조적이고 유연성을 중시함");
		}
		System.out.println();
	}
}
