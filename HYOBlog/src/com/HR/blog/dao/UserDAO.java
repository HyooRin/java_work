package com.HR.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.HR.blog.dto.UserDTO;
import com.HR.blog.utils.DBHelper;

public class UserDAO implements IUserDAO {
	
	private DBHelper dbHelper;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	// 사용자 정보를  저장시키는 기능
	@Override
	public int saveUser(UserDTO user) {
		String query = " INSERT INTO user(username, password, email, address) "
				+ " values(?, ?, ?, ?) ";
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getAddress());
			
			resultRow = pstmt.executeUpdate();			
		} catch (SQLException e) {
			System.out.println("saveUser 함수에서 오류발생");
			e.printStackTrace();
		}
		return resultRow;		
	}

	// 사용자 정보를 아이디와 비번값 확인해서 찾는 기능
	@Override
	public UserDTO selectUserByUsernameAndPassword(String username, String password) {
		
		UserDTO resultUser = null;
		
		String query = " SELECT "
				+ " FROM user "
				+ " WHERE username = ? "
				+ "	AND password = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUserName(rs.getString("username"));
				dto.setEmail(rs.getString("email"));
				resultUser = dto;						
			}
		} catch (SQLException e) {
			System.out.println(">> userDAO 회원찾기 에러발생 <<");
			e.printStackTrace();
		}
		return resultUser;
	}

}
