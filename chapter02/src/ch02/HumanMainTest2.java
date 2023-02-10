package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Human human = new Human();
        // 스캐너를 활용해서 값을 할당해 주세요
		// 마지막에는 showInfo 메서드 호출해서 값을 확인해 주세요
		
		 human.height = scanner.nextLine();
		 human.weight = scanner.nextInt();
		 human.isMan = scanner.hasNext();
		 human.name = scanner.nextLine();
		 
		 human.showInfo();	 		
		
		// 심화 0 번 입력시에 showInfo 호출
		// 스캐너를 통해서 showInfo 메서드 호출 기능 만들어 보기
		 
		 
		

	}// end of main

}// end of class
