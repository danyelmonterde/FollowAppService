package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.LocalChurch;
import com.jil.church.followapp.repository.LocalChurchRepository;
import com.jil.church.followapp.service.LocalChurchService;

@Service
public class LocalChurchServiceImpl implements LocalChurchService{

	@Autowired
	private LocalChurchRepository localChurchRepository;
	
	@Override
	public LocalChurch getLocalChurchById(String localChurchId) {
		return localChurchRepository.findById(localChurchId).get();
	}

}
