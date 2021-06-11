package com.user.RepositoryImpl;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.user.Repository.UserRepo;
import com.user.dto.UserCreateDto;
import com.user.entity.User;

@Repository
public class UserRepoImpl implements UserRepo {

	private static Map<UUID, User> userMap = new HashMap<UUID, User>();

	public User createUser(UserCreateDto userDto) {
		User user = new User();
		user.userId = UUID.randomUUID();
		user.username = userDto.username;
		user.age = userDto.age;
		userMap.put(user.userId, user);
		return user;
	}

	public User getUser(String username) {
		User user = null;
		for (Map.Entry<UUID, User> entry : userMap.entrySet()) {
			if (entry.getValue().username.equals(username)) {
				user = entry.getValue();
				System.out.println("User found with username " + username + " value is " + user);
			}
		}
		return user;
	}
	
	public List<User> getAllUser() {
		List<User> users = new ArrayList<>();
		for (Map.Entry<UUID, User> entry : userMap.entrySet()) {
			users.add(entry.getValue());
		}
		return users;
	}
}
