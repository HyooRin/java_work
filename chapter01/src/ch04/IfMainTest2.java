package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	//main 함수
	public static void main(String[] args) {
		
		System.out.println("성적을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int point =sc.nextInt();
		// 100 ~ 90 A학점 입니다.
		// 89이하 80이상이거나 같다면 B학점 입니다.
		// 79이하 70이상이거나 같다면 C학점 입니다.
		// 69이하 60이상이거나 같다면 D학점 입니다.
		// 나머지는 F학점 입니다.
		char result = 'Z';
		
		if(point <= 100 && point >= 90) {
			result = 'A';
		}else if(point <= 89 && point >= 80) {
			result = 'B';
		}else if(point <= 79 && point >= 70) {
			result = 'C';
		}else if(point <= 69 && point >= 60) {
			result = 'D';
		}
		
		// 방어적 코드를 작성
		if( result == 'Z') {
			System.out.println("값을 잘 못 입력하였습니다.");
		}else {
		System.out.println( result + "학점 입니다.");
		}

	}//end of main

}
