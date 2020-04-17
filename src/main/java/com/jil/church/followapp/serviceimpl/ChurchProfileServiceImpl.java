package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.ChurchProfile;
import com.jil.church.followapp.repository.ChurchProfileRepository;
import com.jil.church.followapp.service.ChurchProfileService;

@Service
public class ChurchProfileServiceImpl implements ChurchProfileService {

	@Autowired
	private ChurchProfileRepository churchProfileRepository;

	@Override
	public ChurchProfile getChurchProfileById(String cpId) {
		return churchProfileRepository.findById(cpId).get();
	}
	
	
}
