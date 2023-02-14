package ch07;

public class MainTest4 {

	//String str;
	// String 문서확인
	// string 존재하는 메서드 5개정도
	// 선택해서 사용방법 의미, 샘플 코드
	public static void main(String[] args) {
		
        // 1. replace() : 문자를 다른 문자로 대체해준다. 
	    String str1  = "안녕반가워"; 
		String result1 = str1.replace("반가워","하세요");
		System.out.println(result1); // 안녕하세요
		
		
		// 2. toUpperCase : 소문자를 대문자로 반환시켜준다
		String str2  = "test"; 
		String result2 = str2.toUpperCase();
		System.out.println(result2); // TEST
		
		// 3. indexOf : 해당 문자가 위치한 인덱스를 반환한다.
		String str3 = "안녕하세요 저는 김효린입니다";
		int result3 = str3.indexOf('효');
		System.out.println(result3); // 10
		
	}		

}
