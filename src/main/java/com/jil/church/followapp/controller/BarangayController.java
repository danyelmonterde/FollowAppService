package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.Barangays;
import com.jil.church.followapp.service.BarangayService;
import com.jil.church.followapp.serviceimpl.BarangayServiceImpl;

@RestController
public class BarangayController implements BarangayService {

	@Autowired
	private BarangayServiceImpl barangayServiceImpl;

	public BarangayController(BarangayServiceImpl barangayServiceImpl) {
		this.barangayServiceImpl = barangayServiceImpl;
	}

	@Override
	@GetMapping("/getBarangayById/{barangayId}")
	@CrossOrigin(origins = "*")
	public Barangays getBarangayById(@PathVariable("barangayId") String barangayId) {
		return barangayServiceImpl.getBarangayById(barangayId);
	}

}
