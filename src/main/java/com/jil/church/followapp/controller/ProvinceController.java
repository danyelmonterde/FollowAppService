package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.Provinces;
import com.jil.church.followapp.service.ProvinceService;
import com.jil.church.followapp.serviceimpl.ProvinceServiceImpl;

@RestController
public class ProvinceController implements ProvinceService{

	@Autowired
	private ProvinceServiceImpl provinceServiceImpl;
	
	public ProvinceController(ProvinceServiceImpl provinceServiceImpl) {
		this.provinceServiceImpl = provinceServiceImpl;
	}

	@Override
	@GetMapping("/getProvinceById/{provinceId}")
	@CrossOrigin(origins = "*")
	public Provinces getProvinceById(@PathVariable("provinceId") String provinceId) {
		return provinceServiceImpl.getProvinceById(provinceId);
	}
}
