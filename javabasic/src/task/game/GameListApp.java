package task.game;

import java.util.Scanner;

public class GameListApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GameListRepository gameListRepository = new GameListRepository();
		while(true) {
			System.out.println("0.종료 | 1.물품 등록 | 2. 물품 보기");
			System.out.print("선택: ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				int gameChoice = gameListRepository.sortGame(); // 중복된 코드 메서드로 변경
				if(gameChoice == 1) {
					System.out.print("게임 명: ");
					String pcGameName = scanner.nextLine();
					GameList pcGameList = new PCGame();
					pcGameList.setName(pcGameName);
					pcGameList.setSort("PCgame"); // 새로 추가한 setSort 종류를 할당
					gameListRepository.createGameList(pcGameList);
				}else if(gameChoice == 2) {
					System.out.print("게임 명: ");
					String moblieGameName = scanner.nextLine();
					MobileGame mobileGame = new MobileGame();
					mobileGame.setName(moblieGameName);
					mobileGame.setSort("mobliegame"); // 새로 추가한 setSort 종류를 할당
					gameListRepository.createGameList(mobileGame);
				} else {
					System.out.println("잘못된 선택입니다. 다시 선택하세요");
				}
				break;
			case 2:
				int viewChoice = gameListRepository.sortGame();
				gameListRepository.printGameList(viewChoice);
				break;
			}
		}
	}
}
