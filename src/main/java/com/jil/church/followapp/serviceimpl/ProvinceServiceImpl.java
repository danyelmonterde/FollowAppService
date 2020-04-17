package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.Provinces;
import com.jil.church.followapp.repository.ProvinceRepository;
import com.jil.church.followapp.service.ProvinceService;

@Service
public class ProvinceServiceImpl implements ProvinceService{

	@Autowired
	private ProvinceRepository provinceRepository;
	
	@Override
	public Provinces getProvinceById(String provinceId) {
		return provinceRepository.findById(provinceId).get();
	}

}
