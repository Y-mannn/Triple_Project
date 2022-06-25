package com.triple.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triple.backend.domain.User;
import com.triple.backend.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User findByUserId(String userId) {
		return userRepository.findByUserId(userId);
	}

}
