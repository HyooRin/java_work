package ch07;

public class MainTest3 {

	public static void main(String[] args) {
		Student student1 = new Student(1, "김"); 
		Student student2 = new Student(2, "효린"); 
		Student student3 = new Student(3, "효린"); 
		Student student4 = new Student(4, "린"); 
		
		System.out.println(student1);
		
		// 자식 객체에 존재하는 각각의 equlas 메서드 호출이다. 
		student1.equals(student2);
		Boolean result1 = student1 == student2;
		System.out.println("result1 : " + result1);
		
		if( student2.equals(student3)) {
			System.out.println("동명이인");
		}else {
			System.out.println("다른 이름");
		}

	}

}
