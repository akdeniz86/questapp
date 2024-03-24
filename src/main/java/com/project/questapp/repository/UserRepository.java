package com.project.questapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
