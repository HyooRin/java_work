package ch02;

import java.util.Iterator;

public class MainTest1 {

	public static void main(String[] args) {
		
		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		ToyCar toyCar = new ToyCar();
		
		// 다형성
		RemoteController controller1 = television;
		RemoteController controller2 = refrigerator;
		RemoteController controller3 = toyRobot;
		RemoteController controller4 = toyCar;
		
		// 다형성 + 배열
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = television;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = toyRobot;
		remoteControllers[3] = toyCar;
		
		// 문제1 
		// for 문을 활용해서 전원을 전부 켜 주세요
		for(int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOn(); // 컴파일 시점,(turnOn, turnOff)
		}
		
		// 문제2 
		// 인덱스 값이 3번째 녀석이면 자기자신의 타입을 화면에 출력해주세요
		
		for(int i =0; i < remoteControllers.length; i++) {
			if( i == 3) {
				System.out.println("3번째 인덱스 녀석은 ToyCar 데이터 타입입니다.");
			}
		}
		
		// 문제 3 
		// 만약 데이터 toyRobot 이면 멤버 변수 name 값을 출력해주세요
		for(int i =0; i < remoteControllers.length; i++) {
			if( remoteControllers[i] instanceof ToyRobot) {
				// 업캐스팅 된 상태이기 때문에
				// 자식 타입으로 바라보기 위해서는 다운 캐스팅 개념을 알고 있어야한다.
				System.out.println( ((ToyRobot)remoteControllers[i]).name  );
			}
		}
		
		// 문제 4 
		// 장난감 로봇에 소리 기능을 추가해달라는 요청
		// 냉장고에도 소리나는 기능을 추가해달라는 요청
		// 소리기능 --> 인터페이스로 설계 
		// 냉장고 -> 띠리링
	    // 장난감 --> 두두두 
		((Refrigerator) remoteControllers[1]).soundOn();
		
		
		
		
		
		

		

		

	}// end of main

}// end of class
