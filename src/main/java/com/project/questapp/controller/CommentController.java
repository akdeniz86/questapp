package com.project.questapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.questapp.service.CommentService;



@RestController
@RequestMapping("/comment")
public class CommentController {
	private CommentService commentService;

	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}
	



	

}
