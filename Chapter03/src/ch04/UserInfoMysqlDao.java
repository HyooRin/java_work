package ch04;

public class UserInfoMysqlDao implements IUserIfoDao{

	// DB 연결은 코드 작성 (이름, pw)
	// 질의성 생성
	// 결과 집합
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL : 저장기능 호출");
		System.out.println("이름 : " + userInfo.getUserName());
		System.out.println("PW: " + userInfo.getpw());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL : 수정기능 호출");
		System.out.println("이름 : " + userInfo.getUserName());
		System.out.println("PW: " + userInfo.getpw());
		
	}

	@Override
	public void deleteUserInfo(String userName) {
		System.out.println("MYSQL : 삭제기능 호출");
		System.out.println("이름 : " + userName);
		
		
	}

	@Override
	public void selectUserInfo(String userName) {
		System.out.println("MYSQL : 조회기능 호출");
		System.out.println("이름 : " + userName);
	
		
	}
	// DAO --> 
	// 앞 단에 던져준 데이터를 가지고 -- DB에 값을 밀어넣는 기능을 만듦
	

}
