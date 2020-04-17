package com.jil.church.followapp.service;

import java.util.List;

import com.jil.church.followapp.model.UserAccount;

public interface UserAccountService {

	public UserAccount getUserAccountByUserId(String userId);
	
	public List<UserAccount> getUserAccountByFirstName (String firstName);
	
	public List<UserAccount> getUserAccountByLastName (String lastName);
	
	public List<UserAccount> getUserAccountByBarangayId (String barangayId);
	
	public List<UserAccount> getUserAccountByMunicipalId (String municipalId);
	
	public List<UserAccount> getUserAccountByProvinceId(String provinceId);
	
	public List<UserAccount> getUserAccountByRegionId(String regionId);
}
