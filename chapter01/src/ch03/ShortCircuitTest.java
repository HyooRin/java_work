package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {

		// 관계 논리곱 --> F --> F , 논리합 --T -- T

		int num1 = 5;
		int i = 0;
		// F --> T && T
		boolean value = ((num1 += 10) > 10) && ((i += 2) < 10);
		System.out.println(value);
		System.out.println("======================");
		System.out.println(num1);
		System.out.println(i);

		System.out.println("===================");

		// 25 < 10 ---> F ->T 4 <10 ---> T
		value = ((num1 += 10) > 10) || ((i += 2) < 10);
		System.out.println(value);
		System.out.println(i);

		// 문제

		// 문제 shortCircuit 평가 문제를 직접 2문제 만들어 주세요
		// 그리고 카페 도전과제 -> 실습 및 리뷰에 문제 & 답을 올려 주세요

		// 문제
		int num = 7;
		int e = 1;
		// 문제1 : 결과 값을 구하시오
		boolean value2 = ((num += 7) < 10) && ((e += 3) > 0);
		System.out.println(value2);
		System.out.println(e);
		// 문제2 : 결과 값을 구하시오
		value2 = ((num += 5) > 6) || ((e += 4) >= 5);
		System.out.println(value2);
		System.out.println(e);

		// 풀이
		// 답1
		//boolean value2 = ((num += 7) < 10) && ((e += 3) > 0); // ---> false && true
		//System.out.println(value2); // 결과 false
		//System.out.println(e); // e값은 1 , 첫번째 항에서 false 값이 나왔기 때문에 두번째 항은 실행 안함

		// 답2
		//value2 = ((num += 5) > 6) || ((e += 4) >= 5); // ---> true || true
		//System.out.println(value2); // 결과 true
		//System.out.println(e); // e값은 1, 첫번째 항에서 true 값이 나왔기 때문에 두번째 항은 실행 안함

	}

}
