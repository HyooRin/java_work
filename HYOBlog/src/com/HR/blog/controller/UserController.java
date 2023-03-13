package com.HR.blog.controller;

import com.HR.blog.dto.UserDTO;
import com.HR.blog.service.UserService;

public class UserController {
	
	// 외부에서 요청한 일을 수행하고 결과를 리턴한다.
	private UserService userService;
	
	public UserController() {
		userService = new UserService();		
	}
	
	// 사용자 정보를 받아 회원가입 처리를 한다.
	public String requestSignUp(UserDTO user, String host ) {
		String response = "외부에서는 회원가입이 안됩니다";
		if(host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}
	
	public UserDTO requestSignIn(String username, String password) {
		
		UserDTO responseUserDto = userService.checkUser(username, password);
		
		return responseUserDto;
		
	}	

}
