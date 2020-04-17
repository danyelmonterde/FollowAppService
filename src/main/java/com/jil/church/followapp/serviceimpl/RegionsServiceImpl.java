package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.Regions;
import com.jil.church.followapp.repository.RegionsRepository;
import com.jil.church.followapp.service.RegionsService;

@Service
public class RegionsServiceImpl implements RegionsService{

	@Autowired
	private RegionsRepository regionsRepository;
	
	@Override
	public Regions getRegionById(String regionId) {
		return regionsRepository.findById(regionId).get();
	}

}
