package com.project.questapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questapp.model.Like;

public interface LikeRepository extends JpaRepository<Like, Long>{

}
