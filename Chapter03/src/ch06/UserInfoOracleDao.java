package ch06;

public class UserInfoOracleDao implements IUserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("ORACLESQL : 저장기능 호출");
		System.out.println("이름 : " + userInfo.getUserName());
		System.out.println("PW: " + userInfo.getpw());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("ORACLESQL : 수정기능 호출");
		System.out.println("이름 : " + userInfo.getUserName());
		System.out.println("PW: " + userInfo.getpw());
		
	}

	@Override
	public void deleteUserInfo(String userName) {
		System.out.println("ORACLESQL : 삭제기능 호출");
		System.out.println("이름 : " + userName);
		
		
	}

	@Override
	public void selectUserInfo(String userName) {
		System.out.println("ORACLESQL : 조회기능 호출");
		System.out.println("이름 : " + userName);
	
		
	}

}
