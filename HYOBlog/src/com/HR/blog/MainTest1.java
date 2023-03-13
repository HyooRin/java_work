package com.HR.blog;

import com.HR.blog.controller.UserController;
import com.HR.blog.dto.UserDTO;

public class MainTest1 {

	public static void main(String[] args) {
		
		UserDTO userDTO = new UserDTO("김효린", "0929", "khl4459@naver.com", "부산");
		UserController userController = new UserController();
//		String result = userController.requestSignUp(userDTO, "localhost");
//		System.out.println(result);
		
		// 로그인 요청 
		// 아이디 비밀번호
		UserDTO responseUser = userController.requestSignIn(userDTO.getUserName(), userDTO.getEmail());
		if(responseUser == null ) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
		System.out.println("결과값 확인" + responseUser);
		

		
		
	}

}
