package com.project.questapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.questapp.model.Comment;
import com.project.questapp.model.Post;
import com.project.questapp.model.User;
import com.project.questapp.repository.CommentRepository;
import com.project.questapp.request.CommentCreateRequest;
import com.project.questapp.request.CommentUpdateRequest;

@Service
public class CommentService {
	
	private CommentRepository commentRepository;
	private UserService userService;
	private PostService postService;

	public CommentService(CommentRepository commentRepository,PostService postService,UserService userService) {
		this.commentRepository = commentRepository;
		this.userService=userService;
		this.postService=postService;
	}


	public List<Comment> getAllCommentsWithParam(Optional<Long> userId, Optional<Long> postId) {
		if (userId.isPresent() && postId.isPresent() ) {
			return commentRepository.findByUserIdAndPostId(userId.get(),postId.get());
		}else if (userId.isPresent()) {
			 return commentRepository.findByUserId(userId.get());
		}else if (postId.isPresent()) {
			return commentRepository.findByPostId(postId.get());
		}else
			return commentRepository.findAll();
	}


	public Comment getOneCommentById(Long commentId) {
		return commentRepository.findById(commentId).orElse(null);
	}


	public Comment createOneComment(CommentCreateRequest request) {
		User user = userService.getOneUserById(request.getUserId());
		Post post = postService.getOnePostById(request.getPostId());
		if(user !=null && post != null) {
			Comment commenToSave =new Comment();
			commenToSave.setId(request.getId());
			commenToSave.setPost(post);
			commenToSave.setUser(user);
			commenToSave.setText(request.getText());
			return commentRepository.save(commenToSave);
		}else
		return null;
	}


	public Comment updateOneCommentById(Long commentId, CommentUpdateRequest request ) {
		Optional<Comment> comment =commentRepository.findById(commentId);
		if(comment.isPresent()) {
			Comment commentToUpdate = comment.get();
			commentToUpdate.setText(request.getText());
			return commentRepository.save(commentToUpdate);
		}else
		return null;
	}


	public void deleteOneCommentById(Long commentId) {
		commentRepository.deleteById(commentId);
	}
	

}
