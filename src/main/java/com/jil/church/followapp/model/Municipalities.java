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
public class Municipalities {

	@Id
	private String municipalId;
	
	private String municipal;
	
	private String provinceId;
}
