package ch08;

public class EmployeeMainTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setName("이순신");
		System.out.println(employee1.serialNum);
		
		Employee employee2 = new Employee();
		employee2.setName("홍길동");
		
		Employee employee3 = new Employee();
		employee3.setName("티모");
		
		
		// static 변수만 사용을 하면
		// 각각의 객체가 가지는 상태값을 저장해야한다면
		// 멤버변수를 활용해서 사용해야 한다.
		System.out.println(Employee.serialNum);
		System.out.println("--------------------");
		// 홍길동 사원번호 확인 가능
		System.out.println(employee2.getEmployeeid());
		// 티모 사원번호 확인 가능
		System.out.println(employee3.getEmployeeid());

	}

}
