package com.jil.church.followapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.User;
import com.jil.church.followapp.service.ProfileService;
import com.jil.church.followapp.service.UserInterface;

@RestController
public class UserController implements UserInterface{
	
	@Autowired
	private ProfileService profileService;
	
	public UserController(ProfileService profileService) {
		this.profileService = profileService;
	}

	@GetMapping("/getName/{userId}")
	@CrossOrigin(origins = "*")
    public User getNameByUserId(@PathVariable("userId") int userId) {
        return profileService.getFirstName(userId).get();
    }

	@Override
	public List<User> getUserByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByBarangayId(String barangayId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByMunicipalId(String municipalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByProvinceId(String provinceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByRegionId(String regionId) {
		// TODO Auto-generated method stub
		return null;
	}
}
