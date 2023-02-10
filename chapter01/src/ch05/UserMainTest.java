package ch05;

import java.util.Scanner;

public class UserMainTest {
	
	// 메인 함수
	public static void main(String[] args) { 
		
		//Scanner scanner = new Scanner(System.in);
		
		int userinput1 = scanner.nextInt();
		
		// 200 + 엔터
		
		// nextInt() 개행문자 제거하지않았기 때문에
		// 바로 아래 코드가 동작하고 완료되어진다.
		//System.out.println(userinput1);
		//scanner.nextLine();
		// 입력장치 (키보드값을 받아주는 객체)
		// 정수 값을 입력 받을 때 
		//int a = scanner.nextInt();
		// 100 + 엔터(개행문자 \n)
		//scanner.nextLine(); // <-- 엔터키 소화
		
		System.out.println("이름을 입력해주세요");
		String name = scanner.nextLine();
		System.out.println("name" + name );
		
		// 스캐너를 활용해서 값을 입력 받고 화면에 뿌려주세요
		
		// 여러분들이 정의한 클래스를 가지고 값 할당 코드 작성
		
		// 정보를 출력해주세요
		System.out.println("=========상태창===========");
		// 코드 작성
		System.out.println("=========================");
		
		
		// 메모리 올리고
		// 값을 할당
		// 화면에 값을 출력
		
		//User userLee = new User(); 
		//User userkim  = new User(); 
		// 화면에 뿌리기
		
		
		User u1 = new User();
		u1.name = "효린";
		u1.haircolor = "Black";
		u1.height = 163;
		u1.weight = 55;
		u1.phoneNumber = "01022658611";
		
		Scanner scanner = new Scanner(System.in);
		
		u1.name = scanner.nextLine();
		u1.haircolor = scanner.nextLine();
		//u1.height = scanner.nextLine();
		//u1.weight = scanner.nextLine();
		u1.phoneNumber = scanner.nextLine();
		
		System.out.println(u1.name);	
		System.out.println(u1.haircolor);
		//System.out.println(u1.height);
		//System.out.println(u1.weight);
		System.out.println(u1.phoneNumber);
		
		
		
		System.out.println("이름을 입력해주세요.");
		u1.name = scanner.nextLine();
		
		
		
		System.out.println("이름 : " + u1.name);
		
		
		
		
		
	}// end of main

}// end of class
