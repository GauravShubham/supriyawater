package com.supriya.service;

import com.supriya.model.User;
import com.supriya.request.UserDetails;

public interface IUserService {
	public String addUser(UserDetails users);
	public Iterable<User> getAllUsers();
	public User getUsersByName(String name);
}
