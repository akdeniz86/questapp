package com.project.questapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questapp.model.Post;
import java.util.List;


public interface PostRepository extends JpaRepository<Post, Long> {
	
	List<Post> findByUserId(Long userId);

}
