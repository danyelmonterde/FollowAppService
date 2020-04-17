package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.ChurchRegions;
import com.jil.church.followapp.service.ChurchRegionsService;
import com.jil.church.followapp.serviceimpl.ChurchRegionsServiceImpl;

@RestController
public class ChurchRegionsController implements ChurchRegionsService {

	@Autowired
	private ChurchRegionsServiceImpl churchRegionsServiceImpl;

	public ChurchRegionsController(ChurchRegionsServiceImpl churchRegionsServiceImpl) {
		this.churchRegionsServiceImpl = churchRegionsServiceImpl;
	}

	@Override
	@GetMapping("/getChurchRegionById/{cRegionId}")
	@CrossOrigin(origins = "*")
	public ChurchRegions getChurchRegionById(@PathVariable("cRegionId") String cRegionId) {
		return churchRegionsServiceImpl.getChurchRegionById(cRegionId);
	}

}
