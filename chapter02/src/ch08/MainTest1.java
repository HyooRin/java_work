package ch08;

public class MainTest1 {

	// 메인 함수 - 코드의 시작점 
	public static void main(String[] args) {
		
		NumberPrinter numberPrinter1 =new NumberPrinter(1);
		NumberPrinter numberPrinter2 =new NumberPrinter(2);
		
		
		numberPrinter1.printWaitNumber(); // <--- 누군가 
		numberPrinter1.printWaitNumber(); // <--- 다른 누군가  
		numberPrinter1.printWaitNumber(); // <--- 또 다른 누군가
		
		System.out.println("==============================");
		
		numberPrinter2.printWaitNumber(); 
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		
		

	} // end of main

}// end of class
