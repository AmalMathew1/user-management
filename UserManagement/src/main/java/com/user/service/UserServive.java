package com.user.service;

import java.util.List;

import com.user.dto.UserCreateDto;
import com.user.entity.User;

public interface UserServive {

	public User createUser(UserCreateDto userDto);
	
	public User getUser(String username);
	
	public List<User> getAllUser();
}
