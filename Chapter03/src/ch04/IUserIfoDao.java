package ch04;

public interface IUserIfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(String userName);
	void selectUserInfo(String userName);

}
