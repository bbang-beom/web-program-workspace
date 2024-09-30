package c06;

// 필드
// 객체의 고유 데이터, 부품 객체, 상태 정보를 저장하는 곳
public class Car {
	// 자동차 객체를 예로 들면
	// 고유 데이터 - 제조회사, 모델, 색, 최고 속도
	String company;
	String model;
	String color;
	String maxSpeed;
	
	// 상태 데이터 - 현재 속도, 엔진 회전 수
	int speed;
	int rpm;
	
	// 부품 - 차체, 엔진, 타이어
	Body body;
	Engine engine;
	TireWheel tireWheel;
}
