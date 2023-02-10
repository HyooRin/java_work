package ex11;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		// 시작값 종료값을 받아서 구구단을 출력하시오
		int n1 = 0;
		int n2 = 0;
		Scanner scanner = new Scanner(System.in);	
		System.out.println("구구단 시작값을 입력하시오");
		 n1 = scanner.nextInt();
		 System.out.println("구구단 종료값을 입력하시오");
		 n2 = scanner.nextInt();

		for( int i = n1 ; i <= n2  ; i++) {
			for( int j=1; j < 10; j++) {
				System.out.println( i + "*" + j + "=" + ( i * j ));
			}
		}	
	}
}
