package com.user.entity;

import java.util.UUID;

public class User {

	public UUID userId;
	public String username;
	public Integer age;
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", age=" + age + "]";
	}
	
}
