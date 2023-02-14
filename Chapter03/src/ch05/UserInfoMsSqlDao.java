package ch05;

public class UserInfoMsSqlDao implements IUserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL : 저장기능 호출");
		System.out.println("이름 : " + userInfo.getUserName());
		System.out.println("PW: " + userInfo.getpw());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL : 수정기능 호출");
		System.out.println("사용자이름으로 수정기능 호출: " + userInfo.getUserName());
		
		
	}

	@Override
	public void deleteUserInfo(String userName) {
		System.out.println("MSSQL : 삭제기능 호출");
		System.out.println("사용자이름으로 삭제기능 호출: " + userName);
		
		
	}

	@Override
	public void selectUserInfo(String userName) {
		System.out.println("MSSQL : 조회기능 호출");
		
	
		
	}

}
