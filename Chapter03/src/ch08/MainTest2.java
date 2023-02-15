package ch08;

import java.io.FileInputStream;

public class MainTest2 {

	public static void main(String[] args) {

		// 예외 처리 구문 작성
		// 10 / 0 연산 시키고 예외 처리 까지 작성해주세요
		// 1. try 
		try {
			int result1 = 10/0;
			System.out.println(result1);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}

		// 2. 클래스 설계 throws 활용
		Calculator cal = new Calculator();
		
		try {
			int result2  = cal.calculating();
			System.out.println(result2);
		} catch (Exception e) {
			System.out.println("예외처리");
		}

	}// end of main

}// end of MainTest2 class 

// throws 클래스 설계 
class Calculator {
	
	private int result;
	
	public int calculating() throws ArithmeticException{
		result = 10 / 0;
		return result;
	}
	
	
	
}







