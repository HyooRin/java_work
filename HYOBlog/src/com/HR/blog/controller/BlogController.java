package com.HR.blog.controller;

import com.HR.blog.service.BlogService;

public class BlogController {
	
	private BlogService blogService;
	
	public BlogController() {
		blogService = new BlogService();		
	}
	
	// 블로그 글쓰기 기능 요청 
	public int reqSaveBoard(String title, String content, int userId) {
		// 방어적 코드
		if(userId != 0) {
			return blogService.saveBoard(title, content, userId);			
		}
		return 0;
	}
	
	// 게시글 삭제 요청받기 
	public void requestBoardDelete(int boardId, int userId) {
		blogService.deleteBoard(boardId, userId);
	}

}
