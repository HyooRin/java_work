package ch09;

import java.util.Scanner;

/**
 * 
 * @author 김효린 북 객체를 관리하는 프로그램 C R U D : 모든 프로그램 기능구현의 기본 -> 구글링 정의 확인
 */
public class MyBookStore {

	// 메인 함수
	public static void main(String[] args) {

		// 준비물
		Scanner scanner = new Scanner(System.in);
		// 배열은 먼저 배열에 길이를 지정해 주어야 한다.
		Book[] books = new Book[100];
		boolean flag = true;
		int lastIndexNumber = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEATCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		// to do 추후 삭제 예정
		// 임시 데이터
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다.", "김진명");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

		// 실행의 흐름 만들어보기
		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1.저장 2.전체조회 3.선택조회 4. 전체삭제 0. 종료");
			String selectedNumber = scanner.nextLine();
			if (selectedNumber.equals(SAVE)) {
				// 5
				lastIndexNumber = save(scanner,books,lastIndexNumber);


			} else if (selectedNumber.equals(SEARCH_ALL)) {
				readAll(books);

			} else if (selectedNumber.equals(SEATCH_BY_TITLE)) {
				readByTitle(scanner, books);

			} else if (selectedNumber.equals(DELETE_ALL)) {
				deleteAll(books);

			} else if (selectedNumber.equals(END)) {
				// 종료
				System.out.println("종료하기");
				flag = false;
			} else {
				System.out.println("잘못된 입력 값입니다.\n다시선택바람");
			}

		}

	}// end of main

	// 전체 조회하기 기능
	public static void readAll(Book[] books) {
		System.out.println("전체조회하기");
		for (int i = 0; i < books.length; i++) {
			// 타이틀, 이름
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
			}
		}
		System.out.println();
	}

	// 선택조회하기
	public static void readByTitle(Scanner scanner, Book[] books) {

		System.out.println("선택조회하기");
		System.out.println("책 제목을 입력해주세요");
		String bookTitle = scanner.nextLine();
		boolean isFined = false;
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (books[i].getTitle().equals(bookTitle)) {
					System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
					isFined = true;
					break;
				}

			}
		}
		if (isFined == false) {
			System.out.println("아쉽지만 없는 책입니다.");
		}
	}


	// 전체삭제하기

	// 전체삭제
	public static void deleteAll(Book[] books) {
		System.out.println("전체삭제");
		for (int i = 0; i < books.length; i++) {
			// 타이틀, 이름
			if (books[i] != null) {
				books[i] = null;
			}
		}
	


	// 저장하기
	public static int save( Scanner scanner, Book[] books, int lastIndexNumber) {

		System.out.println("저장하기");
		System.out.println("책제목을 입력하세요");
		String bookTitle = scanner.nextLine();
		System.out.println("저자이름을 입력하세요");
		String bookAuthor = scanner.nextLine();
		Book book = new Book(bookTitle, bookAuthor);
		books[lastIndexNumber] = book;
		lastIndexNumber++;
		System.out.println(bookTitle + "책을 저장했어요~");
		return lastIndexNumber;

	
	}
} // end of main

}// end of class
