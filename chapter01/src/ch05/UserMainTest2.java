package ch05;

import java.util.Scanner;

public class UserMainTest2 {
	
	// 메인 함수
	public static void main(String[] args) { 
		
		// 메모리 올리고
		User u1 = new User();
		u1.name = "효린";
		u1.haircolor = "Black";
		u1.height = "163";
		u1.weight = "55";
		u1.phoneNumber = "01022658611";
		
		// 값을 할당
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		u1.name = scanner.nextLine();
		System.out.println("키를 입력해주세요");
		u1.height = scanner.nextLine();
		System.out.println("몸무게를 입력해주세요");
		u1.weight = scanner.nextLine();
		System.out.println("전화번호를 입력해주세요");
		u1.phoneNumber = scanner.nextLine();
		
		// 화면에 값을 출력
		System.out.println("name:" + u1.name );
		System.out.println("height:" + u1.height );
		System.out.println("weight:" + u1.weight );
		System.out.println("phoneNumber:" + u1.phoneNumber );

	}// end of main

}// end of class
