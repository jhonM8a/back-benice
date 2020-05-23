package com.beteam.benice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beteam.benice.model.UserAuthRequest;
import com.beteam.benice.model.UserResponse;

@RestController
@RequestMapping("/benice/v1")
public class User {

	@PostMapping("/user/auth")
	public UserResponse authUser(@RequestBody UserAuthRequest user) {
		UserResponse response = new UserResponse();
		response.setName(user.getUser());
		response.setLocation(user.getPassword()+user.getUser());
		return response;
	}
	
}
