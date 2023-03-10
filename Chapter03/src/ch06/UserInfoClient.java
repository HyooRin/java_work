package ch06;

import java.util.Scanner;


public class UserInfoClient {
	
	static String dbName = "ORACLESQL";

	// main --> 실행하는 코드 작성 ( 사용 쪽 코드)
	public static void main(String[] args) {
	
		// UserInfoOracleDao 만들어 주세요
		// 스캐너를 통해서 사용자 이름 사용자 비번 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자 이름 입력");
		String inputUserName = scanner.next();
		System.out.println("사용자 비번 입력");
		String inputUserpw = scanner.next();
		
		
				
		// 흐름 만들기
		// 1 .저장기능 2. 수정기능 
		// dbName 변경해 가면서 코드 동작 확인해주세요
		
		UserInfo userInfo = new UserInfo(inputUserName, inputUserpw);
		
		IUserInfoDao dao;
		if(UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		}else if(UserInfoClient.dbName.equals("MSSQL")){
			dao = new UserInfoMsSqlDao();	
		}else {
			dao = new UserInfoOracleDao();
		}
		
		dao.insertUserInfo(userInfo);
		dao.updateUserInfo(userInfo);
		

	}

}
