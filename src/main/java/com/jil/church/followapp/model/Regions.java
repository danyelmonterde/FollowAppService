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
public class Regions {

	@Id
	private String regionId;
	
	private String region;
	
	private String description;
}
