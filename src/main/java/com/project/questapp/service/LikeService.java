package com.project.questapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.questapp.model.Like;
import com.project.questapp.repository.LikeRepository;
import com.project.questapp.request.LikeCreateRequest;

@Service
public class LikeService {
	
	private LikeRepository likeRepository;
	private UserService userService;
	private PostService postService;

	public LikeService(LikeRepository likeRepository, UserService userService, 
			PostService postService) {
		this.likeRepository = likeRepository;
		this.userService = userService;
		this.postService = postService;
	}

	public List<Like> getAllLikesWithParam(Optional<Long> postId, Optional<Long> userId) {
		
		List<Like> list;
		if (userId.isPresent() && postId.isPresent() ) {
			list = likeRepository.findByUserIdAndPostId(userId.get(), postId.get());
		}else if (userId.isPresent()) {
			list = likeRepository.findByUserId(userId.get());
		}else if (postId.isPresent()) {
			list = likeRepository.findByPostId(postId.get());
		}else
			list = likeRepository.findAll();
			return likeRepository.findAll();
	}
	

	public Like createOneLike(LikeCreateRequest request) {

		return null;
	}

	public Like getOneLikeById(Long likeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteOneLikeById(Long likeId) {
		// TODO Auto-generated method stub
		
	}

	
	

}
