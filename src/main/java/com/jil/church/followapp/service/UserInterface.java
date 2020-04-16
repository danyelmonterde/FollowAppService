package com.jil.church.followapp.service;

import java.util.List;

import com.jil.church.followapp.model.User;

public interface UserInterface {

	public User getNameByUserId(int userId);
	
	public List<User> getUserByFirstName (String firstName);
	
	public List<User> getUserByLastName (String lastName);
	
	public List<User> getUserByBarangayId (String barangayId);
	
	public List<User> getUserByMunicipalId (String municipalId);
	
	public List<User> getUserByProvinceId(String provinceId);
	
	public List<User> getUserByRegionId(String regionId);
}
