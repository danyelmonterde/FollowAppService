package com.jil.church.followapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.UserAccount;
import com.jil.church.followapp.service.UserAccountService;
import com.jil.church.followapp.serviceimpl.UserAccountServiceImpl;

@RestController
public class UserAccountController implements UserAccountService{
	
	@Autowired
	private UserAccountServiceImpl userAccountServiceImpl;
	
	public UserAccountController(UserAccountServiceImpl userAccountServiceImpl) {
		this.userAccountServiceImpl = userAccountServiceImpl;
	}

	@GetMapping("/getName/{userId}")
	@CrossOrigin(origins = "*")
	@Override
    public UserAccount getUserAccountByUserId(@PathVariable("userId") String userId) {
        return userAccountServiceImpl.getUserAccountByUserId(userId);
    }

	@Override
	public List<UserAccount> getUserAccountByFirstName(String firstName) {
		return null;
	}

	@Override
	public List<UserAccount> getUserAccountByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> getUserAccountByBarangayId(String barangayId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> getUserAccountByMunicipalId(String municipalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> getUserAccountByProvinceId(String provinceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> getUserAccountByRegionId(String regionId) {
		// TODO Auto-generated method stub
		return null;
	}
}
