package ch02;

public class UserInfoMainTest {

//	public static void main(String[] args) {
//		UserInfo userKim = new UserInfo("Rin", "효린", "1234");
//		System.out.println(userKim.userid);
//		System.out.println(userKim.userName);
//		System.out.println(userKim.phone);
//	}
	public static void main(String[] args) {
		// 기본 생성자는 사용자 정의 생성자가 있으면 
		// 만들어 주지 않는다. 
		
		UserInfo userInfo2 = new UserInfo("quetzz","홍길동");
		System.out.println(userInfo2.userName);
		System.out.println(userInfo2.userid);
		System.out.println(userInfo2.phone);
		// UserInfo userInfo = new UserInfo();
	}
	

}
