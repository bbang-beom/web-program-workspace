package task.game;

import java.util.Scanner;

public class GameListRepository {
	private GameList[] gameLists = new GameList[100];
	private int count = 0;
	
	public void createGameList(GameList gameList) {
		gameLists[count++] = gameList;
	}
	
	// 새로 추가한 gameList별 출력
	public void printGameList(int choice) { // 게임의 종류를 입력받는다. 1.pc 게임 2. 모바일 게임
		for(int i = 0; i < count; i++) {
			if(choice == 1) {  // pc게임이면
				if(gameLists[i].getSort().equals("PCgame")) { // GameList에 있는 새로 추가한 sort 필드에서 문자열 비교	
					System.out.println(gameLists[i].toString()); // 같은 종류의 game만 출력
				}
			}else if(choice == 2) { // mobile게임이면
				if(gameLists[i].getSort().equals("mobliegame")) { // GameList에 있는 새로 추가한 sort 필드에서 문자열 비교
					System.out.println(gameLists[i].toString()); // 같은 종류의 game만 출력
				}
			}
		}
	}
	
	// 새로 추가한 game 분류
	public int sortGame() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.PC 게임 | 2.모바일 게임");
		System.out.print("게임 종류 선택: ");
		int choice = Integer.parseInt(scanner.nextLine()); // 게임의 종류를 입력받아
		return choice; // choice 리턴
	}
}
