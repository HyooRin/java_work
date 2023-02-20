package ch02;

public class Person {
	
	private String name;
	private int age;
	private Address address;
	
	public Person(String name, int age, Address address) {
		//address = new Address("연수로249번길","서울","자이303호","1234-456"); // 1002
		
		// 메인에 있는 거랑 같은 거
		this.name = name;
		this.age = age;
		this.address = address; 
		
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}
	
	

}
