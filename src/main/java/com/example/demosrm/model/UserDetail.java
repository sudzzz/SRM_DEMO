package com.example.demosrm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "USER_DETAIL")
public class UserDetail {
	
	@Id
	@Column(name = "user_id")
	private String	 userId;
	
	
	@Column(name = "user_name")
	private String	 userName;
	
	
	@Column(name = "user_pass")
	private String	 userPass;
	
	
	@Column(name = "user_level")
	private String	 userLevel;
	
	
	@Column(name = "zone_code")
	private String	 zoneCode;
	
	
	
	@Column(name = "user_location")
	private String	 userLocation;
	
	
	@Column(name = "user_sessionid")
	private int	 userSessionId;
	
	
	@Column(name = "last_login_date")
	private Date lastLoginDate;
	
	
	
	@Column(name = "last_txn_date")
	private Date lastTxnDate;
	
	
	
	@Column(name = "user_status")
	private int userStatus;

	
	@Column(name = "valid_from")
	private Date validFrom;
	
	
	@Column(name = "valid_upto")
	private Date validUpto;
	
	@Column(name = "define_date")
	private Date defineDate;
	
	@Column(name = "define_by")
	private String defineBy;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name = "last_modified_by")
	private String lastModifiedBy;
	
	
	
	
}
