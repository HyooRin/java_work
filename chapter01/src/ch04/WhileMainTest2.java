package ch04;

import java.util.Scanner;

public class WhileMainTest2 {

	// 메인 작업자 (메인 쓰래드)
	public static void main(String[] args) {
		
		
//		do {
//		} while(조건식);
		// 사용자가 0을 입력하면 프로그램을 종료하는 코드를 만들어 주세요
		System.out.println("값을 입력해주세요");
		Scanner   sc = new Scanner(System.in);
		int userinput = -1;
		
		int num = 1;
		int sum = 0;
		do {
			System.out.println("값을 입력해주세요");
			userinput = sc.nextInt();
			// 한번 코드를 수행하고
			// 다시 사용자 입력값을 받고 싶다면 
			// 1 --
			// 3
			// 5
			sum += userinput;
			System.out.println("연산된 값:" + sum);
		}while(true);
		 //                               10

		//           1    >=  10
		
		

//		while(true) {
//			System.out.print("--");
//			// 예외 처리
//			try {
//				// 쓰래드
//				Thread.sleep(100);
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		} // end of while
		
		// 작업자 힘드니깐 1초 잠들어
		
		
		

	}//end of main

}
