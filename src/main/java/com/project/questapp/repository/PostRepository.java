package com.project.questapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questapp.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
