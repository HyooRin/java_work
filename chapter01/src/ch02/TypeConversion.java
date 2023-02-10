package ch02;
/**
 * 여러줄 주석
 * @author 김효린
 *
 */
public class TypeConversion {
   
	//메인함수 <- 한 줄 주석
	public static void main(String[] args) {
		// 형 변환
		//자동 형 변환
		//강제 형 변환
		int iNumber1 = 100;
		System.out.println(iNumber1);
		
		//자동 형 변환 
		double dNumber1 = iNumber1;
		System.out.println(dNumber1); // 형 이 변환되었기 때문에 자신에 맞는 형태로 출력됨 
		
		//문제 만들어보기 !
		//쌍따옴표 - 문자열이라고 한다.()
		System.out.println("============================================");
		double dNumber2 = 0.0012345;
		System.out.println(dNumber2);
		// 강제 형 변환
		// 강제 형 변환의 주의점
		int iNumber2 = (int)dNumber2; // 개발자가 컴파일러한테 괜찮으니까 강제로 넣어!
		System.out.println(iNumber2); 
		
		int iNumber3 = (int)10.95; //강제 형 변환시 소수점 단위는 그냥 버려 버림!!
		System.out.println(iNumber3);
		
		double a;
		int b;
		
		// 1. a에 값 0.5를 담아보세요
		a = 0.5;
		// 2. b에 값 10.5 리터럴 값을 담아보세요
		b = (int)10.5;
		// 강제 형 변환시 데이터 손실이 생길 수 있다. 
		System.out.println(b);
	

	}//end of main

}//end of class
