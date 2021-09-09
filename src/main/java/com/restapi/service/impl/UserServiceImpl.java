package com.restapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.User;
import com.restapi.repo.UserRepository;
import com.restapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> AllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User addUser(User user) {
		User u = userRepository.insert(user);
		return u;
	}

	@Override
	public User updateUser(User user) {
		User u = userRepository.save(user);
		return u;
	}

	@Override
	public User lockUser(User user) {
		User u = userRepository.save(user);
		return u;
	}

	@Override
	public void deleteUser(User user) {
		userRepository.delete(user);
	}

	@Override
	public Optional<User> searchUser(String id) {
		Optional<User> u = userRepository.findById(id);
		return u;
	}

}
