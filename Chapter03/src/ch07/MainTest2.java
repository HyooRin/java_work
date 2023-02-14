package ch07;

public class MainTest2 {

	public static void main(String[] args) {
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘로");
		Book book2 = new Book(2, "홍길동전", "허균");
		Book book3 = new Book(3, "홍길동전", "허균");
		Book book4 = new Book(4, "홍길동전", "허상");

		// 자바 개발자들이 만들어준 String 클래스 안에
		// toStirng 메서드가 재정의 되어있다!!		
		String str1 = new String("허균");
		System.out.println(str1);
		
		// 재정의하지않은 equals
		Boolean result0 = str1.equals("홍길동");

		Boolean result1 = book1.equals(book2);
		System.out.println(result1);

		Boolean result2 = book2.equals(book3);
		System.out.println(result2);
		
		if( book3.equals(book4)) {
			System.out.println("논리적으로 같은 책입니다.");
		}else {
			System.out.println("다른 책입니다.");
		}
	}

}
