package ch01;

public class Student {
	
	// 상태(속성) (멤버 변수)
	int studentid;
	String studentName;
	String address;
	double height; // 0.0
	boolean isMarred; // false
	
	// 기능 
	
	// 공부한다.
	public void study() {
		System.out.println(studentName +  "학생이 공부를 합니다.");
	}
	
	// 휴식한다. 
	public void breakTime() {
		System.out.println(studentName + "학생이 휴식을 합니다.");
	}
	
	public void showInfo() {
		System.out.println("======상태창=======");
		System.out.println("학생의 ID값은 " + studentid);
		System.out.println("학생의 이름은 " + studentName);
		System.out.println("학생의 주소는 " + address);
		System.out.println("==================");
	}
	
	// 함수와 메서드의 차이점 
	// 메서드란 
	// 자바에서 메서드란 객체의 기능을 구현하기 위해서 클래스 내부에 구현되는 메서드
	// 멤버 함수 (member function)
	// 결론 : 메서드는 자신에 변수를 활용해서 객체의 기능을 구현하는 것
	
	// 학생의 기능(메서드) 3가지 정의해 주세요 
	
	public void exam() {
		System.out.println(studentName + "학생이 시험을 칩니다.");		
	}
	public void gotoSchool() {
		System.out.println(studentName + "학생이 학교를 갑니다.");		
	}
	

}// end of class
