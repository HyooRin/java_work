package ex13;

import java.util.Random;


public class MainTest {

	public static void main(String[] args) {
		
		// 1.
		// 우리반 학생 이름을 배열에 담아주세요 
		// 랜덤 클래스를 사용해서 
		// 한명을 호출해주세요 ~
		
		//Student[] students = new Student[7];

//		students[0] = new Student("효린");
//		students[1] =  new Student("민우");
//		students[2] =  new Student("다운");
//		students[3] =  new Student("미정");
//		students[4] =  new Student("지운");
//		students[5] =  new Student("주이");
//		students[6] =  new Student("범진");
		
		String[] students = new String[12]; 
		students[0] = "편용림"; 
		students[1] =  "김효린";
		students[2] =  "진석";
		students[3] = "강민정";
		students[4] =  "한범진";
		students[5] = "손주이";
		students[6] = "김유주";
		students[7] = "김미정";
		students[8] = "김지현";
		students[9] = "박성희";
		students[10] = "이지운";
		students[11] = "정다운";
		
				
		Random random = new Random();
		int randomNumber = random.nextInt(12);
		System.out.println(randomNumber);
		System.out.println(students[randomNumber]);
		

	
	// 2 
    int[] myNumbers = new int[10];
    myNumbers[0]  = 10; 
    myNumbers[1]  = 4; 
    myNumbers[2]  = 100; 
    myNumbers[3]  = 23; 
    myNumbers[4]  = 51; 
    myNumbers[4]  = 1; 
    myNumbers[6]  = 6; 
    myNumbers[7]  = 88; 
    myNumbers[8]  = 42; 
    myNumbers[9]  = 31; 

    // 오름 차순으로 정렬 해주세요 
    // for , if 문 활용
	}
}
