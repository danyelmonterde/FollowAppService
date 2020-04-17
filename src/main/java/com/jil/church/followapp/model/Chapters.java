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
public class Chapters {

	@Id
	private int chapterId;

	private String chapter;

	private int areaId;
}
