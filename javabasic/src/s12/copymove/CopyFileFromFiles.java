package s12.copymove;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// 파일 및 디렉토리의 복사와 이동
// 복사 메서드
// public static Path copy(Path source, Path target, CopyOption...options) throws IOException
// 옵션
// REPLACE_EXISTING: 이미 파일이 존재하면 파일 대체
// COPY_ATTRIBUTES: 파일의 속성까지 복사

// 이동 메서드
// public static Path move(Path source, Path target, CopyOption ... options) throws IOException
// 옵션
// REPLACE_EXISTING: 이미 파일이 존재하면 파일 대체
public class CopyFileFromFiles {
	public static void main(String[] args) {
		Path src = Paths.get("C:/Temp/simple.txt");
		Path dst = Paths.get("C:/Temp/simple2.txt");
		
		try {
			// src가 가리키는 파일을 dst가 가리키는 위치와 이름으로 복사
			Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// C:/Temp/SubTemp 폴더를 생성
		Path srcMove = Paths.get("C:/Temp/simple2.txt");
		Path dstMove = Paths.get("C:/Temp/SubTemp/simple2.txt");
		
		// srcMove가 가리키는 디렉토리를 dstMove가 가리키는 디렉토리로 이동
		try {
			Files.move(srcMove, dstMove, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
