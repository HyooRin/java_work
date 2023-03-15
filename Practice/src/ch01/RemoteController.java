package ch01;

public interface RemoteController {
	// 모든 변수는 --> public static final
	// 모든 메서드 --> 추상 메서드
	
	// 인터페이스? 
	// 구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도
	
	// 특성
	// 멤버변수 일반 구현 메서드를 가질 수 없고
	// 오직 추상멤서드와 상수만을 멤버로 가질 수 있다.
	// 인터페이스 표준, 약속(강제성있는 규칙)
	
	// 추상 클래스 보다 추상화가 더 높다 
	public static final int SERIAL_NUMBER = 100;
	public abstract void turnOn();
	public abstract void turnOff();

}
