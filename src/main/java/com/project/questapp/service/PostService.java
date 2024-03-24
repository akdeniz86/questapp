package com.project.questapp.service;

import org.springframework.stereotype.Service;

import com.project.questapp.repository.PostRepository;

@Service
public class PostService {

	private PostRepository postRepository;

	public PostService(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
}
