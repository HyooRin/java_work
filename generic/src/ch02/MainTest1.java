package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		Power power = new Power();
		Plastic plastic = new Plastic();

		ThreePrinter3 treePrinter3 = new ThreePrinter3();
		// 재료 넣기
		ThreePrinter3.setMaterial(power);
		// 재료 꺼내보기 
		
		Plastic usePlastic = (Plastic)ThreePrinter3.getMaterial();
		
		// Object를 사용하면 불편한 점이 존재한다
		// 다운캐스팅 처리를 해야하고
		// 런타임 시점에 잘못된 처리를 하게되면 예외를 발생시킬 수 있다.

	}// end of main

}// end of class
