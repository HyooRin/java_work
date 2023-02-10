package ch01;

// 수입하다. 가져오다.
import java.util.Scanner;

public class MainTest3 {

	// 메인 함수
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);
		Student studentKim = new Student();
		System.out.println(studentKim); // 주소값이 출력이 된다.(ch01.Student@7c30a502)
		Student studentLee = new Student();
		System.out.println(studentLee);// 주소값이 출력이 된다.(ch01.Student@49e4cb85)
		// **
		// 기본 데이터 타입 -- 값(리터럴)이 출력이 된다.
		// 참조 타입 - 주소값이 출력이 된다.
		System.out.println("-----------");
		System.out.println(studentLee.studentid); // 0
		System.out.println(studentLee.studentName); // null
		System.out.println(studentLee.address); // null
		System.out.println(studentLee.height); // 0.0
		System.out.println(studentLee.isMarred);// false
		// 멤버 변수는 객체로 메모리에 올라간 뒤 멤버 변수에 값을 할당하지 않으면 
		// 기본 값으로 먼저 초기화 해준다. (컴파일러가 알아서 초기화 해줌)
		
	}// end of main

}// end of class
