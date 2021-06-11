package com.user.Repository;

import java.util.List;

import com.user.dto.UserCreateDto;
import com.user.entity.User;

public interface UserRepo {
	
	public User createUser(UserCreateDto userDto);
	
	public User getUser(String username);
	
	public List<User> getAllUser();

}
