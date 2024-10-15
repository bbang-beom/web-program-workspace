package c14;

// 람다식을 쓸 인터페이스를 정의할 때 컴파일러에게 함수형 인터페이스의 조건을 갖추었는지 검사를 요청
// 함수형 인터페이스: 추상 메서드가 하나만 존재하는 인터페이스
// @FuncionalInterface 어노테이션을 붙여주면 함수형 인터페이스인지 컴파일러가 검사한다.
@FunctionalInterface
public interface Cal {
	int cal(int a, int b);
}
