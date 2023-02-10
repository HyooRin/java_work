package ch09;

import java.util.Scanner;

public class BookStoreManger {

	public static void main(String[] args) {

		// 책을 저장하는 기능 만들고
		// 정보를 출력하는 프로그래밍 만들어 주세요
		// 스캐너
		//
		// 문자열
		// 값을 비교하는 연산자 ==
		// 문자를 비교하는 연산자
		String temp = "안녕";
		if (temp.equals("안녕")) {
			System.out.println("같은 값 확인");
		} else {
			System.out.println("값이 달라요~");
		}
		System.out.println("--------------------");
		if ("반가워".equals(temp)) {
			System.out.println("같은 값 확인");
		} else {
			System.out.println("값이 달라요~");
		}

		// TIP
		// 숫자 받는 거 --> 문자열
		// while 문을 사용해서
		// CRUD 개념
		// 1. 저장 2.전체 조회 3.선택조회 4. 전체 삭제 0. 프로그램 종료

		// 도구 준비
		Scanner scanner = new Scanner(System.in);
		// 먼저 몇칸 사용할지 정해 주어야 한다.
		Book[] books = new Book[100];
		String userInput = null;
		boolean flag = true;
		int index = 0;
		
		

		while (flag == true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1, 2, 3, 4, 0.종료");
			userInput = scanner.nextLine();
			if (userInput.equals("0")) {
				flag = false;
				System.out.println("시스템종료");

			} else if (userInput.equals("1")) {
				System.out.println("저장");
				System.out.println("책이름 입력하세요");
				String title = scanner.nextLine();
				System.out.println("저자 입력하세요");
				String author = scanner.nextLine();
				books[index] = new Book(title, author);
				index++;

			} else if (userInput.equals("2")) {
				
				System.out.println("전체조회");
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfo();	
					}
				}
			} else if (userInput.equals("3")) {

				System.out.println("선택조회");
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfo();	
					}
				}
				System.out.println("몇번 조회하시겠습니까");
				
				 int answer = scanner.nextInt();
				 scanner.nextLine();
				 // 배열에 길이 100
				 // 0 , 1 , 2 
				for(int i =0 ; i < books.length ; i++ ) {
					if(books[i] != null ) {
						if(answer == i) {
							books[i].showInfo();	
						}
					}	
				}
			} else if (userInput.equals("4")) {
				System.out.println("전체삭제");
				for(int i = 0; i < books.length; i++) {
				// 2 	
					books[i] = null;
				}
			}
		}
	}// end of main

}// end of class
