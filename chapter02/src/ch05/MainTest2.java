package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		// 객체 생성
		Student studentH = new Student("효린", 100_000);
		Bus bus52 = new Bus(52);
		Bus bus31 = new Bus(31);
		Subway subwayLine3 = new Subway(3);

		// 1단계 - 사용해보기
//		studentH.takeBus(bus52);
//		studentH.takeSubway(subwayLine3);
//		studentH.showInfo();
		// 2단계 - 실행의 흐름 만들어보기
		Scanner scanner = new Scanner(System.in);
		String answer;
		String answerBus;
		System.out.println("현재시간 8시 10분지났나요?");
		answer = scanner.nextLine();
		if (answer.equals("yes")) {
			System.out.println("늦었어! 무조건 지하철 타야해");
			System.out.println("---------------------");
			studentH.takeSubway(subwayLine3);
			studentH.showInfo();
			subwayLine3.showInfo();
		} else if (answer.equals("no")) {
			System.out.println("여유로우니 버스타도 돼");
			System.out.println("몇 번 탈래?");
			answerBus = scanner.nextLine();
			if (answerBus.equals("52")) {
				studentH.takeBus(bus52);
				studentH.showInfo();
				bus52.showInfo();
			} else if (answerBus.equals("31")) {
				studentH.takeBus(bus31);
				studentH.showInfo();
				bus31.showInfo();
			} else {
				System.out.println("31번 or 52번만 탈 수 있어");
			}
		} else {
			System.out.println("yes or no 로 대답하세요");
		}

	}// end of main
}// end of class
