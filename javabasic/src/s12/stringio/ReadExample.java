package s12.stringio;

// 문자 입력 스트림: Reader
// Reader는 문자 기반 입력 스트림의 최상위클래스로 추상 클래스이다.
// 모든 문자 기반 입력 스트림 클래스는 Reader클래스를 상속받아 만들어진다.
// Reader클래스를 상속하는 클래스들
// FileReader, BufferedReader, InputStreamReader

// Reader클래스의 주요 메서드
// 리턴 타입 | 메서드 | 설명
// int | read() | 1개의 문자를 읽고 리턴
// int | read(char[] cbuf | 읽은 문자를 매개 값으로 주어진 문자 배열에 저장 후 문자 수 리턴
// int | read(char[] cbuf, int off, int len) | 
// len개의 문자를 읽고 매개 값으로 주어진 문자 배열에서 cbuf[off]부터 len개까지 저장하고 문자 수 리턴
// void | close() | 입력 스트림을 닫는다.
public class ReadExample {

}
