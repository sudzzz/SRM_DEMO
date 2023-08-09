package com.example.demosrm.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "LOGIN_DETAIL")
public class LoginDetail {
	
	
	  @EmbeddedId
	    private LoginPk id;

	  
	   @Embeddable
	   public static class LoginPk implements Serializable {
		   
			@Column(name = "user_id")
			private String  userId;
			
			@Column(name = "user_session_id")
			private int  userSessionId;
	   }


	
	
	@Column(name = "zone_code")
	private String  zoneCode;


	
	@Column(name = "user_level")
	private String  userLevel;
	
	@Column(name = "user_location")
	private String  userLocation;

	@Column(name = "login_time")
	private Date  loginTime;
	
	@Column(name = "logout_time")
	private Date  logoutTime;

	@Column(name = "last_txn_time")
	private Date  lastTxnTime;
	
	
}

