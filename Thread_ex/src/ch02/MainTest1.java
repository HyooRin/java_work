package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		// 현재 잔액 100_000 만원
		BankAccount bankAccount = new BankAccount();

		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);
		
		// 아버지 입금하기 
		father.start(); // 3초 걸림 
		// 어머니 출금
		mother.start();
		
		// 정상 처리 : 10 + 1만원 - 천원 ==> 10만 5천원이여야 <-- 정상동작
		// synchronized 사용
	}

}
