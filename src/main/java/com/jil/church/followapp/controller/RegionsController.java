package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.Regions;
import com.jil.church.followapp.service.RegionsService;
import com.jil.church.followapp.serviceimpl.RegionsServiceImpl;

@RestController
public class RegionsController implements RegionsService {

	@Autowired
	private RegionsServiceImpl regionsServiceImpl;

	public RegionsController(RegionsServiceImpl regionsServiceImpl) {
		this.regionsServiceImpl = regionsServiceImpl;
	}

	@Override
	@GetMapping("/getRegionById/{regionId}")
	@CrossOrigin(origins = "*")
	public Regions getRegionById(@PathVariable("regionId") String regionId) {
		return regionsServiceImpl.getRegionById(regionId);
	}

}
