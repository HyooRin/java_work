package ex10;

// 다른 패키지에 java 파일이라면 import 해야 사용할 수 있다.
import ch06.Bank;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bank bankA = new Bank();
		// BankA.balance 접근 불가
		// why : 다른 패키지에서 default 접근 제어 지시자
		// 접근할 수 없다.
		bankA.name = "홍길동";
		// name 접근 제어 지시자는 public 이기 때문에 
		// 같은 프로젝트 언어라면 어디서든지 접근 가능하다.
	}
}
