package ch02;

public class UserInfo {
	
	String userid;
	String userName;
	String phone;
	
	// 1
	// 사용자 정의 생성자를 만들어 주세요 매개변수 3개 한번에 사용
//	public UserInfo(String i, String n, String p) {
//		userid = i;
//		userName = n;
//		phone = p;
//	}
	public UserInfo(String userid, String userName, String phone) {
		// 멤버 변수 = 매개 변수(지역 변수)
		this.userid =userid;
		this.userName =userName;
		this.phone =phone;
  }
	
	// 2
	//사용자 정의 생성자 만들기 userid; userName;
//	public UserInfo(String i, String n) {
//		userid = i;
//		userName = n;
//	}
	public UserInfo(String userid, String userName) {
		this.userid = userid;
		this.userName = userName;
		// 필요하다면 외부에서 주입 받지 않고
		// 바로 초기화 가능 하다.
		this.phone = "010";
	}
	
	// 3 
	// 사용자 정의 생성자 만들기 userid;
	public UserInfo(String i) {
		userid = i;
	}
	
	//4
	// 기본 생성자를 만들어 주세요 
	public UserInfo() {
		
	}

}
