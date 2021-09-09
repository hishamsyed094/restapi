package com.restapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.User;
import com.restapi.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome!!.";
	}

	@PostMapping("/add")
	public User addUser(User user) {
		return userService.addUser(user);
	}

	@PostMapping("/update")
	public User updateUser(User user) {
		return userService.updateUser(user);
	}

	@PostMapping("/lock")
	public User lockUser(User user) {
		return userService.lockUser(user);
	}

	@PostMapping("/delete")
	public void deleteUser(User user) {
		userService.deleteUser(user);
	}

	@PostMapping("/search")
	public Optional<User> searchUser(@RequestParam(required = true) String id) {
		return userService.searchUser(id);
	}
}
