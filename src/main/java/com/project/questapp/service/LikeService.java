package com.project.questapp.service;

import org.springframework.stereotype.Service;

import com.project.questapp.repository.LikeRepository;

@Service
public class LikeService {
	
	private LikeRepository likeRepository;

	public LikeService(LikeRepository likeRepository) {
		this.likeRepository = likeRepository;
	}
	

}
