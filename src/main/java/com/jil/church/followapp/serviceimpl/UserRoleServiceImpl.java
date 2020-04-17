package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.UserRole;
import com.jil.church.followapp.repository.UserRoleRepository;
import com.jil.church.followapp.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired
	private UserRoleRepository userRoleRepository;
	
	
	@Override
	public UserRole getUserRoleById(int userRoleId) {
		return userRoleRepository.findById(userRoleId).get();
	}

}
