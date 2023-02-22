package ch05;

public class PhoneBook {
	
	String name;
	String phoneNumber;
	
	public PhoneBook(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("*전화번호 정보*");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
	}

}
