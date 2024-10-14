package s12;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		// 바이트 입력 스트림: InputStream
		// InputStream은 바이트 기반 입력 스트림의 최상위 클래스로 추상클래스 이다.
		// 모든 바이트 기반 입력 스트림은 InputStream클래스를 상속받아 만들어진다.
		// InputStream클래스를 상속하는 클래스
		// FileInputStream, BufferedInputStream, DataInputStream
		
		// InputStream 클래스의 주요 메서드
		// 리턴 타입 | 메서드 | 설명
		// int | read() | 1byte를 읽어 리턴
		// int | read(byte[] b) | 읽은 바이트를 매개 값으로 주어진 배열에 저장하고 바이트 수 리턴
		// int | read(byte[] b, int off, int len) | len개의 바이트를 읽고 
		// 매개 값으로 주어진 배열에서 b[off]부터 len개 까지 저장 후 바이트 수 리턴
		// void | close() | 입력 스트림을 닫는다.
		
		// read()메서드는 입력스트림으로부터 더이상 바이트를 읽을 수 없다면 -1 리턴
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			while(true) {
				int data = is.read();
				if(data == -1)
					break;
				System.out.println(data);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// read(byte[] b) 메서드
		// 입력 스트림으로부터 매개 값으로 주어진 배열의 길이만큼 바이트를 읽고 배열에 저장 후 바이트 수 리턴
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			byte[] inputArr = new byte[100];
			while(true) {
				int readedNum = is.read(inputArr);
				if(readedNum == -1)
					break;
				for(int i = 0; i < readedNum; i++) {
					System.out.println(inputArr[i]);
				}
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
