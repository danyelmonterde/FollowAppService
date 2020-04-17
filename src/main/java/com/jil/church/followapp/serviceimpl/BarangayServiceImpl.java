package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.Barangays;
import com.jil.church.followapp.repository.BarangaysRepository;
import com.jil.church.followapp.service.BarangayService;

@Service
public class BarangayServiceImpl implements BarangayService {

	@Autowired
	private BarangaysRepository barangayRepository;

	@Override
	public Barangays getBarangayById(String barangayId) {
		return barangayRepository.findById(barangayId).get();
	}

}
