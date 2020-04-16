package com.jil.church.followapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.User;
import com.jil.church.followapp.repository.UserRepository;

@Service
public class ProfileService {

	@Autowired
	private UserRepository userRepository;
	
	public Optional<User> getFirstName(int id) {
		return userRepository.findById(id);
	}
}
