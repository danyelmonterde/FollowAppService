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
public class UserRole {

	@Id
	private int userRoleId;

	private String role;

	private boolean canCreate;

	private boolean canUpdate;

	private boolean canDelete;

	private boolean canView;

}
