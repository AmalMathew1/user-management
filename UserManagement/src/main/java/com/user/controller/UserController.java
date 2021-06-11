package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.UserCreateDto;
import com.user.entity.User;
import com.user.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@PostMapping
	public User createUser(@RequestBody UserCreateDto userDto) {
		System.out.println("User created request " + userDto);
		User user = userServiceImpl.createUser(userDto);
		return user;
	}
	
	@GetMapping()
	public User getUser(@RequestParam String username) {
		System.out.println("Get user by username " + username + " request");
		User user = userServiceImpl.getUser(username);
		return user;
	}
	
	@GetMapping("/")
	public List<User> getAllUser() {
		System.out.println("Get All users");
		List<User> users = userServiceImpl.getAllUser();
		return users;
	}

}
