package com.project.questapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.questapp.model.User;
import com.project.questapp.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}


	@GetMapping("/all")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}


}
