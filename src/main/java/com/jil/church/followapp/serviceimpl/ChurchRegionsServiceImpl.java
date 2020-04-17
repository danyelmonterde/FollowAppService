package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.ChurchRegions;
import com.jil.church.followapp.repository.ChurchRegionsRepository;
import com.jil.church.followapp.service.ChurchRegionsService;

@Service
public class ChurchRegionsServiceImpl implements ChurchRegionsService {

	@Autowired
	private ChurchRegionsRepository churchRegionsRepository;

	@Override
	public ChurchRegions getChurchRegionById(String cRegionId) {
		return churchRegionsRepository.findById(cRegionId).get();
	}

}
