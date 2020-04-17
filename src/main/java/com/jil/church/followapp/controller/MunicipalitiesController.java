package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.Municipalities;
import com.jil.church.followapp.service.MunicipalitiesService;
import com.jil.church.followapp.serviceimpl.MunicipalitiesServiceImpl;

@RestController
public class MunicipalitiesController implements MunicipalitiesService {

	@Autowired
	private MunicipalitiesServiceImpl municipalitiesServiceImpl;

	public MunicipalitiesController(MunicipalitiesServiceImpl municipalitiesServiceImpl) {
		this.municipalitiesServiceImpl = municipalitiesServiceImpl;
	}

	@Override
	@GetMapping("/getMunicipalitiesById/{municipalId}")
	@CrossOrigin(origins = "*")
	public Municipalities getMunicipalitiesById(@PathVariable("municipalId") String municipalId) {
		return municipalitiesServiceImpl.getMunicipalitiesById(municipalId);
	}

}
