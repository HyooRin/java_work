package ch07;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		
		// 문제
		// d object에 있는 value 값을 화면에 출력해주세요 
		
		System.out.println(a.b.c.d.value);
		
		ArrayList<String> temp = a.b.c.d.arrayList;
		
		for (String string : temp) {
			System.out.println(string);			
		}
		
		
		
		
	}

}
