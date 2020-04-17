package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.Areas;
import com.jil.church.followapp.service.AreaService;
import com.jil.church.followapp.serviceimpl.AreaServiceImpl;

@RestController
public class AreasController implements AreaService {

	@Autowired
	private AreaServiceImpl areaServiceImpl;

	public AreasController(AreaServiceImpl areaServiceImpl) {
		this.areaServiceImpl = areaServiceImpl;
	}

	@Override
	@GetMapping("/getAreaById/{areaId}")
	@CrossOrigin(origins = "*")
	public Areas getAreaById(@PathVariable("areaId") int areaId) {
		return areaServiceImpl.getAreaById(areaId);
	}

}
