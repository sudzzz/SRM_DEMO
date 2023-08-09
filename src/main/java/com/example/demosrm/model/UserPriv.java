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
@Table(name = "USER_PRIV")
public class UserPriv {

	 @EmbeddedId
	    private UserprivPk id;

	  
	   @Embeddable
	   public static class UserprivPk implements Serializable {

			@Column(name = "user_id" ,length= 24)
			private String	 userId;
			
			
			@Column(name = "previlege" ,length= 24)
			private String	 previlege;
			
			@Column(name = "sub_previlege",length= 24)
			private String	 subPrevilege;
			

	   }
	

	
	@Column(name = "zone_code")
	private String	 zoneCode;

	
	@Column(name = "valid_from")
	private Date	 validFrom;
	
	@Column(name = "valid_upto")
	private Date	 validUpto;
	
	@Column(name = "last_modified_date")
	private Date	lastModifiedDate;
	
	@Column(name = "last_modified_by")
	private String	lastModifiedBy;
	
	
}
