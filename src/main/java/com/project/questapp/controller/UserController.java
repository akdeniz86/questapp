package com.project.questapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.questapp.model.User;
import com.project.questapp.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	//Read
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	//1 Read
	@GetMapping("/{userId}")
	public User getOneUser(@PathVariable Long userId) {
		return userService.getOneUserById(userId);		
	}
	
	//Create
	@PostMapping
	public User createUser(@RequestBody User newUser) {
		return userService.saveOneUser(newUser);
	}
	
	//Update
	@PutMapping("/{userId}")
	public User updateOneUser (@PathVariable Long userId, @RequestBody User newUser) {
		return userService.updateOneUser(userId,newUser);
	}
	
	//Delete
	@DeleteMapping("/{userId}")
	public void deleteOneUser(@PathVariable Long userId) {
		userService.deleteOneUser(userId);
	}


}
