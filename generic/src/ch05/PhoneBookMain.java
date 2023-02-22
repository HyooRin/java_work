package ch05;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		// while 0 종료 1. 저장 2. 전체조회 3. 선택조회 4. 선택삭제 5 전체삭제		
		Scanner scanner = new Scanner(System.in);
		System.out.println("기능을 선택해주세요");
		// Tip -> 데이터 입력 
		// 샘플 데이터 만들어서 활용 		
		PhoneBook[] numbers =  new PhoneBook[4];
		numbers[0] = new PhoneBook("A", "123"); 
		numbers[1] = new PhoneBook("B", "456"); 
		numbers[2] = new PhoneBook("C", "789"); 
		numbers[3] = new PhoneBook("D", "000"); 		
		
		String userInput = "-1";
		int index = 0;
		
		while(!userInput.equals("0")) {
			System.out.println("0. 종료 1. 저장 2. 전체조회 3. 선택조회 4. 선택삭제 5 전체삭제");
			userInput = scanner.nextLine();
			
			if(userInput.equals("1")) {
				System.out.println("저장하고싶은 이름과 전화번호를 순서대로 입력해주세요");
				String name = scanner.nextLine();
				String number = scanner.nextLine();
				numbers[index] = new PhoneBook(name, number);		
				index++;
				
			}else if(userInput.equals("2")) {
				System.out.println("전체 조회입니다");
				for(int i = 0; i < numbers.length; i++) {
					numbers[i].showInfo();
				}
				
			}else if(userInput.equals("3")) {
				System.out.println("선택 조회 : 조회하고 싶은 이름을 입력해주세요");
				String name = scanner.nextLine();
				
				
			}else if(userInput.equals("4")) {
				System.out.println("선택 삭제 : 삭제할 전화번호의 이름을 선택해주세요");
				
			}else if(userInput.equals("5")) {
				System.out.println("전체 삭제입니다");
			}
			
			
		}
		System.out.println("프로그램 종료");

	}

}
