package com.supriya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.supriya.model.User;
import com.supriya.request.UserDetails;
import com.supriya.service.IUserService;

import io.swagger.annotations.Api;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
@Api(value = "Get user", tags = "Get All user")
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestBody UserDetails users) {

		return userService.addUser(users);
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping(path = "")
	public @ResponseBody User getUsersByName(@RequestParam String name) {
		return userService.getUsersByName(name);
	}
	
	
	
}