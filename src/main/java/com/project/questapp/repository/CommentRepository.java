package com.project.questapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questapp.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
