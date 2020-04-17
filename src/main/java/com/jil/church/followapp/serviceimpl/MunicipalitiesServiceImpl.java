package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.Municipalities;
import com.jil.church.followapp.repository.MunicipalitiesRepository;
import com.jil.church.followapp.service.MunicipalitiesService;

@Service
public class MunicipalitiesServiceImpl implements MunicipalitiesService {

	@Autowired
	private MunicipalitiesRepository municipalitiesRepository;
	
	@Override
	public Municipalities getMunicipalitiesById(String municipalId) {
		return municipalitiesRepository.findById(municipalId).get();
	}

}
