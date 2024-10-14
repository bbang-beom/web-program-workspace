package s12.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Paths와 Path 클래스
// java.nio.file.Path 위치에 있다.
// 자바 1.7(7)에서 파일 및 디렉토이의 경로 표현을 위해 추가된 인터페이스
// java.nio.file.fies의 메서드들
// createFile() - 지정한 경로에 빈 파일 생성, 경로가 유효하지 않거나 이미 파일이 존재하면 예외 발생
// createDirectories() - 지정한 경로에 모든 디렉토리 생성 
// 리턴 타입은 Parh로 리턴
// List<String> readAllLines(Path path) - 모든 문자를 읽는다.
// Path write(Path path) - 모든 문자를 출력 
public class SimpleTextWriteRead {
	public static void main(String[] args) {
		// 문자 데이터의 간단한 입력 및 출력의 예
		Path fp = Paths.get("C:/Temp/simple.txt");
		String str1 = "One Simple String";
		String str2 = "Two Simple String";
		List<String> list = new ArrayList<String>();
		list.add(str1);
		list.add(str2);
		
		try {
			Files.write(fp, list);
			System.out.println("파일 저장 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
