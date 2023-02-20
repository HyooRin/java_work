package ch01;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine) {
		// 자동차 클래스는 엔진 클래스에 의존합니다. --> 엔진 클래스가 있어야 생성이 된다.
		this.engine = engine; // 초기화 과정이 없으면 ->
	}
	
	public void start() {
		engine.start(); // -> Nullpoint 뜸
		System.out.println("Car started");
	}

}
