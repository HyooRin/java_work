package ch03;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 산술 연산자 
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		int number4 =  (int)(5.0 /  4.0);
		int number5 = 5 % 3;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4); // 1.666666 
		System.out.println(number5);
		
		System.out.println("=======================");
		
		// 문제
		// 1.   (12 + 3) / 3 화면에 출력하세요
		int n = (12 + 3 ) / 3;
		System.out.println(n);
		// 2.  (25 % 2) 값을 화면에 출력하세요
		int a = 25 % 2;
		System.out.println(a);
		// 3.  3.0 / 5 를 정수값 result 변수에 담아 주세요
		double b = 3.0 / 5;
		System.out.println(b);
		System.out.println((int)3.0/5);

	}//end of main

}//end of class
