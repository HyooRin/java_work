package Strings;

public class StringTest3 {

	// 쓰래드 --> 메인작업자
	public static void main(String[] args) {
		//StringBuilder, **StringBuffer 알아보자
		// 문자열을 여러번 연결하거나 변경할 때 유용하다.
		// StringBuffer 는 멀티 쓰레드 프로그래밍에서 동기화를 보장한다.
		// 단일 쓰래드 프로그램에서는 StringBuilder를 권장한다.
		
		String java = new String("java");
		String android = new String("Android");
		System.out.println(java + android);
		//                                               java --> "java" 		
		StringBuilder builder = new StringBuilder(java);
		// 주소값 확인하기
		System.out.println(System.identityHashCode(builder));
		System.out.println("==================================");
		System.out.println( "builder값 : " + builder);
		
		// builder 에 문자열 더하는 기능은 append 이다.
		builder.append(android);
		System.out.println(builder);
		System.out.println("================");
		System.out.println(System.identityHashCode(builder));
		
		// 응용
		// 1. 
		// StringBuilder --> String 형 변환 방식은 toString 활용한다. 
		String result = builder.toString();
		// 2.
		String result2 = builder + ": 반가워";
		
		// 정리
		// String Builder는 문자열을 다룰 때 한번 생성한 문자열을 변경하더라도 
		// 메모리를 새로 생성하지 않는다.
		

	}

}
