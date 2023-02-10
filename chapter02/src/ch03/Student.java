package ch03;

public class Student {
	
	int studentid;
	int grade;
	
	// 참조입니다.
	String name;
	// 참조 타입
	Subject korea; 
	Subject math;
		
	//생성자
	public Student(int studentid, int grade, String name) {
		this.studentid = studentid;
		this.grade = grade;
		this.name = name;
		
		this.korea = new Subject();
		this.math = new Subject();
		
	}
	
	// 메서드
	public void showInfo() {
		System.out.println("**상태창**");
		System.out.println(this.name + " 입니다.");
		System.out.println(this.grade + " 학년 입니다.");
		System.out.println(this.studentid + " 번 입니다.");
		System.out.println(this.korea.subjectName + "에 점수는" + this.korea.score);
		System.out.println(this.math.subjectName + "에 점수는" + this.math.score);
		
		
	}

}
