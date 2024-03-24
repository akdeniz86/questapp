package com.project.questapp.service;

import org.springframework.stereotype.Service;

import com.project.questapp.repository.CommentRepository;

@Service
public class CommentService {
	
	private CommentRepository commentRepository;

	public CommentService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}
	
	

}
