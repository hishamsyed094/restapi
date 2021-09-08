package com.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.User;
import com.restapi.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User addUser(User user) {
		User u = userRepository.insert(user);
		return u;
	}

}
