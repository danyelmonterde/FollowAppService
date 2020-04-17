package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.PersonalProfile;
import com.jil.church.followapp.service.PersonalProfileService;
import com.jil.church.followapp.serviceimpl.PersonalProfileServiceImpl;

@RestController
public class PersonalProfileController implements PersonalProfileService{

	@Autowired
	private PersonalProfileServiceImpl personalProfileServiceImpl;
	
	public PersonalProfileController(PersonalProfileServiceImpl personalProfileServiceImpl) {
		this.personalProfileServiceImpl = personalProfileServiceImpl;
	}
	
	@Override
	@GetMapping("/getPersonalProfileById/{ppId}")
	@CrossOrigin(origins = "*")
	public PersonalProfile getPersonalProfileById(@PathVariable("ppId") String ppId) {
		return personalProfileServiceImpl.getPersonalProfileById(ppId);
	}

}
