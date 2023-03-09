package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 코드 실행 
		DBClient dbClient = new DBClient();
		DBClient.setDB_NAME("shopdb"); //Static 이라서 클래스로 접근
		//dbClient.setDB_NAME("shopdb");
		// mydb;
		
		// DB 접근 구현 코드 처리 
		// 자료 구조 선언, 담을 데이터 클래스로 모델링
		
		Connection conn = dbClient.getConnection();
		try {
			Statement stmt = conn.createStatement();
			String queryStr = "SELECT * FROM travel";
			ResultSet rs = stmt.executeQuery(queryStr);
			
			while(rs.next()) {

				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		
		

	}

}// end of main

class Travel{
	private int person_id;
	private int city_id;
	private int trip_date;
}










