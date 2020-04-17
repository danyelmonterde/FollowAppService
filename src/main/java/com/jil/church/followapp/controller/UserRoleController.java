package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.UserRole;
import com.jil.church.followapp.service.UserRoleService;
import com.jil.church.followapp.serviceimpl.UserRoleServiceImpl;

@RestController
public class UserRoleController implements UserRoleService {

	@Autowired
	private UserRoleServiceImpl userRoleServiceImpl;

	public UserRoleController(UserRoleServiceImpl userRoleServiceImpl) {
		this.userRoleServiceImpl = userRoleServiceImpl;
	}

	@Override
	@GetMapping("/getUserRoleById/{userRoleId}")
	@CrossOrigin(origins = "*")
	public UserRole getUserRoleById(@PathVariable("userRoleId") int userRoleId) {
		return userRoleServiceImpl.getUserRoleById(userRoleId);
	}

}
