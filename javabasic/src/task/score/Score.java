package task.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Score {
	private String name;
	private int mathScore;
	private int korScore;
	private int engScore;
	private int sum;
	
	public Score() {

	}
	
	public Score(String name, int mathScore, int korScore, int engScore) {
		this.name = name;
		this.mathScore = mathScore;
		this.korScore = korScore;
		this.engScore = engScore;
	}
	
	public String getName() {
		return name;
	}

	public int getMathScore() {
		return mathScore;
	}


	public int getKorScore() {
		return korScore;
	}


	public int getEngScore() {
		return engScore;
	}
	
	public int getSum() {
		sum = getMathScore() + getKorScore() + getEngScore();
		return sum;
	}

	public static void main(String[] args) {
		List<Score> list = new ArrayList<Score>();
		Score score = new Score();
		boolean run = true;
		System.out.println("성적 관리 프로그램");
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("0.종료 | 1. 성적 입력 | 2. 전체 평균 | 3. 과목별 평균 | 4. 과목별 최고 득점 학생");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 0:
				System.out.println("프로그램 종료");
				run = false;
				break;
			case 1:
				list.add(score.getscore());
				break;
				
			case 2:
				score.getAvg(list);
				break;
				
			case 3:
				score.getPerAvg(list);
				break;
				
			case 4:
				score.getMaxScore(list);
				break;

			default:
					System.out.println("없는 선택지");
				break;
			}
		}
	}
	
	public Score getscore() {     // 학생, 점수 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = scanner.nextLine();
		System.out.print("국어: ");
		int korScore = Integer.parseInt(scanner.nextLine());
		System.out.print("영어: ");
		int engScore = Integer.parseInt(scanner.nextLine());
		System.out.print("수학: ");
		int MathScore = Integer.parseInt(scanner.nextLine());
		Score score = new Score(name, MathScore, korScore, engScore);
		return score;
	}

	public void getAvg(List<Score> list) {    // 평균 산출
		int avg = (list.stream().mapToInt(t -> t.getSum()/3).sum()/list.size());
		System.out.println("전체 평균: " + avg);
	}
	
	public void getPerAvg(List<Score> list) {    // 과목별 평균 산출
		int korAvg = (list.stream().mapToInt(t -> t.getKorScore()).sum()/list.size());
		System.out.println("국어 평균: " + korAvg);
		int engAvg = (list.stream().mapToInt(t -> t.getEngScore()).sum()/list.size());
		System.out.println("영어 평균: " + engAvg);
		int mathAvg = (list.stream().mapToInt(t -> t.getMathScore()).sum()/list.size());
		System.out.println("수학 평균: " + mathAvg);
	}
	
	public void getMaxScore(List<Score> list) {  // 최대값 산출
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.국어 | 2. 영어 | 3. 수학");
		System.out.print("출력할 과목 입력: ");
		int choice = Integer.parseInt(scanner.nextLine());
		switch (choice) {
		case 1:
			int korMax = list.stream().mapToInt(t -> t.getKorScore()).max().getAsInt();
			System.out.println("국어 최고 점수: " + korMax);
			list.stream().filter(n -> n.getKorScore() == korMax)
			.forEach(s -> System.out.println("국어 최고 득점자: " + s.getName()));			
			break;
		case 2:
			int engMax = list.stream().mapToInt(t -> t.getEngScore()).max().getAsInt();
			System.out.println("영어 최고 점수: " + engMax);
			list.stream().filter(n -> n.getEngScore() == engMax)
			.forEach(s -> System.out.println("영어 최고 득점자: " + s.getName()));		
			break;
		case 3:
			int mathMax = list.stream().mapToInt(t -> t.getMathScore()).max().getAsInt();
			System.out.println("수학 최고 점수: " + mathMax);
			list.stream().filter(n -> n.getMathScore() == mathMax)
			.forEach(s -> System.out.println("수학 최고 득점자: " + s.getName()));		
			break;

		default:
			System.out.println("없는 선택지");
			break;
		}
	}
	
}
