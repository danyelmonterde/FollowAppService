package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.Areas;
import com.jil.church.followapp.repository.AreasRepository;
import com.jil.church.followapp.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreasRepository areaRepository;
	
	@Override
	public Areas getAreaById(int areaId) {
		return areaRepository.findById(areaId).get();
	}

}
