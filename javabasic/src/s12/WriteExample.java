package s12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

// 입출력 스트림
// 프로그램은 데이터를 읽고 출력하는 작업을 자주 수행한다.
// 데이터는 키보드를 통해 입력되거나 파일 또는 네트워크로부터 입력될 수 있고, 모니터나 파일 또는 네트워크로 출력될 수 있다.

// 자바에서 데이터는 스트림(Stream)을 통해 입출력된다.
// 스트림은 단일 방향으로 데이터가 출발지에서 도착지로 연속적으로 흘러간다는 것을 말한다.

// 프로그램이 도착지라면 들어온 데이터를 입력받아야 하므로 입력 스트림을 사용하고, 출발지라면 출력 스트림을 사용한다.

// 입출력 스트림 종류
// java.io 패키지에는 여러 가지 종류의 스트림 클래스를 제공하며 크게 두종류로 구분된다.
//  바이트 기반 스트림: 그림, 멀티미디어 등의 바이너리 데이터를 읽고 출력할 때 사용
// 문자 기반 스트림: 문자 데이터를 읽고 출력할 때 사용
public class WriteExample {

	public static void main(String[] args) {
		// 바이트 출력 스트림:OutputStream
		// OutputStream은 바이트 기반 출력 스트림의 최상위 클래스로 추상 클래스이다.
		// 모든 바이트 기반 출력 스트림 클래스는 OutputStream클래스를 상속받아 만들어진다.
		// OutputStream클래스를 상속하는 클래스들
		// FileOutStream, PrintStream, BufferedOutStream, DataOutputStream

		// OutputStream 클래스의 주요 메서드
		// 메서드 | 설명
		// void write(int b) | 1byte를 출력
		// void write(byte[] b) | 매개 값으로 주어진 배열 b의 모든 바이트를 출력
		// void write(byte[] b, int off, int len) | 매개 값으로 주어진 배열 b[off]부터 len개의 바이트를 출력
		// void flush() | 출력 버퍼에 잔류하는 모든 바이트를 출력
		// void close() | 출력 스트림을 닫는다.
		OutputStream os = null;
		byte a = 10;
		byte b = 20;
		byte c = 30;
		try {
			os = new FileOutputStream("C:/Temp/test1.db");
			os.write(a);
			os.write(b);
			os.write(c);
			// 출력 버퍼에 잔류하는 모든 바이트를 출력
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// write(byte[] b) 메서드
		try {
			OutputStream os1 = new FileOutputStream("C:/Temp/test2.db");
			byte[] array = {10, 20, 30};
			os1.write(array);
			os1.flush();
			os1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// write(byte[] b, int off, int len) 메서드
		try {
			OutputStream os2 = new FileOutputStream("C:/Temp/test3.db");
			byte[] array = {10, 20, 30, 40, 50};
			// 배열 일부 출력
			os2.write(array,1,3); // 1번 index부터 3개 출력
			os2.flush();
			os2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
