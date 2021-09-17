package com.healthhub.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthhub.registration.entity.User;
import com.healthhub.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public User getEId(String eid) {
		return userRepository.findByEid(eid);
	}

	public User getUserId(String userId) {
		return userRepository.findByUserId(userId);
	}
	
	public User getUserIdAndPassword(String userId, String password) {
		return userRepository.findByUserIdAndPassword(userId,password);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
