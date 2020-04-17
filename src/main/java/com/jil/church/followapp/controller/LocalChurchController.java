package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.LocalChurch;
import com.jil.church.followapp.service.LocalChurchService;
import com.jil.church.followapp.serviceimpl.LocalChurchServiceImpl;

@RestController
public class LocalChurchController implements LocalChurchService{

	@Autowired
	private LocalChurchServiceImpl localChurchServiceImpl;
	
	public LocalChurchController(LocalChurchServiceImpl localChurchServiceImpl) {
		this.localChurchServiceImpl = localChurchServiceImpl;
	}
	@Override
	@GetMapping("/getLocalChurchById/{localChurchId}")
	@CrossOrigin(origins = "*")
	public LocalChurch getLocalChurchById(@PathVariable("localChurchId") String localChurchId) {
		return localChurchServiceImpl.getLocalChurchById(localChurchId);
	}

}
