package ch01;

public class ThreadTest2 {

	// 메인 쓰래드
	public static void main(String[] args) {
		// 사용하는 방법 연습
		// 현재 쓰래드가 누구야 알아보는 명령어
		System.out.println("========== Main Thread 시작 =======");

		System.out.println(Thread.currentThread());
		// 작업자 하나 만들어 내기 (메인 쓰레드가 일 함)
		Worker worker1 = new Worker("워커1");
		// 너가 위임 받은 일을 시작해  --> start();
		worker1.start();
		
		// 쓰래드(작업자) 하나 더 생성해보기
		Worker worker2 = new Worker("워커2");
		worker2.start();
		
		System.out.println("========== Main Thread 종료 =======");

	}// end of main

}// end of class


