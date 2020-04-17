package com.jil.church.followapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserAccount {

	@Id
	private String userId;

	private String username;

	private String password;

	private int userroleId;

	private String email;

	private String cpId;

	private String ppId;

	private String localChurchId;

	private int chapterId;

	private Date dateCreated;

	private String createdBy;

	private String timestamp;

	private String verificationStatus;

	private boolean isSubscribed;

	private String uploadedPhoto;

	private boolean pushNotification;

	private String emailVerificationStatus;

	private String otpVerificationStatus;


}
