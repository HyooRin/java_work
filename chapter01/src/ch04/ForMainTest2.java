package ch04;

public class ForMainTest2 {

	// main 함수
	public static void main(String[] args) {

		int num = 2;
		for(int j =2; j < 10; j++) {
			System.out.println(" j : " + j);
		
		
		for (int i = 1; i < 10; i++) {
			// i 변수에 유효범위는 end of 까지이다.
			System.out.println(num + "* " + i + " =" + (num * i));
		} // end of for
		}
		

		System.out.println("==========================");
		
		// 이중 for 문을 활용하여 2~9단까지 구구단을 출력해주세요 
		
		num = 2;
		for(int j =2; j < 10; j++) {
			System.out.println(" j : " + j);
		  for (int i = 1; i < 10; i++) {
			// i 변수에 유효범위는 end of 까지이다.
			System.out.println(j + " * " + i + " = " + (j * i));
		  } // end of for
		}
		
		System.out.println("==========================");
		
		// * 찍기 
		
	num = 1;
	for(int i = 1; i < 5 ; i++) {
			
		  for (int j = 0; j < i; j++) {
			System.out.println("*");
		} 
		  System.out.println(" ");
		}
		


		
	}// end of main

}// end of class
