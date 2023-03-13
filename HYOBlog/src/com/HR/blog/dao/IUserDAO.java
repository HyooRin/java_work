package com.HR.blog.dao;

import com.HR.blog.dto.UserDTO;

public interface IUserDAO {
	
	int saveUser(UserDTO user);
	UserDTO selectUserByUsernameAndPassword(String username, String password);
	

}
