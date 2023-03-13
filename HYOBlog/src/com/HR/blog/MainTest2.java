package com.HR.blog;

import com.HR.blog.controller.BlogController;
import com.HR.blog.controller.UserController;
import com.HR.blog.dto.UserDTO;

public class MainTest2 {

	public static void main(String[] args) {
		
		UserController userController = new UserController();
		
		// 로그인 성공
		UserDTO loginUser = userController.requestSignIn("티모", "5678");
		System.out.println("userId :" + loginUser.getId());
		
		BlogController blogController = new BlogController();
		
		if(loginUser.getId() != 0) {
			int response = blogController.reqSaveBoard("자바자바", "어렵다", 4);
			if(response == 0 ) {
				System.out.println("글쓰기 실패");
			}else {
				System.out.println("글쓰기 성공");
			}
		}
		
		

	}// end of main

}// end of class
