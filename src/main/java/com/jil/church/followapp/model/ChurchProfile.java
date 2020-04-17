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
public class ChurchProfile {

	@Id
	private String cpId;

	private Date spiritualBirthday;

	private boolean isFirstTimer;

	private boolean isChurchLifegroupAttendee;

	private boolean isCommunityLifegroupAttendee;

	private boolean SOL1;

	private boolean SOL2;

	private boolean SOL3;

	private boolean PRE;

	private boolean ENC;

	private boolean POST;

	private boolean DBBS;

	private boolean STEPS5;

	private boolean isWaterBaptized;

	private boolean isPastor;

	private boolean isLeader;

	private boolean isWorker;

	private String ministry1;

	private String ministry2;

	private String ministry3;

	private String favoriteBibleVerse;

	private String seminarsAttended;

	private String others;
}
