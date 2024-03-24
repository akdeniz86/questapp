package com.project.questapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.questapp.model.User;
import com.project.questapp.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
				
	}
	
	
}
