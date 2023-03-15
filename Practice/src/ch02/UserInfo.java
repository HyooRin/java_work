package ch02;

// DTO : Data Transfer Object
public class UserInfo {
	public static int SERIAL_NUMBER = 0;
	private int id;
	private String userName;
	private String pw;
	
	public UserInfo(String userName, String pw) {
		SERIAL_NUMBER++;
		this.id = SERIAL_NUMBER;
		this.userName = userName;
		this.pw = pw;				
	}
	
	

}
