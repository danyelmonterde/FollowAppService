package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.ChurchProfile;
import com.jil.church.followapp.service.ChurchProfileService;
import com.jil.church.followapp.serviceimpl.ChurchProfileServiceImpl;

@RestController
public class ChurchProfileController implements ChurchProfileService {

	@Autowired
	private ChurchProfileServiceImpl churchProfileServiceImpl;

	public ChurchProfileController(ChurchProfileServiceImpl churchProfileServiceImpl) {
		this.churchProfileServiceImpl = churchProfileServiceImpl;
	}

	@Override
	@GetMapping("/getChurchProfileById/{cpId}")
	@CrossOrigin(origins = "*")
	public ChurchProfile getChurchProfileById(@PathVariable("cpId") String cpId) {
		return churchProfileServiceImpl.getChurchProfileById(cpId);
	}

}
