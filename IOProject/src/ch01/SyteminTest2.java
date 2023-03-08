package ch01;

import java.io.IOException;

public class SyteminTest2 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 여러 개를 쓰고 Enter를 눌러주세요");
		int i; 
		try {
			
//			i = System.in.read(); // 한번 수행되는 코드 --> 반복 --> Enter키(\n)
			// (괄호 안에는 식을 작성할 수 있다)
			while( (i = System.in.read()) != '\n') {
				// 화면에 출력 
				System.out.println("i :" + i );
				System.out.println("인코딩 :" + (char)i);
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}// end of main

}// end of class
