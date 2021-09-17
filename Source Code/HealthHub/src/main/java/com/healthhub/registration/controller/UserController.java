package com.healthhub.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthhub.registration.entity.User;
import com.healthhub.registration.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/getByEid/{eid}")
	public User getByEid(@PathVariable String eid) {
		return userService.getEId(eid);
	}
	
	@GetMapping("/getByUserId/{userId}")
	public User getByUserId(@PathVariable String userId) {
		return userService.getUserId(userId);
	}	
	
	@PostMapping("/validateUserId")
	public User getByUserId(@RequestBody User user) {
		return userService.getUserIdAndPassword(user.getUserId(),user.getPassword());
	}		
	
	@GetMapping("/all")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	


}
