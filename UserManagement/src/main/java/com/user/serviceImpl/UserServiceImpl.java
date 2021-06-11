package com.user.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.RepositoryImpl.UserRepoImpl;
import com.user.dto.UserCreateDto;
import com.user.entity.User;
import com.user.service.UserServive;

@Service
public class UserServiceImpl implements UserServive{
	
	@Autowired
    private UserRepoImpl userRepoImpl;

	public User createUser(UserCreateDto userDto) {
		
		return userRepoImpl.createUser(userDto);
	}
	
	public User getUser(String username) {
		User user = userRepoImpl.getUser(username);
		if(user == null) {
			System.out.println("User not found with username " + username);
		}
		return user;
	}
	
	public List<User> getAllUser() {
		List<User> users = userRepoImpl.getAllUser();
		if(users == null || users.isEmpty()) {
			System.out.println("No Users found");
		} else {
			System.out.println("Number of Users found are "+users.size());
		}
		return users;
	}
}
