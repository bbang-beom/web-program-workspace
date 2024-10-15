package trywithresources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// try-with-resource
// 예외 처리 구문
// 자바 7버전에서 새로 업데이트되었음
public class TryWithResources {
	// 자바 7버전 이전의 try-catch-finally
	public static void main(String[] args){
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:/Temp/file.txt");
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		// 자바 7번부터 try-with-resource
		//자바는 이러한 문제점을 해결하기 위해 7버전부터 자원을 자동으로 반납해주는 try-with-resource 문법을 추가하였다.
		try(FileInputStream fis = new FileInputStream("file.txt");) {
			fis.read();
			// try 구문을 빠져나갈 때 다음 문장을 안정적으로 자동 실행
			// fis.close();
			// try-with-resources 기반의 오픈 및 종료 대상이 되기위한 조건
			// java.lang.AutoClosable 인터페이스를 구현
			// AutoClosable은 Closable의 상위 클래스
		} catch (Exception e) {
			e.printStackTrace();
		}
		// new 키워드가 두개 이상인 경우
		try(FileInputStream fis = new FileInputStream("file.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
