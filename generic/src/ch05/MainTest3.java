package ch05;

import java.util.HashMap;
import java.util.Map;

public class MainTest3 {

	public static void main(String[] args) {
		// Map 자료구조를 이용해서 전화번호를 저장해주세요
		// 1 - String, String
		// 2- String, Object (Person)
		
		// HashMap 생성
		Map<String, String> phoneBook = new HashMap<>();
		// 전화번호 추가
		phoneBook.put("홍길동", "010-1234-1234" );
		phoneBook.put("김철수", "010-222-222" );
		phoneBook.put("홍길동", "010-1234-1234" );
		
		// key  값은 중복될 수 없다.
		System.out.println(phoneBook);
		
		// 전화번호 검색
		//String phoneNumber = phoneBook

	}

}
