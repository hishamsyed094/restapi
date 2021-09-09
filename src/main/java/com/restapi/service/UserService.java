package com.restapi.service;

import java.util.List;
import java.util.Optional;

import com.restapi.model.User;

public interface UserService {
	User addUser(User user);
	User updateUser(User user);
	User lockUser(User user);
	void deleteUser(User user);
	Optional<User> searchUser(String id);
	List<User> AllUsers();
}
