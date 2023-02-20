package ch02;

public class Main {

	public static void main(String[] args) {
		

		Address address = new Address("해운대구","부산","삼익", "1302");
	    Person person = new Person("홍길동", 0, address);
	    
	    System.out.println("name : " + person.getName());
	    System.out.println("name : " + person.getAddress().toString() );
	    // Person 클래스에서 Address를 참조할 수 있다.
	    // Address는 Person 클래스를 참조할 수 없다 . 
		
	}// end of main

}// end of class
