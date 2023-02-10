package ch09;

public class BookMainTest1 {

	public static void main(String[] args) {

		// 하나의 데이터를 통으로 관리하고 싶다면 - 배열 (자료구조)
		Book[] books = new Book[10]; // 배열 선언 (메모리 공간 만들어두기)
		books[0] = new Book("플러터UI실전","김근호");
		books[1] = new Book("무궁화꽃이피었습니다.","김진명");
		books[2] = new Book("흐르는강물처럼","파울로코엘료");
		books[3] = new Book("리딩으로리드하라","이지성");
		books[4] = new Book("사피엔스","유발하라리");
		
		//books[5] = new Book("사피엔스","유발하라리");			
		// books[5] = new Book("홍길동전","허균");  java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(books[0].getTitle());
		//System.out.println(books[4].getAuthor());
		
		// books.length --> 배열의 길이 (10)
		for(int i = 0; i < books.length ; i++) {
			// i --> 0, 1, 2, 3, 4, 5
			if( books[i] != null ) { // 방어적 코드 작성
				System.out.println(books[i].getTitle());				
			}else {
				break;
			}

		}
		// 주의 1 
		// 인덱스 크기는 n-1 개다 
		// 배열의 길이와 인덱스의 길이는 다르다.
		// 500 --> 499
		// 12 --->  11
		
		// 주의 2
		// 배열의 길이와 실제 들어가 있는 값의 갯수는 다를 수 있다.
		
		// 문제 1
		// double 배열 4 선언 임의 값 넣고 출력해주세요
		// 3번째 인덱스는  값을 할당하지  마시오!
		// 출력은 for 문 -> 방어적 코드 작성 
		
		double [] arr = new double[4];
		arr [0] = 1.1;
		arr [1] = 2.1;
		arr [2] = 3.1;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0.0) {
				System.out.println(arr[i]);
			}
			
		// 예제 books를 사용하세요!
		// 문제2 
		// 0번째 인덱스에 있는 녀석과 인덱스 2번째 녀석에 값을 스왑해주세요!
		Book temp = books[0];
		books[0] = books[2];  
		books[2] = temp;
			
		// 문제3
		// 인덱스 3번에 값을 삭제해주세요
		books[3] = null;
		
		for (int i = 0;  i < books.length; i++) {
			// i 값 활용 !!
			if(books[i] != null) {
			books[i].showInfo();
			}
		}
			
		}
		
	
		
		
		
		

	}

}
