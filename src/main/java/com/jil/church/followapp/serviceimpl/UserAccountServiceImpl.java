package com.jil.church.followapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.UserAccount;
import com.jil.church.followapp.repository.UserAccountRepository;
import com.jil.church.followapp.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService{

	@Autowired
	private UserAccountRepository userRepository;
	
	public UserAccount getUserAccountByUserId(String userId) {
		return userRepository.findById(userId).get();
	}

	@Override
	public List<UserAccount> getUserAccountByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> getUserAccountByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> getUserAccountByBarangayId(String barangayId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> getUserAccountByMunicipalId(String municipalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> getUserAccountByProvinceId(String provinceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> getUserAccountByRegionId(String regionId) {
		// TODO Auto-generated method stub
		return null;
	}
}
