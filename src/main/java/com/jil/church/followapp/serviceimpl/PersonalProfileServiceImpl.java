package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.PersonalProfile;
import com.jil.church.followapp.repository.PersonalProfileRepository;
import com.jil.church.followapp.service.PersonalProfileService;

@Service
public class PersonalProfileServiceImpl implements PersonalProfileService{
	
	@Autowired
	private PersonalProfileRepository personalProfileRepository;

	@Override
	public PersonalProfile getPersonalProfileById(String ppId) {
		return personalProfileRepository.findById(ppId).get();
	}

}
