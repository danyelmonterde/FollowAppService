package com.jil.church.followapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PersonalProfile {

	@Id
	private String ppId;
	
	private String firstName;
	
	private String lastName;
	
	private String middleName;
	
	private String nickName;
	
	private String suffix;
	
	private int age;
	
	private char gender;
	
	private String occupation;
	
	private String contactNo1;
	
	private String contactNo2;
	
	private String barangayId;
	
	private String municipalId;
}
