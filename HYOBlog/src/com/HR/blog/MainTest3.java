package com.HR.blog;

import com.HR.blog.controller.BlogController;
import com.HR.blog.controller.UserController;
import com.HR.blog.dto.UserDTO;

public class MainTest3 {
	
	public static void main(String[] args) {
		
		// 사용자 여부 확인
		UserController userController = new UserController();
		BlogController blogController = new BlogController();
		
		UserDTO loginUser = userController.requestSignIn("김", "1212");
		System.out.println(loginUser);
		
		blogController.requestBoardDelete(4, loginUser.getId());
		
	}// end of main

}
