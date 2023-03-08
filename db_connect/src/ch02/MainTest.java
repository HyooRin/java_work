package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {

	public static void main(String[] args) {
		
		DBClient client = new DBClient();
		Connection conn = client.getConnection();
		try {
			Statement stmt = conn.createStatement();
			// 쿼리문 생성, 실행
			String queryStr = "SELECT * FROM student";
			ResultSet rs = stmt.executeQuery(queryStr);// 결과를 ResultSet 담김
			// 결과를 뽑는 기술
			while(rs.next()) {
				int id = rs.getInt("student_id");
				String name = rs.getString("student_name");
				String grade = rs.getString("grade");
				int schoolId = rs.getInt("school_id");
				System.out.println("id :" + id + "\t");
				System.out.println("name :" + name + "\t");
				System.out.println("grade :" + grade + "\t");
				System.out.println("schoolid :" + schoolId + "\t");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}

	}

}
