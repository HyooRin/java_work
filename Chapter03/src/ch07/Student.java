package ch07;

public class Student {
	
	// 학번과 이름을 정의
	// 생성자 
	private int studentNumber;
	private String name;
	
	public Student(int studentNumber, String name) {
		this.studentNumber = studentNumber;
		this.name = name;
	}
	
	// 1
	// toString --> 학번, 이름이 화면에 출력할 수 있도록 설계 
	@Override
	public String toString() {
		return "학번 : " + this.studentNumber + "이름 : " +this.name;
	}

	// 2
	//equals 메서드를 재정의 해주세요!!
	// 이름이 같다면 동명이인 입니다라고 출력해주세요 !
	
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Student) {
			Student targetName = (Student)obj;
			if( this.name == targetName.name ) {
				System.out.println("동명이인입니다");
				return true; 
			}
		}
		return false;
	}
	
	// 3
	// 해쉬코드 메서드도 호출해보세요
	
}
